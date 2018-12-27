package com.gx.hz.pojo;

import java.util.Date;
import java.util.List;

public class InfoDaCxRzXx {
    private Long id;

    private Long userid;

    private String username;

    private String ssdwmc;
    
    private List<Organization> orgs;
    
    private int cdlx;

    private Date cxsj;

    private Long cxjg;

    private String cxnr;
    
    private String orgName;
    
    private String zzjgdm;
    
    public String getZzjgdm(){
    	return zzjgdm;
    }
    
    public void setZzjgdm(String zzjgdm){
    	this.zzjgdm = zzjgdm;
    }
	
	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
    
    public List<Organization> getOrgs() {
		return orgs;
	}

	public void setOrgs(List<Organization> orgs) {
		this.orgs = orgs;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSsdwmc() {
        return ssdwmc;
    }

    public void setSsdwmc(String ssdwmc) {
        this.ssdwmc = ssdwmc == null ? null : ssdwmc.trim();
    }

    public int getCdlx() {
        return cdlx;
    }

    public void setCdlx(int i) {
        this.cdlx = i;
    }

    public Date getCxsj() {
        return cxsj;
    }

    public void setCxsj(Date cxsj) {
        this.cxsj = cxsj;
    }

    public Long getCxjg() {
        return cxjg;
    }

    public void setCxjg(Long cxjg) {
        this.cxjg = cxjg;
    }

    public String getCxnr() {
        return cxnr;
    }

    public void setCxnr(String cxnr) {
        this.cxnr = cxnr ;
    }
}