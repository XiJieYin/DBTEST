package com.gx.hz.pojo;

import java.util.Date;

public class InfoOrilrjl {
    private Long id;

    private String jzbh;

    private Long jzid;

    private Long userId;

    private Short satae;

    private Date finishDate;

    private Short shsatae;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJzbh() {
        return jzbh;
    }

    public void setJzbh(String jzbh) {
        this.jzbh = jzbh == null ? null : jzbh.trim();
    }

    public Long getJzid() {
        return jzid;
    }

    public void setJzid(Long jzid) {
        this.jzid = jzid;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Short getSatae() {
        return satae;
    }

    public void setSatae(Short satae) {
        this.satae = satae;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public Short getShsatae() {
        return shsatae;
    }

    public void setShsatae(Short shsatae) {
        this.shsatae = shsatae;
    }
}