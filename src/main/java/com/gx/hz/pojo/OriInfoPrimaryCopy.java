package com.gx.hz.pojo;

import java.io.Serializable;
import java.util.Date;

//主表
public class OriInfoPrimaryCopy implements Serializable{
    private Long id;

    private Long userId;

    private String lrrymc;

    private Date lrsj;

    private Short satae;

    private String ywtpbh;

    private String ywlx;

    private String jzId;

    private Integer needLr;

    private String jzbh;


    //前后一致
    private Integer consistency;

    //图片是否已经关联了条目  1:关联

    private Integer is_connect;

    private Long cleanSatae;//是否不清晰图片 0：不清晰 1：清晰

    private String tmbh;

    private Integer materialId;

    public String getJzId() {
        return jzId;
    }

    public void setJzId(String jzId) {
        this.jzId = jzId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
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

    public String getYwlx() {
        return ywlx;
    }

    public void setYwlx(String ywlx) {
        this.ywlx = ywlx == null ? null : ywlx.trim();
    }




    private OriInfoPrimaryCopy oriInfoPrimary;
    private OriInfoByzxlz oriInfoByzxlz;
    private OriInfoCszm oriInfoCszm;
    private OriInfoCzrkdjb oriInfoCzrkdjb;
    private OriInfoFcz oriInfoFcz;
    private OriInfoHkb oriInfoHkb;
    private OriInfoHkqyz oriInfoHkqyz;
    private OriInfoJhlhz oriInfoJhlhz;
    private OriInfoLXZ oriInfoLXZ;
    private OriInfoRhyyxxk oriInfoRhyyxxk;
    private OriInfoSfz oriInfoSfz;
    private OriInfoSwzm oriInfoSwzm;
    private OriInfoTwz oriInfoTwz;
    private OriInfoTxz oriInfoTxz;
    private OriInfoZqz oriInfoZqz;


    public OriInfoPrimaryCopy getOriInfoPrimary() {
        return oriInfoPrimary;
    }

    public void setOriInfoPrimary(OriInfoPrimaryCopy oriInfoPrimary) {
        this.oriInfoPrimary = oriInfoPrimary;
    }

    public OriInfoByzxlz getOriInfoByzxlz() {
        return oriInfoByzxlz;
    }

    public void setOriInfoByzxlz(OriInfoByzxlz oriInfoByzxlz) {
        this.oriInfoByzxlz = oriInfoByzxlz;
    }

    public OriInfoCszm getOriInfoCszm() {
        return oriInfoCszm;
    }

    public void setOriInfoCszm(OriInfoCszm oriInfoCszm) {
        this.oriInfoCszm = oriInfoCszm;
    }

    public OriInfoCzrkdjb getOriInfoCzrkdjb() {
        return oriInfoCzrkdjb;
    }

    public void setOriInfoCzrkdjb(OriInfoCzrkdjb oriInfoCzrkdjb) {
        this.oriInfoCzrkdjb = oriInfoCzrkdjb;
    }

    public OriInfoFcz getOriInfoFcz() {
        return oriInfoFcz;
    }

    public void setOriInfoFcz(OriInfoFcz oriInfoFcz) {
        this.oriInfoFcz = oriInfoFcz;
    }

    public OriInfoHkb getOriInfoHkb() {
        return oriInfoHkb;
    }

    public void setOriInfoHkb(OriInfoHkb oriInfoHkb) {
        this.oriInfoHkb = oriInfoHkb;
    }

    public OriInfoHkqyz getOriInfoHkqyz() {
        return oriInfoHkqyz;
    }

    public void setOriInfoHkqyz(OriInfoHkqyz oriInfoHkqyz) {
        this.oriInfoHkqyz = oriInfoHkqyz;
    }

    public OriInfoJhlhz getOriInfoJhlhz() {
        return oriInfoJhlhz;
    }

    public void setOriInfoJhlhz(OriInfoJhlhz oriInfoJhlhz) {
        this.oriInfoJhlhz = oriInfoJhlhz;
    }

    public OriInfoLXZ getOriInfoLXZ() {
        return oriInfoLXZ;
    }

    public void setOriInfoLXZ(OriInfoLXZ oriInfoLXZ) {
        this.oriInfoLXZ = oriInfoLXZ;
    }

    public OriInfoRhyyxxk getOriInfoRhyyxxk() {
        return oriInfoRhyyxxk;
    }

    public void setOriInfoRhyyxxk(OriInfoRhyyxxk oriInfoRhyyxxk) {
        this.oriInfoRhyyxxk = oriInfoRhyyxxk;
    }

    public OriInfoSfz getOriInfoSfz() {
        return oriInfoSfz;
    }

    public void setOriInfoSfz(OriInfoSfz oriInfoSfz) {
        this.oriInfoSfz = oriInfoSfz;
    }

    public OriInfoSwzm getOriInfoSwzm() {
        return oriInfoSwzm;
    }

    public void setOriInfoSwzm(OriInfoSwzm oriInfoSwzm) {
        this.oriInfoSwzm = oriInfoSwzm;
    }

    public OriInfoTwz getOriInfoTwz() {
        return oriInfoTwz;
    }

    public void setOriInfoTwz(OriInfoTwz oriInfoTwz) {
        this.oriInfoTwz = oriInfoTwz;
    }

    public OriInfoTxz getOriInfoTxz() {
        return oriInfoTxz;
    }

    public void setOriInfoTxz(OriInfoTxz oriInfoTxz) {
        this.oriInfoTxz = oriInfoTxz;
    }

    public OriInfoZqz getOriInfoZqz() {
        return oriInfoZqz;
    }

    public void setOriInfoZqz(OriInfoZqz oriInfoZqz) {
        this.oriInfoZqz = oriInfoZqz;
    }

    public Integer getIs_connect() {
        return is_connect;
    }

    public void setIs_connect(Integer is_connect) {
        this.is_connect = is_connect;
    }

    public Integer getNeedLr() {
        return needLr;
    }

    public void setNeedLr(Integer needLr) {
        this.needLr = needLr;
    }

    public String getJzbh(){return jzbh; }

    public void setJzbh(String jzbh){this.jzbh=jzbh;}

    public Integer getConsistency() {
        return consistency;
    }

    public void setConsistency(Integer consistency) {
        this.consistency = consistency;
    }

    public Long getCleanSatae() {
        return cleanSatae;
    }

    public void setCleanSatae(Long cleanSatae) {
        this.cleanSatae = cleanSatae;
    }


    public String getTmbh() {
        return tmbh;
    }

    public void setTmbh(String tmbh) {
        this.tmbh = tmbh;
    }

    private OriInfoPrimaryCopy oriInfoPrimaryCopy;
    private OriInfoByzxlzCopy oriInfoByzxlzCopy;
    private OriInfoCszmCopy oriInfoCszmCopy;
    private OriInfoCzrkdjbCopy oriInfoCzrkdjbCopy;
    private OriInfoFczCopy oriInfoFczCopy;
    private OriInfoHkbCopy oriInfoHkbCopy;
    private OriInfoHkqyzCopy oriInfoHkqyzCopy;
    private OriInfoJhlhzCopy oriInfoJhlhzCopy;
    private OriInfoLXZCopy oriInfoLXZCopy;
    private OriInfoRhyyxxkCopy oriInfoRhyyxxkCopy;
    private OriInfoSfzCopy oriInfoSfzCopy;
    private OriInfoSwzmCopy oriInfoSwzmCopy;
    private OriInfoTwzCopy oriInfoTwzCopy;
    private OriInfoTxzCopy oriInfoTxzCopy;
    private OriInfoZqzCopy oriInfoZqzCopy;

    public OriInfoPrimaryCopy getOriInfoPrimaryCopy() {
        return oriInfoPrimaryCopy;
    }

    public void setOriInfoPrimaryCopy(OriInfoPrimaryCopy oriInfoPrimaryCopy) {
        this.oriInfoPrimaryCopy = oriInfoPrimaryCopy;
    }

    public OriInfoByzxlzCopy getOriInfoByzxlzCopy() {
        return oriInfoByzxlzCopy;
    }

    public void setOriInfoByzxlzCopy(OriInfoByzxlzCopy oriInfoByzxlzCopy) {
        this.oriInfoByzxlzCopy = oriInfoByzxlzCopy;
    }

    public OriInfoCszmCopy getOriInfoCszmCopy() {
        return oriInfoCszmCopy;
    }

    public void setOriInfoCszmCopy(OriInfoCszmCopy oriInfoCszmCopy) {
        this.oriInfoCszmCopy = oriInfoCszmCopy;
    }

    public OriInfoCzrkdjbCopy getOriInfoCzrkdjbCopy() {
        return oriInfoCzrkdjbCopy;
    }

    public void setOriInfoCzrkdjbCopy(OriInfoCzrkdjbCopy oriInfoCzrkdjbCopy) {
        this.oriInfoCzrkdjbCopy = oriInfoCzrkdjbCopy;
    }

    public OriInfoFczCopy getOriInfoFczCopy() {
        return oriInfoFczCopy;
    }

    public void setOriInfoFczCopy(OriInfoFczCopy oriInfoFczCopy) {
        this.oriInfoFczCopy = oriInfoFczCopy;
    }

    public OriInfoHkbCopy getOriInfoHkbCopy() {
        return oriInfoHkbCopy;
    }

    public void setOriInfoHkbCopy(OriInfoHkbCopy oriInfoHkbCopy) {
        this.oriInfoHkbCopy = oriInfoHkbCopy;
    }

    public OriInfoHkqyzCopy getOriInfoHkqyzCopy() {
        return oriInfoHkqyzCopy;
    }

    public void setOriInfoHkqyzCopy(OriInfoHkqyzCopy oriInfoHkqyzCopy) {
        this.oriInfoHkqyzCopy = oriInfoHkqyzCopy;
    }

    public OriInfoJhlhzCopy getOriInfoJhlhzCopy() {
        return oriInfoJhlhzCopy;
    }

    public void setOriInfoJhlhzCopy(OriInfoJhlhzCopy oriInfoJhlhzCopy) {
        this.oriInfoJhlhzCopy = oriInfoJhlhzCopy;
    }

    public OriInfoLXZCopy getOriInfoLXZCopy() {
        return oriInfoLXZCopy;
    }

    public void setOriInfoLXZCopy(OriInfoLXZCopy oriInfoLXZCopy) {
        this.oriInfoLXZCopy = oriInfoLXZCopy;
    }

    public OriInfoRhyyxxkCopy getOriInfoRhyyxxkCopy() {
        return oriInfoRhyyxxkCopy;
    }

    public void setOriInfoRhyyxxkCopy(OriInfoRhyyxxkCopy oriInfoRhyyxxkCopy) {
        this.oriInfoRhyyxxkCopy = oriInfoRhyyxxkCopy;
    }

    public OriInfoSfzCopy getOriInfoSfzCopy() {
        return oriInfoSfzCopy;
    }

    public void setOriInfoSfzCopy(OriInfoSfzCopy oriInfoSfzCopy) {
        this.oriInfoSfzCopy = oriInfoSfzCopy;
    }

    public OriInfoSwzmCopy getOriInfoSwzmCopy() {
        return oriInfoSwzmCopy;
    }

    public void setOriInfoSwzmCopy(OriInfoSwzmCopy oriInfoSwzmCopy) {
        this.oriInfoSwzmCopy = oriInfoSwzmCopy;
    }

    public OriInfoTwzCopy getOriInfoTwzCopy() {
        return oriInfoTwzCopy;
    }

    public void setOriInfoTwzCopy(OriInfoTwzCopy oriInfoTwzCopy) {
        this.oriInfoTwzCopy = oriInfoTwzCopy;
    }

    public OriInfoTxzCopy getOriInfoTxzCopy() {
        return oriInfoTxzCopy;
    }

    public void setOriInfoTxzCopy(OriInfoTxzCopy oriInfoTxzCopy) {
        this.oriInfoTxzCopy = oriInfoTxzCopy;
    }

    public OriInfoZqzCopy getOriInfoZqzCopy() {
        return oriInfoZqzCopy;
    }

    public void setOriInfoZqzCopy(OriInfoZqzCopy oriInfoZqzCopy) {
        this.oriInfoZqzCopy = oriInfoZqzCopy;
    }

	public Integer getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Integer materialId) {
		this.materialId = materialId;
	}

    
}