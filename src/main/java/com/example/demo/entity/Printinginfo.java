package com.example.demo.entity;

import java.util.Date;

public class Printinginfo {
    private Integer printingId;

    private Integer contractId;

    private Integer printingPage;

    private Date contractTime;

    private String printingcontractMsg;

    private Integer userId;

    public Printinginfo(Integer contractId, Integer printingPage, Date contractTime, String printingcontractMsg, Integer userId) {
        this.contractId = contractId;
        this.printingPage = printingPage;
        this.contractTime = contractTime;
        this.printingcontractMsg = printingcontractMsg;
        this.userId = userId;
    }

    public Integer getPrintingId() {
        return printingId;
    }

    public void setPrintingId(Integer printingId) {
        this.printingId = printingId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getPrintingPage() {
        return printingPage;
    }

    public void setPrintingPage(Integer printingPage) {
        this.printingPage = printingPage;
    }

    public Date getContractTime() {
        return contractTime;
    }

    public void setContractTime(Date contractTime) {
        this.contractTime = contractTime;
    }

    public String getPrintingcontractMsg() {
        return printingcontractMsg;
    }

    public void setPrintingcontractMsg(String printingcontractMsg) {
        this.printingcontractMsg = printingcontractMsg == null ? null : printingcontractMsg.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}