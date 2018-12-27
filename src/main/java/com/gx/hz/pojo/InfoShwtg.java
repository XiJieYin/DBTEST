package com.gx.hz.pojo;

import java.util.Date;

public class InfoShwtg {
    private Long id;

    private String bh;

    private Integer sataes;

    private String bz;

    private Long shrId;

    private String shrmc;
    
    private DosJz dosJz;
    
    private DosAJ dosAj;
    
    private TmTmxxbYW tmTmxxbYW;
    
    private TmTmtpxxb tmTmtpxxb;

    private Date createTime;

    private Long userId;

    private Long rwId;
    
    private Integer type;
    
    private String time;
    
    private Integer tmlx;
    
    private Integer wtgs;

    private String tmbh;    
    
  public String getTmbh() {
		return tmbh;
	}

	public void setTmbh(String tmbh) {
		this.tmbh = tmbh;
	}

public Integer getWtgs() {
		return wtgs;
	}

	public void setWtgs(Integer wtgs) {
		this.wtgs = wtgs;
	}

public Integer getTmlx() {
		return tmlx;
	}

	public void setTmlx(Integer tmlx) {
		this.tmlx = tmlx;
	}

public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	//录入人名称
    private String recordPerson;
    
    public String getRecordPerson() {
		return recordPerson;
	}

	public void setRecordPerson(String recordPerson) {
		this.recordPerson = recordPerson;
	}

	public DosAJ getDosAj() {
		return dosAj;
	}

	public void setDosAj(DosAJ dosAj) {
		this.dosAj = dosAj;
	}

	public TmTmxxbYW getTmTmxxbYW() {
		return tmTmxxbYW;
	}

	public void setTmTmxxbYW(TmTmxxbYW tmTmxxbYW) {
		this.tmTmxxbYW = tmTmxxbYW;
	}

	public TmTmtpxxb getTmTmtpxxb() {
		return tmTmtpxxb;
	}

	public void setTmTmtpxxb(TmTmtpxxb tmTmtpxxb) {
		this.tmTmtpxxb = tmTmtpxxb;
	}

	private String rwmc;
	
	private Long jzId;

    public Long getJzId() {
		return jzId;
	}

	public void setJzId(Long jzId) {
		this.jzId = jzId;
	}

	public DosJz getDosJz() {
		return dosJz;
	}

	public void setDosJz(DosJz dosJz) {
		this.dosJz = dosJz;
	}

	public String getRwmc() {
		return rwmc;
	}

	public void setRwmc(String rwmc) {
		this.rwmc = rwmc;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh == null ? null : bh.trim();
    }

    public Integer getSataes() {
        return sataes;
    }

    public void setSataes(Integer sataes) {
        this.sataes = sataes;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public Long getShrId() {
        return shrId;
    }

    public void setShrId(Long shrId) {
        this.shrId = shrId;
    }

    public String getShrmc() {
        return shrmc;
    }

    public void setShrmc(String shrmc) {
        this.shrmc = shrmc == null ? null : shrmc.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRwId() {
        return rwId;
    }

    public void setRwId(Long rwId) {
        this.rwId = rwId;
    }


}