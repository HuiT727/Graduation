package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.common.CommonResult;
import com.example.demo.entity.*;
import com.example.demo.service.AdminService;
import com.example.demo.service.EnterpriseService;
import com.example.demo.service.PoliceService;
import com.example.demo.service.UserService;
import com.example.demo.util.JwtIgnore;
import com.example.demo.util.JwtTokenUtil;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.jsonwebtoken.Jwt;
import io.swagger.annotations.Authorization;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

@Slf4j
@RestController
public class LoginRegController {
    @Autowired
    private Audience audience;
    @Resource
    private EnterpriseService enterpriseService;
    @Resource
    private AdminService adminService;
    @Resource
    private UserService userService;
    @Resource
    private PoliceService policeService;

    @CrossOrigin
    @JwtIgnore
    @PostMapping(value = "/login")
    public JSONObject login(HttpServletResponse response,@RequestBody JSONObject json){
        String userType = json.getString("userType");
        String account = json.getString("username");
        String  pwd = json.getString("password");
        log.info("## userType={}",userType);
        log.info("## username={}",account);
        log.info("## pwd={}",pwd);
        JSONObject result = new JSONObject();
        String token ="";
        String role = "";
        if(userType.equals("police")){
            List<Policeinfo> policeinfoList =  policeService.login(account,pwd);
            if(policeinfoList.isEmpty()){
               result.put("message","登录失败");
               result.put("code",500);
                log.info("没有此police用户");
            }else{
                Policeinfo police = policeinfoList.get(0);
                role = "police";
                token = JwtTokenUtil.createJWT(String.valueOf(police.getPoliceId()),police.getPoliceAccount(),role,audience);
                response.setHeader(JwtTokenUtil.AUTH_HEADER_KEY,JwtTokenUtil.TOKEN_PREFIX+token);

                result.put("message","登陆成功");
                result.put("code",200);
            }
        }else if(userType.equals("admin")){
            List<Admininfo> admininfoList = adminService.login(account,pwd);
            if(admininfoList.isEmpty()||admininfoList.size()==0){
                result.put("message","登录失败");
                result.put("code",500);
                log.info("没有此admin用户");
            }else{
                Admininfo admin = admininfoList.get(0);
                role = "admin";
                token = JwtTokenUtil.createJWT(String.valueOf(admin.getAdminId()),account,role,audience);
                response.setHeader(JwtTokenUtil.AUTH_HEADER_KEY,JwtTokenUtil.TOKEN_PREFIX+token);
                result.put("message","登陆成功");
                result.put("code",200);

            }
        }else if(userType.equals("user")){
            Userinfo user = new Userinfo(account,pwd);
            List<Userinfo> userinfoList = userService.admin(user);
            if(userinfoList.isEmpty()){
                result.put("message","登录失败");
                result.put("code",500);
                log.info("没有此user用户");
            }else{
                Userinfo userto = userinfoList.get(0);
                role = "user";
                token = JwtTokenUtil.createJWT(String.valueOf(userto.getUserId()),account,role,audience);
                response.setHeader(JwtTokenUtil.AUTH_HEADER_KEY,JwtTokenUtil.TOKEN_PREFIX+token);
                result.put("message","登陆成功");
                result.put("code",200);

            }
        }else if(userType.equals("enterprise")){
            Enterpriseinfo enterprise = new Enterpriseinfo(account,pwd);
            List<Enterpriseinfo> enterpriseinfoList = enterpriseService.login(enterprise);
            if(enterpriseinfoList.isEmpty()){
                result.put("message","登录失败");
                result.put("code",500);
                log.info("没有此enterprise用户");
            }else{
                Enterpriseinfo enterpriseto = enterpriseinfoList.get(0);
                role = "enterprise";
                token = JwtTokenUtil.createJWT(String.valueOf(enterpriseto.getEnterpriseId()),account,role,audience);
                response.setHeader(JwtTokenUtil.AUTH_HEADER_KEY,JwtTokenUtil.TOKEN_PREFIX+token);
                result.put("message","登陆成功");
                result.put("code",200);

            }
        }
        return result;
    }

    @CrossOrigin
    @JwtIgnore
    @PostMapping("/register")
    public JSONObject register(@RequestBody JSONObject json){
        String userType = json.getString("userType");
        JSONObject result = new JSONObject();
        log.info("## userType={}",userType);
        MultipartFile file = (MultipartFile)json.get("file");
        if(userType.equals("user")){
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
            int i = userService.reg(user);
            if(i==1){
                result.put("message","注册成功");
                result.put("code",200);
            }else {
                result.put("message", "注册失败");
                result.put("code", 500);
            }
            return result;
        }else if(userType.equals("enterprise")){
            String name = json.getString("name");
            String username = json.getString("username");
            String password = json.getString("password");
            String email = json.getString("email");
            String address = json.getString("address");
            String legalPerson = json.getString("legalPerson");
            String tel = json.getString("tel");
            String cardNumber = json.getString("cardNumber");
            log.info("## name={}",name);
            log.info("## username={}",username);
            log.info("## password={}",password);
            log.info("## email={}",email);
            log.info("## address={}",address);
            log.info("## legalPerson={}",legalPerson);
            log.info("## cardNumber={}",cardNumber);
            log.info("## tel={}",tel);
            Enterpriseinfo enterprise = new Enterpriseinfo(name,username,password,cardNumber,legalPerson,tel,address,email);
            int i = enterpriseService.reg(enterprise);
            if(i==1){
                result.put("message","enterprise注册成功");
                result.put("code",200);
            }else {
                result.put("message", "enterprise注册失败");
                result.put("code", 500);
            }
            return result;
        }else if(userType.equals("police")){
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
            int i = policeService.reg(police);
            if(i==1){
                result.put("message","police注册成功");
                result.put("code",200);
            }else {
                result.put("message", "police注册失败");
                result.put("code", 500);
            }
            return result;
        }else{
            result.put("message", "数据出错，注册失败");
            result.put("code", 500);
            log.info("数据出错");
            return result;

        }

    }

    @CrossOrigin
    @JwtIgnore
    @GetMapping(value = "/getAllEnterprise")
    public JSONObject getAllEnterprise(){
        List<Enterpriseinfo> list = enterpriseService.allEnterprise();
        JSONObject result = new JSONObject();
        for (Enterpriseinfo emun :list) {
            result.put(String.valueOf(emun.getEnterpriseId()),emun.getEnterpriseName());
        }
        return result;

    }
}
