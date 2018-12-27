package com.gx.hz.pojo;

import java.util.Date;

public class InfoTxm {
    private Long id;

    private String bh;

    private String bhfw;

    private String lx;
    
    private String orgcode;
    
    private String lxbh;
    
    private Long dycs;
    
    private Long parentId;

    public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getDycs() {
		return dycs;
	}

	public void setDycs(Long dycs) {
		this.dycs = dycs;
	}

	public String getOrgcode() {
		return orgcode;
	}

	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	public String getLxbh() {
		return lxbh;
	}

	public void setLxbh(String lxbh) {
		this.lxbh = lxbh;
	}

	public String getLx() {
		return lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}
 
	private Date cjsj;
	
	public Date getCjsj() {
		return cjsj;
	}

	public void setCjsj(Date cjsj) {
		this.cjsj = cjsj;
	}

	private Date dysj;

    private String dyr;

    private Long userId;

    private Short satas;

    private String ksfw;

    private String jsfw;

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

    public String getBhfw() {
        return bhfw;
    }

    public void setBhfw(String bhfw) {
        this.bhfw = bhfw == null ? null : bhfw.trim();
    }

    public Date getDysj() {
        return dysj;
    }

    public void setDysj(Date dysj) {
        this.dysj = dysj;
    }

    public String getDyr() {
        return dyr;
    }

    public void setDyr(String dyr) {
        this.dyr = dyr == null ? null : dyr.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Short getSatas() {
        return satas;
    }

    public void setSatas(Short satas) {
        this.satas = satas;
    }

    public String getKsfw() {
        return ksfw;
    }

    public void setKsfw(String ksfw) {
        this.ksfw = ksfw == null ? null : ksfw.trim();
    }

    public String getJsfw() {
        return jsfw;
    }

    public void setJsfw(String jsfw) {
        this.jsfw = jsfw == null ? null : jsfw.trim();
    }
}