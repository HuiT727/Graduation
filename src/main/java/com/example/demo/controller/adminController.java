package com.example.demo.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.*;
import com.example.demo.service.ContractService;
import com.example.demo.service.EnterpriseService;
import com.example.demo.service.PoliceService;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class adminController {

    @Resource
    private EnterpriseService enterpriseService;
    @Resource
    private UserService userService;
    @Resource
    private PoliceService policeService;
    @Resource
    private ContractService contractService;

    //TODO 讨论先展示什么字段
    @GetMapping("/admin/enterprise")
    public JSONObject getEnterprise(){
        List<Enterpriseinfo> list = enterpriseService.allEnterprise();
        JSONObject result = new JSONObject();
        List<CommonEntity> commonEntities = new ArrayList<CommonEntity>();
        for (Enterpriseinfo emun:list
             ) {
            CommonEntity commonEntity = new CommonEntity(emun);
            commonEntities.add(commonEntity);
        }
        result.put("enterpriseList",commonEntities);
        return result;
    }

    //TODO
    @PostMapping("/admin/enterprise")
    public JSONObject addEnterprise(@RequestBody JSONObject json){
        JSONObject result = new JSONObject();
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
            result.put("message","enterprise添加成功");
            result.put("code",200);
        }else {
            result.put("message", "enterprise添加失败");
            result.put("code", 500);
        }
        return result;
    }

    //TODO
    @PutMapping("/admin/enterprise/{id}")
    public JSONObject updateEnterprise(@PathVariable("id")Integer id,@RequestBody JSONObject json){
        JSONObject result = new JSONObject();
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
        enterprise.setEnterpriseId(id);
        int i = enterpriseService.updateEnterprise(enterprise);
        if(i==1){
            result.put("message","更新成功");
            result.put("code",200);
        }else{
            result.put("message","更新失败");
            result.put("code",500);
        }
        return result;
    }

    @GetMapping("/admin/enterprise/{id}")
    public JSONObject getEnterpriseById(@PathVariable("id")Integer id,@RequestBody JSONObject json){
        JSONObject result = new JSONObject();
        log.info("#######id={}######",id);
        Enterpriseinfo enterprise = enterpriseService.getEnterpriseById(id);
        CommonEntity commonEntity = new CommonEntity(enterprise);
        result.put("enterprise",commonEntity);
        return result;
    }

    @GetMapping("/admin/user")
    public JSONObject getAllUser(){
        List<Userinfo> userlist = userService.allUser();
        JSONObject result = new JSONObject();
        List<CommonEntity> commonEntities = new ArrayList<CommonEntity>();
        for (Userinfo emun:
             userlist) {
            CommonEntity commonEntity =new CommonEntity(emun);
            commonEntities.add(commonEntity);
        }
        result.put("userList",commonEntities);
        return result;
    }

    @PostMapping("/admin/user")
    public JSONObject addUser(@RequestBody JSONObject json)
    {
        JSONObject result = new JSONObject();
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
            result.put("message","添加成功");
            result.put("code",200);
        }else {
            result.put("message", "添加失败");
            result.put("code", 500);
        }
        return result;

    }

    @PutMapping("/admin/user/{id}")
    public JSONObject updateUserById(@PathVariable("id")Integer id,@RequestBody JSONObject json){
        JSONObject result = new JSONObject();
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
        if (i==1){
            result.put("message","更新成功");
            result.put("code",200);
        }else{
            result.put("message","更新失败");
            result.put("code",500);
        }
        return result;
    }

    @GetMapping("/admin/user/{id}")
    public JSONObject getUserById(@PathVariable("id")Integer id){
        JSONObject result = new JSONObject();
        Userinfo user = userService.getUserById(id);
        CommonEntity commonEntity = new CommonEntity(user);
        result.put("user",commonEntity);
        return  result;
    }

    @DeleteMapping("/admin/user/{id}")
    public JSONObject deleteUserById(@PathVariable("id")Integer id){
        JSONObject result = new JSONObject();
        int i = userService.deleteUserById(id);
        if (i==1){
            result.put("message","删除成功");
            result.put("code",200);
        }else{
            result.put("message","删除失败");
            result.put("code",500);
        }
        return result;
    }

    @GetMapping("/admin/police")
    public JSONObject getAllPolice(){
        List<Policeinfo> policeList = policeService.allPolice();
        JSONObject result = new JSONObject();
        List<CommonEntity> commonEntities = new ArrayList<CommonEntity>();
        for (Policeinfo police:policeList
             ) {
            CommonEntity commonEntity = new CommonEntity(police);
            commonEntities.add(commonEntity);
        }
        result.put("policeList",commonEntities);
        return result;
    }

    @GetMapping("/admin/police/{id}")
    public JSONObject getPoliceById(@PathVariable("id")Integer id){
        JSONObject result = new JSONObject();
        Policeinfo police =  policeService.getPoliceById(id);
        CommonEntity commonEntity = new CommonEntity(police);
        result.put("police",commonEntity);
        return result;
    }

    @PostMapping("/admin/police")
    public JSONObject addPoliceById(@RequestBody JSONObject json){
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
        int i = policeService.reg(police);
        if(i==1){
            result.put("message","police添加成功");
            result.put("code",200);
        }else {
            result.put("message", "police添加失败");
            result.put("code", 500);
        }
        return result;

    }

    @PutMapping("/admin/police/{id}")
    public JSONObject updatePoliceById(@PathVariable("id")Integer id,@RequestBody JSONObject json)
    {
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
        log.info("## id={}",id);
        Policeinfo police = new Policeinfo(username,password,name,tel,sex,cardNumber);
        police.setPoliceId(id);
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

    @DeleteMapping("/admin/police/{id}")
    public JSONObject deletePoliceById(@PathVariable("id")Integer id){
        JSONObject result = new JSONObject();
        int i = policeService.deletePolice(id);
        if (i==1){
            result.put("message","删除成功");
            result.put("code",200);
        }else{
            result.put("message","删除失败");
            result.put("code",500);
        }
        return result;

    }

    @GetMapping("/admin/contract")
    public JSONObject getContract(){
        List<Contractinfo> list = contractService.getAllContract();
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

    @GetMapping("/admin/contract/{id}")
    public JSONObject getContractById(@PathVariable("id")Integer id){
        List<Contractinfo> contractinfos = contractService.getContractinfoById(id);
        Contractinfo contractinfo = contractinfos.get(0);
        JSONObject result = new JSONObject();
        CommonEntity commonEntity = new CommonEntity(contractinfo);
        result.put("contract",commonEntity);
        return result;
    }

    @DeleteMapping("/admin/contract/{id}")
    public JSONObject deleteContractById(@PathVariable("id")Integer id){
        int i = contractService.deleteContractById(id);
        JSONObject result = new JSONObject();
        if (i==1){
            result.put("message","删除成功");
            result.put("code",200);
        }else{
            result.put("message","删除失败");
            result.put("code",500);
        }
        return result;
    }
}
