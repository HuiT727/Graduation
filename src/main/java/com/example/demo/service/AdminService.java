package com.example.demo.service;

import com.example.demo.entity.Admininfo;

import java.util.List;

public interface AdminService {
    public List<Admininfo> login(String adminAccount, String adminPwd);

    public int updatePwd(String adminAccount,String adminPwd);
}
