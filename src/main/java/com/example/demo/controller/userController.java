package com.example.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.*;
import com.example.demo.service.ContractService;
import com.example.demo.service.PrintingService;
import com.example.demo.service.UserService;
import com.example.demo.service.embedService;
import com.example.demo.util.JwtTokenUtil;
import com.mathworks.toolbox.javabuilder.MWException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class userController {
    @Autowired
    private Audience audience;
    @Resource
    private UserService userService;
    @Resource
    private ContractService contractService;
    @Resource
    private embedService embedService;
    @Resource
    private PrintingService printingService;

    @GetMapping("/user/info")
    public JSONObject getUserInfo(HttpServletRequest request){
        String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY).substring(7);
        log.info("token={}",token);
        //    String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiYWRtaW4iLCJ1c2VySWQiOiIxIiwic3ViIjoiemhhbmdzYW4iLCJpc3MiOiIwOThmNmJjZDQ2MjFkMzczY2FkZTRlODMyNjI3YjRmNiIsImlhdCI6MTU4Njc5NjUwMywiYXVkIjoiSHVpVCIsImV4cCI6MTU4Njc5NjY3NSwibmJmIjoxNTg2Nzk2NTAzfQ.a0ZnjelL9Ex-spGREXSrlbwlnwArXV-R_L07G3dTvwg";
        String userId = JwtTokenUtil.getUserId(token,audience.getBase64Secret());
        log.info("userId={}",userId);
        Integer id = Integer.valueOf(userId);
        log.info("id={}",id);
        Userinfo user = userService.getUserById(id);
        CommonEntity commonEntity = new CommonEntity(user);
        JSONObject result = new JSONObject();
        result.put("user",commonEntity);
        return result;
    }

    @GetMapping("/user/contract")
    public JSONObject getContract(HttpServletRequest request){
        String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY).substring(7);
        log.info("token={}",token);
        //    String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiYWRtaW4iLCJ1c2VySWQiOiIxIiwic3ViIjoiemhhbmdzYW4iLCJpc3MiOiIwOThmNmJjZDQ2MjFkMzczY2FkZTRlODMyNjI3YjRmNiIsImlhdCI6MTU4Njc5NjUwMywiYXVkIjoiSHVpVCIsImV4cCI6MTU4Njc5NjY3NSwibmJmIjoxNTg2Nzk2NTAzfQ.a0ZnjelL9Ex-spGREXSrlbwlnwArXV-R_L07G3dTvwg";
        String userId = JwtTokenUtil.getUserId(token,audience.getBase64Secret());
        log.info("userId={}",userId);
        Integer id = Integer.valueOf(userId);
        log.info("id={}",id);
        Userinfo user = userService.getUserById(id);
        Integer enterpriseId = user.getEnterpriseId();
        log.info("enterpriseId={}",enterpriseId);
        List<Contractinfo> list = contractService.getContractinfoByEnterpriseId(enterpriseId);
        JSONObject result = new JSONObject();
        List<CommonEntity> commonEntities = new ArrayList<>();
        for (Contractinfo contract:list
             ) {
            CommonEntity commonEntity = new CommonEntity(contract);
            commonEntities.add(commonEntity);
        }
        result.put("contractList",commonEntities);
        return result;
    }



    @PutMapping("/user/info")
    public JSONObject updateUser(@RequestBody JSONObject json,HttpServletRequest request){
        String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY).substring(7);
        log.info("token={}",token);
        //    String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiYWRtaW4iLCJ1c2VySWQiOiIxIiwic3ViIjoiemhhbmdzYW4iLCJpc3MiOiIwOThmNmJjZDQ2MjFkMzczY2FkZTRlODMyNjI3YjRmNiIsImlhdCI6MTU4Njc5NjUwMywiYXVkIjoiSHVpVCIsImV4cCI6MTU4Njc5NjY3NSwibmJmIjoxNTg2Nzk2NTAzfQ.a0ZnjelL9Ex-spGREXSrlbwlnwArXV-R_L07G3dTvwg";
        String userId = JwtTokenUtil.getUserId(token,audience.getBase64Secret());
        log.info("userId={}",userId);
        Integer id = Integer.valueOf(userId);

        String name = json.getString("name");
        Integer enterpriseId = json.getInteger("enterpriseId");
        String username = json.getString("username");
        String password = json.getString("password");
        String sex = json.getString("sex");
        String tel = json.getString("tel");
        String cardNumber = json.getString("cardNumber");
        log.info("## name={}",name);
        log.info("## enterpriseId={}",enterpriseId);
        log.info("## username={}",username);
        log.info("## password={}",password);
        log.info("## sex={}",sex);
        log.info("## tel={}",tel);
        log.info("## cardNumber={}",cardNumber);
        Userinfo user = new Userinfo(name,enterpriseId,username,password,sex,tel,cardNumber);
        user.setUserId(id);
        int i = userService.updateUser(user);
        JSONObject result = new JSONObject();
        if(i==1){
            result.put("message","user更新成功");
            result.put("code",200);
        }else {
            result.put("message", "user更新失败");
            result.put("code", 500);
        }
        return result;
    }

    @GetMapping("/user/download/{id}")
    public JSONObject downloadFile(@PathVariable Integer id, HttpServletRequest request,HttpServletResponse response) throws  MWException {
        String path = contractService.getContractFileByid(id);
        String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY).substring(7);
        log.info("token={}",token);
        //    String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiYWRtaW4iLCJ1c2VySWQiOiIxIiwic3ViIjoiemhhbmdzYW4iLCJpc3MiOiIwOThmNmJjZDQ2MjFkMzczY2FkZTRlODMyNjI3YjRmNiIsImlhdCI6MTU4Njc5NjUwMywiYXVkIjoiSHVpVCIsImV4cCI6MTU4Njc5NjY3NSwibmJmIjoxNTg2Nzk2NTAzfQ.a0ZnjelL9Ex-spGREXSrlbwlnwArXV-R_L07G3dTvwg";
        String userId = JwtTokenUtil.getUserId(token,audience.getBase64Secret());
        log.info("userId={}",userId);
        Integer userid = Integer.valueOf(userId);
        JSONObject result = new JSONObject();
        result.put("message","下载失败");
        result.put("code",500);
        /*通过id得出地址，根据地址加密得出新的地址，根据新的地址下载给用户，
        然后把新的地址添加至printing，再把contract里的数+1
         */
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ;
        Date date = new Date();
        String time = simpleDateFormat.format(date);
        Date currentDate = new java.sql.Date(System.currentTimeMillis());
        String testMsg = userId+","+currentDate.toString();
        // 用户id+，+当前时间


        String toFile = "/usr/enterpriseFile/"+userId+time+".png";
        try{
            embedService.embeddingFile(testMsg,path,toFile);
        }catch (MWException e){
            e.printStackTrace();
        }
        File file = new File(toFile);
        if(file.exists()){
            byte[] buffer = new byte[1024];
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            try{
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                OutputStream os = response.getOutputStream();
                int i = bis.read(buffer);
                while(i!=-1){
                    os.write(buffer,0,i);
                    i = bis.read(buffer);
                }
                result.put("message","下载成功");
                result.put("code",200);
                log.info("#########下载成功#######");
            }catch(Exception e){
                e.printStackTrace();
            }finally {
                if(bis != null){
                    try {
                        bis.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
                if(fis!=null){
                    try{
                        fis.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        Integer number = contractService.getContractNumberByContractId(id);
        Printinginfo printinginfo = new Printinginfo(id,number+1,date,testMsg+time,userid);
        int i = printingService.addPrinting(printinginfo);
        int j = contractService.addContractNum(id);
        return result;
    }

    @GetMapping("/user/downloads/{id}")
    public JSONObject downloadsFile(@PathVariable Integer id, HttpServletRequest request,HttpServletResponse response) throws  MWException {
        String path = contractService.getContractFileByid(id);
        String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY).substring(7);
        log.info("token={}",token);
        //    String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiYWRtaW4iLCJ1c2VySWQiOiIxIiwic3ViIjoiemhhbmdzYW4iLCJpc3MiOiIwOThmNmJjZDQ2MjFkMzczY2FkZTRlODMyNjI3YjRmNiIsImlhdCI6MTU4Njc5NjUwMywiYXVkIjoiSHVpVCIsImV4cCI6MTU4Njc5NjY3NSwibmJmIjoxNTg2Nzk2NTAzfQ.a0ZnjelL9Ex-spGREXSrlbwlnwArXV-R_L07G3dTvwg";
        String userId = JwtTokenUtil.getUserId(token,audience.getBase64Secret());
        log.info("userId={}",userId);
        Integer userid = Integer.valueOf(userId);
        JSONObject result = new JSONObject();
        result.put("message","下载失败");
        result.put("code",500);
        File file = new File(path);


       if(file.exists()){
            byte[] buffer = new byte[1024];
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            try{
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                OutputStream os = response.getOutputStream();
                int i = bis.read(buffer);
                while(i!=-1){
                    os.write(buffer,0,i);
                    i = bis.read(buffer);
                }
                result.put("message","下载成功");
                result.put("code",200);
                log.info("#########下载成功#######");
            }catch(Exception e){
                e.printStackTrace();
            }finally {
                if(bis != null){
                    try {
                        bis.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
                if(fis!=null){
                    try{
                        fis.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }

        return result;
    }
}
