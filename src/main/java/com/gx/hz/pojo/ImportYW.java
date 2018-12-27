package com.gx.hz.pojo;

import java.util.Date;

public class ImportYW {
    private Long id;

    private Long jzId;

    private String sxm;

    private String xm;

    private String xb;

    private String sfzh;

    private Date csrq;

    private String dzms;

    private Date sj;

    private Long zsyh;

    private Long zzyh;

    private String bz;

    private Short zt;

    private Date cjsj;
    
    private String sjStr;
    
    private Long rwId;
    
    private String phmc;
    
    private String code;
    

    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPhmc() {
		return phmc;
	}

	public void setPhmc(String phmc) {
		this.phmc = phmc;
	}

	public String getSjStr() {
		return sjStr;
	}

	public Long getRwId() {
		return rwId;
	}

	public void setRwId(Long rwId) {
		this.rwId = rwId;
	}

	public void setSjStr(String sjStr) {
		this.sjStr = sjStr;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJzId() {
        return jzId;
    }

    public void setJzId(Long jzId) {
        this.jzId = jzId;
    }

    public String getSxm() {
        return sxm;
    }

    public void setSxm(String sxm) {
        this.sxm = sxm == null ? null : sxm.trim();
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

    public Date getCsrq() {
        return csrq;
    }

    public void setCsrq(Date csrq) {
        this.csrq = csrq;
    }

    public String getDzms() {
        return dzms;
    }

    public void setDzms(String dzms) {
        this.dzms = dzms == null ? null : dzms.trim();
    }

    public Date getSj() {
        return sj;
    }

    public void setSj(Date sj) {
        this.sj = sj;
    }

    public Long getZsyh() {
        return zsyh;
    }

    public void setZsyh(Long zsyh) {
        this.zsyh = zsyh;
    }

    public Long getZzyh() {
        return zzyh;
    }

    public void setZzyh(Long zzyh) {
        this.zzyh = zzyh;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public Short getZt() {
        return zt;
    }

    public void setZt(Short zt) {
        this.zt = zt;
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }
}