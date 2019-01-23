package com.yufeng.yfps.model;

import java.util.Date;

public class Supplier {
    private String supId;

    private String supName;

    private String supOffAddr;

    private String supOffTelIdd;

    private String supOffTel01;

    private String supOffTel02;

    private String supOffFax;

    private String supRemk;

    private Date supCdate;

    private String supCuser;

    private Date supAdate;

    private String supAuser;

    private String supType;

    private String supComptype;

    public String getSupId() {
        return supId;
    }

    public void setSupId(String supId) {
        this.supId = supId == null ? null : supId.trim();
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName == null ? null : supName.trim();
    }

    public String getSupOffAddr() {
        return supOffAddr;
    }

    public void setSupOffAddr(String supOffAddr) {
        this.supOffAddr = supOffAddr == null ? null : supOffAddr.trim();
    }

    public String getSupOffTelIdd() {
        return supOffTelIdd;
    }

    public void setSupOffTelIdd(String supOffTelIdd) {
        this.supOffTelIdd = supOffTelIdd == null ? null : supOffTelIdd.trim();
    }

    public String getSupOffTel01() {
        return supOffTel01;
    }

    public void setSupOffTel01(String supOffTel01) {
        this.supOffTel01 = supOffTel01 == null ? null : supOffTel01.trim();
    }

    public String getSupOffTel02() {
        return supOffTel02;
    }

    public void setSupOffTel02(String supOffTel02) {
        this.supOffTel02 = supOffTel02 == null ? null : supOffTel02.trim();
    }

    public String getSupOffFax() {
        return supOffFax;
    }

    public void setSupOffFax(String supOffFax) {
        this.supOffFax = supOffFax == null ? null : supOffFax.trim();
    }

    public String getSupRemk() {
        return supRemk;
    }

    public void setSupRemk(String supRemk) {
        this.supRemk = supRemk == null ? null : supRemk.trim();
    }

    public Date getSupCdate() {
        return supCdate;
    }

    public void setSupCdate(Date supCdate) {
        this.supCdate = supCdate;
    }

    public String getSupCuser() {
        return supCuser;
    }

    public void setSupCuser(String supCuser) {
        this.supCuser = supCuser == null ? null : supCuser.trim();
    }

    public Date getSupAdate() {
        return supAdate;
    }

    public void setSupAdate(Date supAdate) {
        this.supAdate = supAdate;
    }

    public String getSupAuser() {
        return supAuser;
    }

    public void setSupAuser(String supAuser) {
        this.supAuser = supAuser == null ? null : supAuser.trim();
    }

    public String getSupType() {
        return supType;
    }

    public void setSupType(String supType) {
        this.supType = supType == null ? null : supType.trim();
    }

    public String getSupComptype() {
        return supComptype;
    }

    public void setSupComptype(String supComptype) {
        this.supComptype = supComptype == null ? null : supComptype.trim();
    }
}