package com.gx.hz.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class File {
    private String fileid;

    private String guidaid;

    private BigDecimal rowno;

    private Object filename;

    private String type;

    private String url;

    private String md5code;

    private Date creationtime;

    private String createdbyuserid;

    private Object createdbyusername;

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid == null ? null : fileid.trim();
    }

    public String getGuidaid() {
        return guidaid;
    }

    public void setGuidaid(String guidaid) {
        this.guidaid = guidaid == null ? null : guidaid.trim();
    }

    public BigDecimal getRowno() {
        return rowno;
    }

    public void setRowno(BigDecimal rowno) {
        this.rowno = rowno;
    }

    public Object getFilename() {
        return filename;
    }

    public void setFilename(Object filename) {
        this.filename = filename;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getMd5code() {
        return md5code;
    }

    public void setMd5code(String md5code) {
        this.md5code = md5code == null ? null : md5code.trim();
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public String getCreatedbyuserid() {
        return createdbyuserid;
    }

    public void setCreatedbyuserid(String createdbyuserid) {
        this.createdbyuserid = createdbyuserid == null ? null : createdbyuserid.trim();
    }

    public Object getCreatedbyusername() {
        return createdbyusername;
    }

    public void setCreatedbyusername(Object createdbyusername) {
        this.createdbyusername = createdbyusername;
    }
}