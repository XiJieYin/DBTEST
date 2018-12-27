package com.gx.hz.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 案卷表
 * @author Administrator
 *
 */
public class DosAJ implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 2633345947828279348L;

	private Integer id;

    private String orgCode;

    private String orgName;

    private String bcqx;

    private Integer ajsl;

    private String qzh;

    private String lbh;

    private String mlh;

    private String ajh;

    private String nd;

    private Date ajkssj;//案卷开始时间
    
    private Date ajjssj;//案卷结束时间

    private String ajqzsj;//案卷起止时间

    private Integer userId;

    private Date createTime;

    private Date updateTime;

    private String ajbh;

    private String txmbh;

    private String ajlx;

    private String tm;

    private String ljdw;

    private String xgrid;

    private String xgrmc;

    private Short satae;

    private String ajqzh; //案卷起始号

    private Integer rwId;

    private String rwmc;

    private String ajjsh; //案卷结束号
        
    private Long jzys;
    
    private Long jzsl;
    
    private String bz;
    
    /*卷宗新增数量*/
    private String jzxzsl;
        
	public String getJzxzsl() {
		return jzxzsl;
	}

	public void setJzxzsl(String jzxzsl) {
		this.jzxzsl = jzxzsl;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz == null ? null : bz.trim();;
	}

	public Long getJzsl() {
		return jzsl;
	}

	public void setJzsl(Long jzsl) {
		this.jzsl = jzsl;
	}

	public Long getJzys() {
			return jzys;
		}

		public void setJzys(Long jzys) {
			this.jzys = jzys;
		}


	//未通过Id
    private Long wtgId;
    

    public Long getWtgId() {
		return wtgId;
	}

	public void setWtgId(Long wtgId) {
		this.wtgId = wtgId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }


    public String getBcqx() {
		return bcqx;
	}

	public void setBcqx(String bcqx) {
		this.bcqx = bcqx;
	}

	public Integer getAjsl() {
        return ajsl;
    }

    public void setAjsl(Integer ajsl) {
        this.ajsl = ajsl;
    }

    public String getQzh() {
        return qzh;
    }

    public void setQzh(String qzh) {
        this.qzh = qzh == null ? null : qzh.trim();
    }

    public String getLbh() {
        return lbh;
    }

    public void setLbh(String lbh) {
        this.lbh = lbh == null ? null : lbh.trim();
    }

    public String getMlh() {
        return mlh;
    }

    public void setMlh(String mlh) {
        this.mlh = mlh == null ? null : mlh.trim();
    }

    public String getAjh() {
        return ajh;
    }

    public void setAjh(String ajh) {
        this.ajh = ajh == null ? null : ajh.trim();
    }

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd == null ? null : nd.trim();
    }

    public Date getAjkssj() {
        return ajkssj;
    }

    public void setAjkssj(Date ajkssj) {
        this.ajkssj = ajkssj;
    }

    public String getAjqzsj() {
        return ajqzsj;
    }

    public void setAjqzsj(String ajqzsj) {
        this.ajqzsj = ajqzsj == null ? null : ajqzsj.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAjbh() {
        return ajbh;
    }

    public void setAjbh(String ajbh) {
        this.ajbh = ajbh == null ? null : ajbh.trim();
    }

    public String getTxmbh() {
        return txmbh;
    }

    public void setTxmbh(String txmbh) {
        this.txmbh = txmbh == null ? null : txmbh.trim();
    }

    public String getAjlx() {
        return ajlx;
    }

    public void setAjlx(String ajlx) {
        this.ajlx = ajlx == null ? null : ajlx.trim();
    }

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm == null ? null : tm.trim();
    }

    public String getLjdw() {
        return ljdw;
    }

    public void setLjdw(String ljdw) {
        this.ljdw = ljdw == null ? null : ljdw.trim();
    }

    public String getXgrid() {
        return xgrid;
    }

    public void setXgrid(String xgrid) {
        this.xgrid = xgrid == null ? null : xgrid.trim();
    }

    public String getXgrmc() {
        return xgrmc;
    }

    public void setXgrmc(String xgrmc) {
        this.xgrmc = xgrmc == null ? null : xgrmc.trim();
    }

    public Short getSatae() {
        return satae;
    }

    public void setSatae(Short satae) {
        this.satae = satae;
    }

    public String getAjqzh() {
        return ajqzh;
    }

    public void setAjqzh(String ajqzh) {
        this.ajqzh = ajqzh == null ? null : ajqzh.trim();
    }

    public Integer getRwId() {
        return rwId;
    }

    public void setRwId(Integer rwId) {
        this.rwId = rwId;
    }

    public String getRwmc() {
        return rwmc;
    }

    public void setRwmc(String rwmc) {
        this.rwmc = rwmc == null ? null : rwmc.trim();
    }

    public String getAjjsh() {
        return ajjsh;
    }

    public void setAjjsh(String ajjsh) {
        this.ajjsh = ajjsh == null ? null : ajjsh.trim();
    }

    public Date getAjjssj() {
        return ajjssj;
    }

    public void setAjjssj(Date ajjssj) {
        this.ajjssj = ajjssj;
    }


    //录入人名称
    private String recordPerson;

    private String ajkssjStr;

    private String ajjssjStr;

    public String getAjkssjStr() {
		return ajkssjStr;
	}

	public void setAjkssjStr(String ajkssjStr) {
		this.ajkssjStr = ajkssjStr;
	}

	public String getAjjssjStr() {
		return ajjssjStr;
	}

	public void setAjjssjStr(String ajjssjStr) {
		this.ajjssjStr = ajjssjStr;
	}

    public String getRecordPerson() {
        return recordPerson;
    }

    public void setRecordPerson(String recordPerson) {
        this.recordPerson = recordPerson;
    }
    
    private Short shzt; //案卷审核状态


	public Short getShzt() {
		return shzt;
	}

	public void setShzt(Short shzt) {
		this.shzt = shzt;
	}
    
    
}