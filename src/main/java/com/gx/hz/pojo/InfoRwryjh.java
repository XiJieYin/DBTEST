package com.gx.hz.pojo;

import java.util.Date;

public class InfoRwryjh {
    private Long id;

    private Integer rylx;

    private String rybh;

    private Integer userId;

    private Date jhkssj;

    private Date jhjssj;

    private Short satae;

    private Long rwId;

    private Long rwzs;

    private Long rwwcsl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRylx() {
        return rylx;
    }

    public void setRylx(Integer rylx) {
        this.rylx = rylx ;
    }

    public String getRybh() {
        return rybh;
    }

    public void setRybh(String rybh) {
        this.rybh = rybh == null ? null : rybh.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getJhkssj() {
        return jhkssj;
    }

    public void setJhkssj(Date jhkssj) {
        this.jhkssj = jhkssj;
    }

    public Date getJhjssj() {
        return jhjssj;
    }

    public void setJhjssj(Date jhjssj) {
        this.jhjssj = jhjssj;
    }

    public Short getSatae() {
        return satae;
    }

    public void setSatae(Short satae) {
        this.satae = satae;
    }

    public Long getRwId() {
        return rwId;
    }

    public void setRwId(Long rwId) {
        this.rwId = rwId;
    }

    public Long getRwzs() {
        return rwzs;
    }

    public void setRwzs(Long rwzs) {
        this.rwzs = rwzs;
    }

    public Long getRwwcsl() {
        return rwwcsl;
    }

    public void setRwwcsl(Long rwwcsl) {
        this.rwwcsl = rwwcsl;
    }
}