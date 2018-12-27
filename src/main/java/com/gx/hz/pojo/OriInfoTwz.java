package com.gx.hz.pojo;

import java.util.Date;

public class OriInfoTwz {
    private Long id;

    private Integer userId;

    private String lrrymc;

    private Date lrsj;

    private Short satae;

    private String ywtpbh;

    private String xm;

    private String xb;

    private String csny;

    private String zjhm;

    private Date twsj;

    private Long ywpId;

    private String twsjStr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLrrymc() {
        return lrrymc;
    }

    public void setLrrymc(String lrrymc) {
        this.lrrymc = lrrymc == null ? null : lrrymc.trim();
    }

    public Date getLrsj() {
        return lrsj;
    }

    public void setLrsj(Date lrsj) {
        this.lrsj = lrsj;
    }

    public Short getSatae() {
        return satae;
    }

    public void setSatae(Short satae) {
        this.satae = satae;
    }

    public String getYwtpbh() {
        return ywtpbh;
    }

    public void setYwtpbh(String ywtpbh) {
        this.ywtpbh = ywtpbh == null ? null : ywtpbh.trim();
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb == null ? null : xb.trim();
    }

    public String getCsny() {
        return csny;
    }

    public void setCsny(String csny) {
        this.csny = csny == null ? null : csny.trim();
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm == null ? null : zjhm.trim();
    }

    public Date getTwsj() {
        return twsj;
    }

    public void setTwsj(Date twsj) {
        this.twsj = twsj;
    }

    public Long getYwpId() {
        return ywpId;
    }

    public void setYwpId(Long ywpId) {
        this.ywpId = ywpId;
    }

    public String getTwsjStr() {
        return twsjStr;
    }

    public void setTwsjStr(String twsjStr) {
        this.twsjStr = twsjStr;
    }
}