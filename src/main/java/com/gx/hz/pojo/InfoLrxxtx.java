package com.gx.hz.pojo;

public class InfoLrxxtx {
    private Long id;

    private Long userId;

    private String jzbh;

    private String jztm;

    private Short type;

    private String bz;

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

    public String getJzbh() {
        return jzbh;
    }

    public void setJzbh(String jzbh) {
        this.jzbh = jzbh == null ? null : jzbh.trim();
    }

    public String getJztm() {
        return jztm;
    }

    public void setJztm(String jztm) {
        this.jztm = jztm == null ? null : jztm.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }
}