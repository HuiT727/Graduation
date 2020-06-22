package com.example.demo.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonEntity {
    private Integer id;

    private String name;

    private Integer enterpriseId;

    private String username;

    private String password;

    private String sex;

    private String userId;

    private String tel;

    private String cardNumber;

    private String legalPerson;

    private String address;

    private String email;

    private Date time;

    private String fileLink;

    private String truetime;

    public CommonEntity() {
    }

    public CommonEntity(Policeinfo police){
        this.id = police.getPoliceId();
        this.username = police.getPoliceAccount();
        this.password = police.getPolicePwd();
        this.name = police.getPoliceName();
        this.tel = police.getPolicePhone();
        this.sex = police.getPoliceSex();
        this.cardNumber = police.getPoliceCard();
    }

    public CommonEntity(Userinfo user){
        this.id = user.getUserId();
        this.name = user.getUserName();
        this.enterpriseId = user.getEnterpriseId();
        this.username = user.getUserAccount();
        this.password = user.getUserPwd();
        this.sex = user.getUserSex();
        this.userId = user.getUserWorkid();
        this.tel = user.getUserTel();
        this.cardNumber = user.getUserCard();
    }

    public CommonEntity(Admininfo admin){
        this.id = admin.getAdminId();
        this.username = admin.getAdminAccount();
        this.password = admin.getAdminPwd();
    }

    public CommonEntity(Enterpriseinfo enterprise){
        this.id = enterprise.getEnterpriseId();
        this.name = enterprise.getEnterpriseName();
        this.username = enterprise.getEnterpriseAccount();
        this.password = enterprise.getEnterprisePwd();
        this.cardNumber = enterprise.getLegalCard();
        this.legalPerson = enterprise.getLegalName();
        this.address = enterprise.getEnterpriseAddress();
        this.tel = enterprise.getEnterpriseTel();
        this.email = enterprise.getEnterpriseEmail();
    }

    public CommonEntity(Contractinfo contract){
        this.id = contract.getContractId();
        this.name = contract.getContractName();
        this.enterpriseId = contract.getEnterpriseId();
        this.time  = contract.getContractTime();
        this.fileLink = contract.getContractFile();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.truetime = simpleDateFormat.format(this.time);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }

    public String getTruetime() {
        return truetime;
    }

    public void setTruetime(String truetime) {
        this.truetime = truetime;
    }
}
