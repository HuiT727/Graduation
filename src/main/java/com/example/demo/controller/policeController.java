package com.example.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Audience;
import com.example.demo.entity.CommonEntity;
import com.example.demo.entity.Policeinfo;
import com.example.demo.entity.Userinfo;
import com.example.demo.service.PoliceService;
import com.example.demo.service.UserService;
import com.example.demo.serviceimp.testService;
import com.example.demo.util.JwtIgnore;
import com.example.demo.util.JwtTokenUtil;
import com.mathworks.toolbox.javabuilder.MWException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
@Slf4j
public class policeController {
    @Autowired
    private Audience audience;
    @Resource
    private testService testService;
    @Resource
    private PoliceService policeService;
    @Resource
    private UserService userService;

    @GetMapping("/police/info")
    public JSONObject getPoliceInfo(HttpServletRequest request){
        String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY).substring(7);
        log.info("token={}",token);
        //    String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiYWRtaW4iLCJ1c2VySWQiOiIxIiwic3ViIjoiemhhbmdzYW4iLCJpc3MiOiIwOThmNmJjZDQ2MjFkMzczY2FkZTRlODMyNjI3YjRmNiIsImlhdCI6MTU4Njc5NjUwMywiYXVkIjoiSHVpVCIsImV4cCI6MTU4Njc5NjY3NSwibmJmIjoxNTg2Nzk2NTAzfQ.a0ZnjelL9Ex-spGREXSrlbwlnwArXV-R_L07G3dTvwg";
        String userId = JwtTokenUtil.getUserId(token,audience.getBase64Secret());
        log.info("userId={}",userId);
        Integer id = Integer.valueOf(userId);
        log.info("id={}",id);
        Policeinfo policeinfo = policeService.getPoliceById(id);
        JSONObject result = new JSONObject();
        CommonEntity commonEntity = new CommonEntity(policeinfo);
        result.put("police",commonEntity);
        return result;
    }


    @JwtIgnore
    @PostMapping("/police/detect")
    public JSONObject testDetect(MultipartFile file){

        JSONObject result = new JSONObject();
        if(file.isEmpty()){
            result.put("message","文件不能为空");
            result.put("code",500);
            return result;
        }
        String detectMsg = null;
        String filePath ="/usr/pngs/"+file.getOriginalFilename();
        log.info("#######程序开始#######");
        try{
            file.transferTo(new File(filePath));
            log.info("#######程序上传成功#######");
            result.put("code",200);
        }catch (IllegalStateException e){
            result.put("message","上传失败");
            result.put("code",500);
            e.printStackTrace();
            return result;
        }catch (IOException e){
            result.put("message","上传失败");
            result.put("code",500);
            e.printStackTrace();
            return result;
        }

        try {
            log.info("#######开始解密#######");
            detectMsg = testService.test(filePath);
            log.info("#######解密成功#######");
            result.put("code",200);
        }catch (MWException e){
            e.printStackTrace();
            result.put("message","解密失败");
            log.info("#######解密失败#######");
            result.put("code",500);
            return result;
        }
        /*
        String[] string = detectMsg.split(",");
        String time = string[1];
        */
        String[] huiT = detectMsg.split(",");

        String userId = huiT[0];
        String time = huiT[1];
        log.info("#############userId={}############",userId);
        log.info("#############time={}############",time);
        Userinfo user = userService.getUserById(Integer.valueOf(userId));
        CommonEntity commonEntity = new CommonEntity(user);
        log.info("#########user={}############",user);
    //    log.info("########time={}##########",time);
        result.put("user",commonEntity);
      //  result.put("time",time);
        result.put("Result",detectMsg);
        result.put("time",time);
        return result;
    }

    @PutMapping("/police/info")
    public JSONObject updatePoliceInfo(HttpServletRequest request,@RequestBody JSONObject json){
        String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY).substring(7);
        log.info("token={}",token);
        //    String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiYWRtaW4iLCJ1c2VySWQiOiIxIiwic3ViIjoiemhhbmdzYW4iLCJpc3MiOiIwOThmNmJjZDQ2MjFkMzczY2FkZTRlODMyNjI3YjRmNiIsImlhdCI6MTU4Njc5NjUwMywiYXVkIjoiSHVpVCIsImV4cCI6MTU4Njc5NjY3NSwibmJmIjoxNTg2Nzk2NTAzfQ.a0ZnjelL9Ex-spGREXSrlbwlnwArXV-R_L07G3dTvwg";
        String userId = JwtTokenUtil.getUserId(token,audience.getBase64Secret());
        log.info("userId={}",userId);
        Integer id = Integer.valueOf(userId);
        log.info("id={}",id);
        JSONObject result = new JSONObject();
        String username = json.getString("username");
        String password = json.getString("password");
        String cardNumber = json.getString("cardNumber");
        String tel = json.getString("tel");
        String sex = json.getString("sex");
        String name = json.getString("name");
        log.info("## username={}",username);
        log.info("## password={}",password);
        log.info("## cardNumber={}",cardNumber);
        log.info("## tel={}",tel);
        log.info("## sex={}",sex);
        log.info("## name={}",name);

        Policeinfo police = new Policeinfo(username,password,name,tel,sex,cardNumber);
        police.setPoliceId(Integer.valueOf(id));
        int i = policeService.updatePolice(police);
        if(i==1){
            result.put("message","police更新成功");
            result.put("code",200);
        }else {
            result.put("message", "police更新失败");
            result.put("code", 500);
        }
        return result;
    }
}
