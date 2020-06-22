package com.example.demo.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.*;
import com.example.demo.service.ContractService;
import com.example.demo.service.EnterpriseService;
import com.example.demo.service.UserService;
import com.example.demo.util.JwtTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class enterpriseController {
    @Autowired
    private Audience audience;
    @Resource
    private EnterpriseService enterpriseService;
    @Resource
    private UserService userService;
    @Resource
    private ContractService contractService;

    @GetMapping("/enterprise/info")
    public JSONObject GetEnterpriseInfo(HttpServletRequest request){
        String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY).substring(7);
        log.info("token={}",token);
        //    String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiYWRtaW4iLCJ1c2VySWQiOiIxIiwic3ViIjoiemhhbmdzYW4iLCJpc3MiOiIwOThmNmJjZDQ2MjFkMzczY2FkZTRlODMyNjI3YjRmNiIsImlhdCI6MTU4Njc5NjUwMywiYXVkIjoiSHVpVCIsImV4cCI6MTU4Njc5NjY3NSwibmJmIjoxNTg2Nzk2NTAzfQ.a0ZnjelL9Ex-spGREXSrlbwlnwArXV-R_L07G3dTvwg";
        String userId = JwtTokenUtil.getUserId(token,audience.getBase64Secret());
        log.info("userId={}",userId);
        Integer EnterpriseId = Integer.valueOf(userId);
        log.info("EnterpriseId={}",EnterpriseId);
        Enterpriseinfo enterpriseinfo = enterpriseService.getEnterpriseById(EnterpriseId);
        JSONObject result = new JSONObject();
        CommonEntity commonEntity = new CommonEntity(enterpriseinfo);
        result.put("enterprise",commonEntity);
        return result;
    }

    @PutMapping("/enterprise/info")
    public JSONObject updateEnterpriseInfo(HttpServletRequest request,@RequestBody JSONObject json){
        String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY).substring(7);
        log.info("token={}",token);
        //    String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiYWRtaW4iLCJ1c2VySWQiOiIxIiwic3ViIjoiemhhbmdzYW4iLCJpc3MiOiIwOThmNmJjZDQ2MjFkMzczY2FkZTRlODMyNjI3YjRmNiIsImlhdCI6MTU4Njc5NjUwMywiYXVkIjoiSHVpVCIsImV4cCI6MTU4Njc5NjY3NSwibmJmIjoxNTg2Nzk2NTAzfQ.a0ZnjelL9Ex-spGREXSrlbwlnwArXV-R_L07G3dTvwg";
        String userId = JwtTokenUtil.getUserId(token,audience.getBase64Secret());
        log.info("userId={}",userId);
        Integer EnterpriseId = Integer.valueOf(userId);
        log.info("EnterpriseId={}",EnterpriseId);
        String name = json.getString("name");
        String username = json.getString("username");
        String password = json.getString("password");
        String email = json.getString("email");
        String address = json.getString("address");
        String legalPerson = json.getString("legalPerson");
        String tel = json.getString("tel");
        String cardNumber = json.getString("cardNumber");
        String  id = json.getString("id");
        log.info("## name={}",name);
        log.info("## username={}",username);
        log.info("## password={}",password);
        log.info("## email={}",email);
        log.info("## address={}",address);
        log.info("## legalPerson={}",legalPerson);
        log.info("## cardNumber={}",cardNumber);
        log.info("## tel={}",tel);
        Enterpriseinfo enterprise = new Enterpriseinfo(name,username,password,cardNumber,legalPerson,tel,address,email);
        enterprise.setEnterpriseId(EnterpriseId);
        int i = enterpriseService.updateEnterprise(enterprise);
        JSONObject result = new JSONObject();
        if(i==1){
            result.put("message","police更新成功");
            result.put("code",200);
        }else {
            result.put("message", "police更新失败");
            result.put("code", 500);
        }
        return result;

    }

    @GetMapping("/enterprise/user")
    public JSONObject getEnterpriseUserByEnterpriseId(HttpServletRequest request){
        String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY).substring(7);
        log.info("token={}",token);
        String userId = JwtTokenUtil.getUserId(token,audience.getBase64Secret());
        log.info("userId={}",userId);
        Integer EnterpriseId = Integer.valueOf(userId);
        log.info("EnterpriseId={}",EnterpriseId);
        List<Userinfo> userinfos = userService.getUserByEnterpriseId(EnterpriseId);
        List<CommonEntity> commonEntities = new ArrayList<>();
        for (Userinfo user:userinfos) {
            CommonEntity commonEntity = new CommonEntity(user);
            commonEntities.add(commonEntity);
        }
        JSONObject result = new JSONObject();
        result.put("userList",commonEntities);
        return result;
    }

    @GetMapping("/enterprise/user/{userId}")
    public JSONObject getUserById(@PathVariable Integer userId,HttpServletRequest request){
        String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY).substring(7);
        log.info("token={}",token);
        String userid = JwtTokenUtil.getUserId(token,audience.getBase64Secret());
        log.info("userId={}",userid);
        Integer EnterpriseId = Integer.valueOf(userid);
        Integer id = userService.getIdByUserIdAndEnterpriseId(EnterpriseId,userId);
        log.info("############id={}########",id);
        Userinfo user = userService.getUserById(id);
        JSONObject result = new JSONObject();
        CommonEntity commonEntity = new CommonEntity(user);
        result.put("user",commonEntity);
        return  result;
    }

    @PostMapping("/enterprise/user")
    public JSONObject addUser(HttpServletRequest request,@RequestBody JSONObject json){
        String name = json.getString("name");

        String username = json.getString("username");
        String password = json.getString("password");
        String sex = json.getString("sex");
        String tel = json.getString("tel");
        String cardNumber = json.getString("cardNumber");


        log.info("## name={}",name);

        log.info("## username={}",username);
        log.info("## password={}",password);
        log.info("## sex={}",sex);
        log.info("## tel={}",tel);
        log.info("## cardNumber={}",cardNumber);

        String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY).substring(7);
        log.info("token={}",token);
        String userId = JwtTokenUtil.getUserId(token,audience.getBase64Secret());
        log.info("userId={}",userId);
        Integer EnterpriseId = Integer.valueOf(userId);
        log.info("EnterpriseId={}",EnterpriseId);
        Userinfo user = new Userinfo(name,EnterpriseId,username,password,sex,tel,cardNumber);
        int i = userService.reg(user);
        JSONObject result = new JSONObject();
        if(i==1){
            result.put("message","添加成功");
            result.put("code",200);
        }else {
            result.put("message", "添加失败");
            result.put("code", 500);
        }
        return result;


    }

    @DeleteMapping("/enterprise/user/{userId}")
    public JSONObject deleteUserById(HttpServletRequest request,@PathVariable Integer userId){
      //  userId enterpriseId 查询id再进行删除。
        String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY).substring(7);
        log.info("token={}",token);
        String userid = JwtTokenUtil.getUserId(token,audience.getBase64Secret());
        log.info("userId={}",userid);
        Integer EnterpriseId = Integer.valueOf(userid);
        Integer id = userService.getIdByUserIdAndEnterpriseId(EnterpriseId,userId);
        log.info("############id={}########",id);
        int i = userService.deleteUserById(id);
        JSONObject result = new JSONObject();
        if(i==1){
            result.put("message","删除成功");
            result.put("code",200);
        }else {
            result.put("message", "删除失败");
            result.put("code", 500);
        }
        return result;
    }

    @PutMapping("/enterprise/user")
    public JSONObject updateUserById(@RequestBody JSONObject json,HttpServletRequest request){

        String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY).substring(7);
        log.info("token={}",token);
        String userid = JwtTokenUtil.getUserId(token,audience.getBase64Secret());
        Integer EnterpriseId = Integer.valueOf(userid);
        log.info("EnterpriseId={}",EnterpriseId);
        String userId = json.getString("userId");
        Integer id = userService.getIdByUserIdAndEnterpriseId(EnterpriseId,Integer.valueOf(userId));
        log.info("############id={}########",id);


        String name = json.getString("name");

        String username = json.getString("username");
        String password = json.getString("password");
        String sex = json.getString("sex");
        String tel = json.getString("tel");
        String cardNumber = json.getString("cardNumber");
        Userinfo user = new Userinfo(name,EnterpriseId,username,password,sex,tel,cardNumber);
        user.setUserId(id);
        log.info("## name={}",name);
        log.info("## username={}",username);
        log.info("## password={}",password);
        log.info("## sex={}",sex);
        log.info("## tel={}",tel);
        log.info("## cardNumber={}",cardNumber);
        int i = userService.updateUser(user);
        JSONObject result = new JSONObject();
        if(i==1){
            result.put("message","更新成功");
            result.put("code",200);
        }else {
            result.put("message", "更新失败");
            result.put("code", 500);
        }
        return result;
    }

    @GetMapping("/enterprise/contract")
    public JSONObject getContract(HttpServletRequest request){
        String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY).substring(7);
        log.info("token={}",token);
        String userId = JwtTokenUtil.getUserId(token,audience.getBase64Secret());
        log.info("userId={}",userId);
        Integer EnterpriseId = Integer.valueOf(userId);
        log.info("EnterpriseId={}",EnterpriseId);
        JSONObject result = new JSONObject();
        List<Contractinfo> contractinfos = contractService.getContractinfoByEnterpriseId(EnterpriseId);
        List<CommonEntity> commonEntities = new ArrayList<CommonEntity>();
        for (Contractinfo contract:contractinfos) {
            CommonEntity commonEntity = new CommonEntity(contract);
            commonEntities.add(commonEntity);
        }
        result.put("contractList",commonEntities);
        return result;
    }

    @PostMapping("/enterprise/sign")
    public JSONObject signContract(HttpServletRequest request,@RequestBody JSONObject json){
        String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY).substring(7);
        log.info("token={}",token);
        String userId = JwtTokenUtil.getUserId(token,audience.getBase64Secret());
        log.info("userId={}",userId);
        Integer EnterpriseId = Integer.valueOf(userId);
        log.info("EnterpriseId={}",EnterpriseId);
        JSONObject result = new JSONObject();
        String name = json.getString("name");
        ArrayList<String> enterpriseId = (ArrayList<String>) json.get("enterpriseId");
        log.info("###########enterpriseId={}######",enterpriseId);
        String fileLink = json.getString("fileLink");
        //读取文件，然后将文件上传到服务器，返回一个文件在服务器的路径

        Contractinfo contract = new Contractinfo(name,EnterpriseId,fileLink,0);
        boolean k =contractService.addContract(contract);
        for(String enterid:enterpriseId){
            Contractinfo contractinfo = new Contractinfo(name,Integer.valueOf(enterid),fileLink,0);
            boolean i = contractService.addContract(contractinfo);
            if(!i)
            {k = false; }
        }
        if(k){
            result.put("message","合同签订成功");
            result.put("code",200);
        }else{
            result.put("message","合同签订失败");
            result.put("code",500);
        }
        return result;
    }

    @PostMapping("/enterprise/upload")
    public JSONObject uploadContract(MultipartFile file){
        JSONObject result = new JSONObject();
        if(file.isEmpty()){
            result.put("message","文件不能为空");
            result.put("code",500);
            return result;
        }
        String filePath ="/usr/enterpriseFile/"+file.getOriginalFilename();

    //    String filePath = "D:\\project\\textwatermark\\img\\SpringBootTest\\"+file.getOriginalFilename();
        log.info("#######程序开始#######");
        try{
            file.transferTo(new File(filePath));
            result.put("fileLink",filePath);
            log.info("#######程序上传成功#######");
        }catch (IllegalStateException e){
            result.put("message","上传失败");
            e.printStackTrace();
            return result;
        }catch (IOException e){
            result.put("message","上传失败");
            e.printStackTrace();
            return result;
        }
             result.put("message","上传成功");
              result.put("code",200);
            return  result;

    }
}
