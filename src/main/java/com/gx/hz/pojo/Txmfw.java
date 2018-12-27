package com.gx.hz.pojo;

import java.util.Date;

public class Txmfw {
	
    private Long id;

    private String ksz;

    private String jsz;

    private Long sl;

    private String dyrmc;

    private Long dyrId;

    private Date dysj;

    private Date cjsj;
    
    private String tmName;

    public String getLx() {
		return lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}

	private Long satae;
    
    private String lx;
    
   private String orgcode;
    
    private String lxbh;

    public String getOrgcode() {
		return orgcode;
	}

	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	public String getLxbh() {
		return lxbh;
	}

	public void setLxbh(String lxbh) {
		this.lxbh = lxbh;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKsz() {
        return ksz;
    }

    public void setKsz(String ksz) {
        this.ksz = ksz == null ? null : ksz.trim();
    }

    public String getJsz() {
        return jsz;
    }

    public void setJsz(String jsz) {
        this.jsz = jsz == null ? null : jsz.trim();
    }

    public Long getSl() {
        return sl;
    }

    public void setSl(Long sl) {
        this.sl = sl;
    }

    public String getDyrmc() {
        return dyrmc;
    }

    public void setDyrmc(String dyrmc) {
        this.dyrmc = dyrmc == null ? null : dyrmc.trim();
    }

    public Long getDyrId() {
        return dyrId;
    }

    public void setDyrId(Long dyrId) {
        this.dyrId = dyrId;
    }

    public Date getDysj() {
        return dysj;
    }

    public void setDysj(Date dysj) {
        this.dysj = dysj;
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    public Long getSatae() {
        return satae;
    }

    public void setSatae(Long satae) {
        this.satae = satae;
    }

	public String getTmName() {
		return tmName;
	}

	public void setTmName(String tmName) {
		this.tmName = tmName;
	}

}