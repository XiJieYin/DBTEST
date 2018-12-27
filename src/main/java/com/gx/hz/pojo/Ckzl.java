package com.gx.hz.pojo;

import java.util.Date;

public class Ckzl {
    private Integer id;

    private String gfmc;

    private Date fbsj;

    private String fbdw;

    private String bb;

    private String slcs;

    private String url;

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

    public Date getFbsj() {
        return fbsj;
    }

    public void setFbsj(Date fbsj) {
        this.fbsj = fbsj;
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

    public String getSlcs() {
        return slcs;
    }

    public void setSlcs(String slcs) {
        this.slcs = slcs == null ? null : slcs.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}