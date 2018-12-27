package com.gx.hz.pojo;

public class ImportPlgl {
    private Long id;

    private String phmc;

    private Long qsh;

    private Long zzh;

    private Short tmlx;
    
    private Long rwId;
    
    private String code;

    public Long getRwId() {
		return rwId;
	}

	public void setRwId(Long rwId) {
		this.rwId = rwId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhmc() {
        return phmc;
    }

    public void setPhmc(String phmc) {
        this.phmc = phmc == null ? null : phmc.trim();
    }

    public Long getQsh() {
        return qsh;
    }

    public void setQsh(Long qsh) {
        this.qsh = qsh;
    }

    public Long getZzh() {
        return zzh;
    }

    public void setZzh(Long zzh) {
        this.zzh = zzh;
    }

    public Short getTmlx() {
        return tmlx;
    }

    public void setTmlx(Short tmlx) {
        this.tmlx = tmlx;
    }
}