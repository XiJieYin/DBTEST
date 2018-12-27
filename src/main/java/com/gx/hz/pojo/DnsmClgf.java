package com.gx.hz.pojo;

import java.util.Date;

public class DnsmClgf {
    private Integer id;

    private String gfmc;

    private String fbdw;

    private String bb;

    private String llcs;

    private String url;

    private Date fbsj;
    
    public Date getFbsj() {
		return fbsj;
	}

	public void setFbsj(Date fbsj) {
		this.fbsj = fbsj;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGfmc() {
        return gfmc;
    }

    public void setGfmc(String gfmc) {
        this.gfmc = gfmc == null ? null : gfmc.trim();
    }

    public String getFbdw() {
        return fbdw;
    }

    public void setFbdw(String fbdw) {
        this.fbdw = fbdw == null ? null : fbdw.trim();
    }

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb == null ? null : bb.trim();
    }

    public String getLlcs() {
        return llcs;
    }

    public void setLlcs(String llcs) {
        this.llcs = llcs == null ? null : llcs.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}