package com.gx.hz.pojo;

import java.util.Date;

public class ImportTJ {
    private Long id;

    private Long jzId;

    private String sxm;

    private String zrz;

    private String bt;

    private Date sj;

    private Long zsyh;

    private Long zzyh;

    private String bz;

    private Date cjsj;

    private Short zt;
    
    private String sjstr;
    
    private Long rwId;
    
    private String phmc;
    
    private String code;
    
    
    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPhmc() {
		return phmc;
	}

	public void setPhmc(String phmc) {
		this.phmc = phmc;
	}

	public Long getRwId() {
		return rwId;
	}

	public void setRwId(Long rwId) {
		this.rwId = rwId;
	}

	public String getSjstr() {
		return sjstr;
	}

	public void setSjstr(String sjstr) {
		this.sjstr = sjstr;
	}

	private String wh;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJzId() {
        return jzId;
    }

    public void setJzId(Long jzId) {
        this.jzId = jzId;
    }

    public String getSxm() {
        return sxm;
    }

    public void setSxm(String sxm) {
        this.sxm = sxm == null ? null : sxm.trim();
    }

    public String getZrz() {
        return zrz;
    }

    public void setZrz(String zrz) {
        this.zrz = zrz == null ? null : zrz.trim();
    }

    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt == null ? null : bt.trim();
    }

    public Date getSj() {
        return sj;
    }

    public void setSj(Date sj) {
        this.sj = sj;
    }


    public Long getZsyh() {
		return zsyh;
	}

	public void setZsyh(Long zsyh) {
		this.zsyh = zsyh;
	}

	public Long getZzyh() {
		return zzyh;
	}

	public void setZzyh(Long zzyh) {
		this.zzyh = zzyh;
	}

	public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    public Short getZt() {
        return zt;
    }

    public void setZt(Short zt) {
        this.zt = zt;
    }

    public String getWh() {
        return wh;
    }

    public void setWh(String wh) {
        this.wh = wh == null ? null : wh.trim();
    }
}