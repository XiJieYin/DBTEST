package com.gx.hz.pojo;

import java.util.Date;

public class OriInfoFcz {
    private Long id;

    private Integer userId;

    private String lrrymc;

    private Date lrsj;

    private Short satae;

    private String ywtpbh;

    private String xm;

    private String xb;

    private String sfzh;

    private String fczh;

    private String dz;

    private Long ywpId;

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

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh == null ? null : sfzh.trim();
    }

    public String getFczh() {
        return fczh;
    }

    public void setFczh(String fczh) {
        this.fczh = fczh == null ? null : fczh.trim();
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz == null ? null : dz.trim();
    }

    public Long getYwpId() {
        return ywpId;
    }

    public void setYwpId(Long ywpId) {
        this.ywpId = ywpId;
    }
}