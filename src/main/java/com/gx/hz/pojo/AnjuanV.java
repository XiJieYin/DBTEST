package com.gx.hz.pojo;

import java.util.Date;

public class AnjuanV {
    private String anjuanid;

    private String dacode;

    private Object flcode;

    private Object mlcode;

    private Object sxcode;

    private Object timing;

    private String baogqxname;

    private Object ftimestar;

    private Object ftimeend;

    private Object yeshu;

    private String fenshu;

    private String bianzdwname;

    private String bianzbmname;

    private String ajtypename;

    private Date lijtime;

    private Object leibie;

    private String strcodename;

    private Date creationtime;

    private Object createdbyusername;

    private Date lastmodificationtime;

    public AnjuanV(String anjuanid, String dacode, Object flcode, Object mlcode, Object sxcode, Object timing,
			String baogqxname, Object ftimestar, Object ftimeend, Object yeshu, String fenshu, String bianzdwname,
			String bianzbmname, String ajtypename, Date lijtime, Object leibie, String strcodename, Date creationtime,
			Object createdbyusername, Date lastmodificationtime) {
		super();
		this.anjuanid = anjuanid;
		this.dacode = dacode;
		this.flcode = flcode;
		this.mlcode = mlcode;
		this.sxcode = sxcode;
		this.timing = timing;
		this.baogqxname = baogqxname;
		this.ftimestar = ftimestar;
		this.ftimeend = ftimeend;
		this.yeshu = yeshu;
		this.fenshu = fenshu;
		this.bianzdwname = bianzdwname;
		this.bianzbmname = bianzbmname;
		this.ajtypename = ajtypename;
		this.lijtime = lijtime;
		this.leibie = leibie;
		this.strcodename = strcodename;
		this.creationtime = creationtime;
		this.createdbyusername = createdbyusername;
		this.lastmodificationtime = lastmodificationtime;
	}

	public AnjuanV() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAnjuanid() {
        return anjuanid;
    }

    public void setAnjuanid(String anjuanid) {
        this.anjuanid = anjuanid == null ? null : anjuanid.trim();
    }

    public String getDacode() {
        return dacode;
    }

    public void setDacode(String dacode) {
        this.dacode = dacode == null ? null : dacode.trim();
    }

    public Object getFlcode() {
        return flcode;
    }

    public void setFlcode(Object flcode) {
        this.flcode = flcode;
    }

    public Object getMlcode() {
        return mlcode;
    }

    public void setMlcode(Object mlcode) {
        this.mlcode = mlcode;
    }

    public Object getSxcode() {
        return sxcode;
    }

    public void setSxcode(Object sxcode) {
        this.sxcode = sxcode;
    }

    public Object getTiming() {
        return timing;
    }

    public void setTiming(Object timing) {
        this.timing = timing;
    }

    public String getBaogqxname() {
        return baogqxname;
    }

    public void setBaogqxname(String baogqxname) {
        this.baogqxname = baogqxname == null ? null : baogqxname.trim();
    }

    public Object getFtimestar() {
        return ftimestar;
    }

    public void setFtimestar(Object ftimestar) {
        this.ftimestar = ftimestar;
    }

    public Object getFtimeend() {
        return ftimeend;
    }

    public void setFtimeend(Object ftimeend) {
        this.ftimeend = ftimeend;
    }

    public Object getYeshu() {
        return yeshu;
    }

    public void setYeshu(Object yeshu) {
        this.yeshu = yeshu;
    }

    public String getFenshu() {
        return fenshu;
    }

    public void setFenshu(String fenshu) {
        this.fenshu = fenshu == null ? null : fenshu.trim();
    }

    public String getBianzdwname() {
        return bianzdwname;
    }

    public void setBianzdwname(String bianzdwname) {
        this.bianzdwname = bianzdwname == null ? null : bianzdwname.trim();
    }

    public String getBianzbmname() {
        return bianzbmname;
    }

    public void setBianzbmname(String bianzbmname) {
        this.bianzbmname = bianzbmname == null ? null : bianzbmname.trim();
    }

    public String getAjtypename() {
        return ajtypename;
    }

    public void setAjtypename(String ajtypename) {
        this.ajtypename = ajtypename == null ? null : ajtypename.trim();
    }

    public Date getLijtime() {
        return lijtime;
    }

    public void setLijtime(Date lijtime) {
        this.lijtime = lijtime;
    }

    public Object getLeibie() {
        return leibie;
    }

    public void setLeibie(Object leibie) {
        this.leibie = leibie;
    }

    public String getStrcodename() {
        return strcodename;
    }

    public void setStrcodename(String strcodename) {
        this.strcodename = strcodename == null ? null : strcodename.trim();
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public Object getCreatedbyusername() {
        return createdbyusername;
    }

    public void setCreatedbyusername(Object createdbyusername) {
        this.createdbyusername = createdbyusername;
    }

    public Date getLastmodificationtime() {
        return lastmodificationtime;
    }

    public void setLastmodificationtime(Date lastmodificationtime) {
        this.lastmodificationtime = lastmodificationtime;
    }
}