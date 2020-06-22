package com.example.demo.entity;

import java.util.Date;

public class Contractinfo {
    private Integer contractId;

    private String contractName;

    private Integer enterpriseId;

    private Date contractTime;

    private String contractFile;

    private Integer contractNumbers;

    public Contractinfo(String contractName, Integer enterpriseId, Date contractTime, String contractFile, Integer contractNumbers) {
        this.contractName = contractName;
        this.enterpriseId = enterpriseId;
        this.contractTime = contractTime;
        this.contractFile = contractFile;
        this.contractNumbers = contractNumbers;
    }

    public Contractinfo() {
    }

    public Contractinfo(String contractName, Integer enterpriseId, String contractFile, Integer contractNumbers) {
        this.contractName = contractName;
        this.enterpriseId = enterpriseId;
        this.contractFile = contractFile;
        this.contractNumbers = contractNumbers;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName == null ? null : contractName.trim();
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Date getContractTime() {
        return contractTime;
    }

    public void setContractTime(Date contractTime) {
        this.contractTime = contractTime;
    }

    public String getContractFile() {
        return contractFile;
    }

    public void setContractFile(String contractFile) {
        this.contractFile = contractFile == null ? null : contractFile.trim();
    }

    public Integer getContractNumbers() {
        return contractNumbers;
    }

    public void setContractNumbers(Integer contractNumbers) {
        this.contractNumbers = contractNumbers;
    }


}