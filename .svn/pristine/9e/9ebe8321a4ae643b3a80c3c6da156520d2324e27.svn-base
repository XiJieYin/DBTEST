package com.gx.hz.pojo;

import java.math.BigDecimal;

public class Organization {
	//组织机构代码
    private String zzjgdm;
    //组织机构名称
    private String zzjgmc;

    private String zzjglx; //11是市局，12是分局，13是派出所，14是警务室

    private String sfyx; 

    private String ssjgdm;

    private BigDecimal jglx;

    private String remark;

    private String viewmc;

    private Long showindex;
    //非数据库字段
    private String oldZzjgdm;
    
    private String fjjgdm;		//父级机构代码
    
    private String fjjgmc;		//父级机构名称
    

    public String getFjjgdm() {
		return fjjgdm;
	}

	public void setFjjgdm(String fjjgdm) {
		this.fjjgdm = fjjgdm == null ? null : fjjgdm.trim();
	}

	public String getFjjgmc() {
		return fjjgmc;
	}

	public void setFjjgmc(String fjjgmc) {
		this.fjjgmc = fjjgmc == null ? null : fjjgmc.trim();
	}

	/**
	 * @return the oldZzjgdm
	 */
	public String getOldZzjgdm() {
		return oldZzjgdm;
	}

	/**
	 * @param oldZzjgdm the oldZzjgdm to set
	 */
	public void setOldZzjgdm(String oldZzjgdm) {
		this.oldZzjgdm = oldZzjgdm;
	}

	public String getZzjgdm() {
        return zzjgdm;
    }

    public void setZzjgdm(String zzjgdm) {
        this.zzjgdm = zzjgdm == null ? null : zzjgdm.trim();
    }

    public String getZzjgmc() {
        return zzjgmc;
    }

    public void setZzjgmc(String zzjgmc) {
        this.zzjgmc = zzjgmc == null ? null : zzjgmc.trim();
    }

    public String getZzjglx() {
        return zzjglx;
    }

    public void setZzjglx(String zzjglx) {
        this.zzjglx = zzjglx == null ? null : zzjglx.trim();
    }

    public String getSfyx() {
        return sfyx;
    }

    public void setSfyx(String sfyx) {
        this.sfyx = sfyx == null ? null : sfyx.trim();
    }

    public String getSsjgdm() {
        return ssjgdm;
    }

    public void setSsjgdm(String ssjgdm) {
        this.ssjgdm = ssjgdm == null ? null : ssjgdm.trim();
    }

    public BigDecimal getJglx() {
        return jglx;
    }

    public void setJglx(BigDecimal jglx) {
        this.jglx = jglx;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getViewmc() {
        return viewmc;
    }

    public void setViewmc(String viewmc) {
        this.viewmc = viewmc == null ? null : viewmc.trim();
    }

    public Long getShowindex() {
        return showindex;
    }

    public void setShowindex(Long showindex) {
        this.showindex = showindex;
    }
    @Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("代码：" + this.zzjgdm);
		sb.append("|名称：" + this.zzjgmc);
		sb.append("|显示名称：" + this.viewmc);
		sb.append("|类型：" + this.zzjglx);
		sb.append("|排序：" + this.showindex);
		sb.append("|父级：" + this.ssjgdm);
		sb.append("|状态：" + this.sfyx);
		sb.append("|父级代码：" + this.fjjgdm);
		sb.append("|父级名称：" + this.fjjgmc);
		return sb.toString();
	}
}