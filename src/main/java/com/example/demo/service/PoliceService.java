package com.example.demo.service;

import com.example.demo.entity.Policeinfo;

import java.util.List;

public interface PoliceService {
    public List<Policeinfo> login(String account, String pwd);

    public int insertPolice(String policeAccount, String policePwd, String policeName, String policePhone, String policeSex, String policeCard);

    public int deletePolice(Integer policeId);

    public List<Policeinfo> allPolice();

    public int reg(Policeinfo police);

    public Policeinfo getPoliceById(Integer id);

    public int updatePolice(Policeinfo police);
}
