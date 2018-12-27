package com.gx.hz.pojo;

import java.util.Date;

public class InfoSjcxjl {
    private Long id;

    private String xm;//姓名

    private String xb;//性别

    private String dalx;//档案类型

    private Long ywzbid;//原文主表Id

    private Long ywxxid;//原文信息表主键

    private String ssdwid;//所属单位Id

    private String ssdwmc;//所属单位名称

    private String qzh;//全宗号

    private String flh;//分类号

    private String tm;//提名

    private String mlh;//目录号

    private Long dacfwzid;//档案存放位置主键

    private String zqzh;//准迁证号

    private String qyzh;//迁移证号

    private String txmbh;//条形码编号

    private Date updateTime;

    private Long updateUser;

    private Short isDel;

    private String sxh;//顺序号

    private String dacfwz;//档案存放位置

    private String zjhm;//证件号码

    private Long jzId;//卷宗ID

    private String jzbh;//卷宗编号
    
    private String dalxid;//档案类型ID


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        this.xb = xb;
    }

    public String getDalx() {
        return dalx;
    }

    public void setDalx(String dalx) {
        this.dalx = dalx == null ? null : dalx.trim();
    }

    public Long getYwzbid() {
        return ywzbid;
    }

    public void setYwzbid(Long ywzbid) {
        this.ywzbid = ywzbid;
    }

    public Long getYwxxid() {
        return ywxxid;
    }

    public void setYwxxid(Long ywxxid) {
        this.ywxxid = ywxxid;
    }

    public String getSsdwid() {
        return ssdwid;
    }

    public void setSsdwid(String ssdwid) {
        this.ssdwid = ssdwid;
    }

    public String getSsdwmc() {
        return ssdwmc;
    }

    public void setSsdwmc(String ssdwmc) {
        this.ssdwmc = ssdwmc == null ? null : ssdwmc.trim();
    }

    public String getQzh() {
        return qzh;
    }

    public void setQzh(String qzh) {
        this.qzh = qzh == null ? null : qzh.trim();
    }

    public String getFlh() {
        return flh;
    }

    public void setFlh(String flh) {
        this.flh = flh == null ? null : flh.trim();
    }

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm == null ? null : tm.trim();
    }

    public String getMlh() {
        return mlh;
    }

    public void setMlh(String mlh) {
        this.mlh = mlh == null ? null : mlh.trim();
    }

    public Long getDacfwzid() {
        return dacfwzid;
    }

    public void setDacfwzid(Long dacfwzid) {
        this.dacfwzid = dacfwzid;
    }

    public String getZqzh() {
        return zqzh;
    }

    public void setZqzh(String zqzh) {
        this.zqzh = zqzh == null ? null : zqzh.trim();
    }

    public String getQyzh() {
        return qyzh;
    }

    public void setQyzh(String qyzh) {
        this.qyzh = qyzh == null ? null : qyzh.trim();
    }

    public String getTxmbh() {
        return txmbh;
    }

    public void setTxmbh(String txmbh) {
        this.txmbh = txmbh == null ? null : txmbh.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public Short getIsDel() {
        return isDel;
    }

    public void setIsDel(Short isDel) {
        this.isDel = isDel;
    }

    public String getSxh() {
        return sxh;
    }

    public void setSxh(String sxh) {
        this.sxh = sxh;
    }

    public String getDacfwz() {
        return dacfwz;
    }

    public void setDacfwz(String dacfwz) {
        this.dacfwz = dacfwz == null ? null : dacfwz.trim();
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    public Long getJzId() {
        return jzId;
    }

    public void setJzId(Long jzId) {
        this.jzId = jzId;
    }


    public String getJzbh() {
        return jzbh;
    }

    public void setJzbh(String jzbh) {
        this.jzbh = jzbh;
    }

	public String getDalxid() {
		return dalxid;
	}

	public void setDalxid(String dalxid) {
		this.dalxid = dalxid;
	}
    
}