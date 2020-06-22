package com.example.demo.entity;

public class Policeinfo {
    private Integer policeId;

    private String policeAccount;

    private String policePwd;

    private String policeName;

    private String policePhone;

    private String policeSex;

    private String policeCard;

    public Policeinfo(String policeAccount, String policePwd, String policeName, String policePhone, String policeSex, String policeCard) {
        this.policeAccount = policeAccount;
        this.policePwd = policePwd;
        this.policeName = policeName;
        this.policePhone = policePhone;
        this.policeSex = policeSex;
        this.policeCard = policeCard;
    }

    public Policeinfo() {
    }

    public Integer getPoliceId() {
        return policeId;
    }

    public void setPoliceId(Integer policeId) {
        this.policeId = policeId;
    }

    public String getPoliceAccount() {
        return policeAccount;
    }

    public void setPoliceAccount(String policeAccount) {
        this.policeAccount = policeAccount == null ? null : policeAccount.trim();
    }

    public String getPolicePwd() {
        return policePwd;
    }

    public void setPolicePwd(String policePwd) {
        this.policePwd = policePwd == null ? null : policePwd.trim();
    }

    public String getPoliceName() {
        return policeName;
    }

    public void setPoliceName(String policeName) {
        this.policeName = policeName == null ? null : policeName.trim();
    }

    public String getPolicePhone() {
        return policePhone;
    }

    public void setPolicePhone(String policePhone) {
        this.policePhone = policePhone == null ? null : policePhone.trim();
    }

    public String getPoliceSex() {
        return policeSex;
    }

    public void setPoliceSex(String policeSex) {
        this.policeSex = policeSex == null ? null : policeSex.trim();
    }

    public String getPoliceCard() {
        return policeCard;
    }

    public void setPoliceCard(String policeCard) {
        this.policeCard = policeCard == null ? null : policeCard.trim();
    }
}