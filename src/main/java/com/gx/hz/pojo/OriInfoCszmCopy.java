package com.gx.hz.pojo;

import java.io.Serializable;
import java.util.Date;

public class OriInfoCszmCopy implements Serializable {
    private Long id;

    private Integer userId;

    private String lrrymc;

    private Date lrsj;

    private Short satae;

    private String xm;

    private String xb;

    private String csny;

    private String mqxm;

    private String mqsfzh;

    private String fqxm;

    private String fqsfzh;

    private String csbh;

    private Date qfrq;

    private String ywtpbh;

    private Long ywpId;

    private String qfrqStr;

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

    public String getMqxm() {
        return mqxm;
    }

    public void setMqxm(String mqxm) {
        this.mqxm = mqxm == null ? null : mqxm.trim();
    }

    public String getMqsfzh() {
        return mqsfzh;
    }

    public void setMqsfzh(String mqsfzh) {
        this.mqsfzh = mqsfzh == null ? null : mqsfzh.trim();
    }

    public String getFqxm() {
        return fqxm;
    }

    public void setFqxm(String fqxm) {
        this.fqxm = fqxm == null ? null : fqxm.trim();
    }

    public String getFqsfzh() {
        return fqsfzh;
    }

    public void setFqsfzh(String fqsfzh) {
        this.fqsfzh = fqsfzh == null ? null : fqsfzh.trim();
    }

    public String getCsbh() {
        return csbh;
    }

    public void setCsbh(String csbh) {
        this.csbh = csbh == null ? null : csbh.trim();
    }

    public Date getQfrq() {
        return qfrq;
    }

    public void setQfrq(Date qfrq) {
        this.qfrq = qfrq;
    }

    public Long getYwpId() {
        return ywpId;
    }

    public void setYwpId(Long ywpId) {
        this.ywpId = ywpId;
    }

    public String getYwtpbh() {
        return ywtpbh;
    }

    public void setYwtpbh(String ywtpbh) {
        this.ywtpbh = ywtpbh;
    }

    public String getQfrqStr() {
            return qfrqStr;
    }

    public void setQfrqStr(String qfrqStr) {
        this.qfrqStr = qfrqStr;
    }
}