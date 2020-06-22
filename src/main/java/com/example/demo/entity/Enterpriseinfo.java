package com.example.demo.entity;

public class Enterpriseinfo {
    private Integer enterpriseId;

    private String enterpriseName;

    private String enterpriseAccount;

    private String enterprisePwd;

    private String legalCard;

    private String legalName;

    private String enterpriseTel;

    private String enterpriseAddress;

    private String enterpriseEmail;

    public Enterpriseinfo(String enterpriseAccount, String enterprisePwd) {
        this.enterpriseAccount = enterpriseAccount;
        this.enterprisePwd = enterprisePwd;
    }

    public Enterpriseinfo() {
    }

    public Enterpriseinfo(String enterpriseName, String enterpriseAccount, String enterprisePwd, String legalCard, String legalName, String enterpriseTel, String enterpriseAddress, String enterpriseEmail) {
        this.enterpriseName = enterpriseName;
        this.enterpriseAccount = enterpriseAccount;
        this.enterprisePwd = enterprisePwd;
        this.legalCard = legalCard;
        this.legalName = legalName;
        this.enterpriseTel = enterpriseTel;
        this.enterpriseAddress = enterpriseAddress;
        this.enterpriseEmail = enterpriseEmail;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public String getEnterpriseAccount() {
        return enterpriseAccount;
    }

    public void setEnterpriseAccount(String enterpriseAccount) {
        this.enterpriseAccount = enterpriseAccount == null ? null : enterpriseAccount.trim();
    }

    public String getEnterprisePwd() {
        return enterprisePwd;
    }

    public void setEnterprisePwd(String enterprisePwd) {
        this.enterprisePwd = enterprisePwd == null ? null : enterprisePwd.trim();
    }

    public String getLegalCard() {
        return legalCard;
    }

    public void setLegalCard(String legalCard) {
        this.legalCard = legalCard == null ? null : legalCard.trim();
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName == null ? null : legalName.trim();
    }

    public String getEnterpriseTel() {
        return enterpriseTel;
    }

    public void setEnterpriseTel(String enterpriseTel) {
        this.enterpriseTel = enterpriseTel == null ? null : enterpriseTel.trim();
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress == null ? null : enterpriseAddress.trim();
    }

    public String getEnterpriseEmail() {
        return enterpriseEmail;
    }

    public void setEnterpriseEmail(String enterpriseEmail) {
        this.enterpriseEmail = enterpriseEmail == null ? null : enterpriseEmail.trim();
    }
}