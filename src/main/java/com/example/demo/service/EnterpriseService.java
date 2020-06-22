package com.example.demo.service;

import com.example.demo.entity.Enterpriseinfo;
import org.omg.CORBA.INTERNAL;

import java.util.Date;
import java.util.List;

public interface EnterpriseService {

    //注册
    public int reg(Enterpriseinfo enterpriseinfo);

    //登录
    public List<Enterpriseinfo> login(Enterpriseinfo enterprise);

    //修改用户
    public int updateEnterprise(Enterpriseinfo enterprise);

    //根据id删除用户
    public int deleteEnterpriseById(Integer enterpriseId);

    //根据id查询用户
    public Enterpriseinfo getEnterpriseById(Integer enterpriseId);

    //用户签订合同
    public int ConnectContract(String contractName, Integer enterpriseId, Date contractTime, String contractMsg, String contractFile, Integer contractPage);

    public List<Enterpriseinfo> allEnterprise();


}