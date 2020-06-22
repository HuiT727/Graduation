package com.example.demo.service;

import com.example.demo.entity.Contractinfo;

import java.util.List;

public interface ContractService {

    public List<Contractinfo> getAllContract();

    public List<Contractinfo> getContractinfoById(Integer id);

    public int deleteContractById(Integer id);

    public List<Contractinfo> getContractinfoByEnterpriseId(Integer id);

    public boolean addContract(Contractinfo contractinfo);

    public String getContractFileByid(Integer id);

    public int addContractNum(Integer id);

    public int getContractNumberByContractId(Integer id);
}
