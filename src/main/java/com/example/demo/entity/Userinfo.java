package com.example.demo.entity;

public class Userinfo {
    private Integer userId;

    private String userName;

    private Integer enterpriseId;

    private String userAccount;

    private String userPwd;

    private String userSex;

    private String userWorkid;

    private String userTel;

    private String userCard;

    public Userinfo(String userAccount, String userPwd) {
        this.userAccount = userAccount;
        this.userPwd = userPwd;
    }

    public Userinfo() {
    }

    public Userinfo(String userName, Integer enterpriseId, String userAccount, String userPwd, String userSex, String userTel, String userCard) {
        this.userName = userName;
        this.enterpriseId = enterpriseId;
        this.userAccount = userAccount;
        this.userPwd = userPwd;
        this.userSex = userSex;
        this.userTel = userTel;
        this.userCard = userCard;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserWorkid() {
        return userWorkid;
    }

    public void setUserWorkid(String userWorkid) {
        this.userWorkid = userWorkid == null ? null : userWorkid.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard == null ? null : userCard.trim();
    }
}