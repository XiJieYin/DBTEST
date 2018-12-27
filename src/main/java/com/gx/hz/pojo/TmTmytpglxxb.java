package com.gx.hz.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 条目与图片关联信息实体类
 * @author Administrator
 *
 */
public class TmTmytpglxxb implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6361387512349869009L;

	private Integer id;

    private String tmbh;

    private String tpbh;

    private Integer ym;

    private Date glsj;

    private String clrid;

    private String crlmc;
    
    private Long satae;//状态 0 取消 ，1:正常录用
    
    private Long ywId;

    public Long getYwId() {
		return ywId;
	}

	public void setYwId(Long ywId) {
		this.ywId = ywId;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTmbh() {
        return tmbh;
    }

    public void setTmbh(String tmbh) {
        this.tmbh = tmbh == null ? null : tmbh.trim();
    }

    public String getTpbh() {
        return tpbh;
    }

    public void setTpbh(String tpbh) {
        this.tpbh = tpbh == null ? null : tpbh.trim();
    }

    public Integer getYm() {
        return ym;
    }

    public void setYm(Integer ym) {
        this.ym = ym;
    }

    public Date getGlsj() {
        return glsj;
    }

    public void setGlsj(Date glsj) {
        this.glsj = glsj;
    }

    public String getClrid() {
        return clrid;
    }

    public void setClrid(String clrid) {
        this.clrid = clrid == null ? null : clrid.trim();
    }

    public String getCrlmc() {
        return crlmc;
    }

    public void setCrlmc(String crlmc) {
        this.crlmc = crlmc == null ? null : crlmc.trim();
    }

	public Long getSatae() {
		return satae;
	}

	public void setSatae(Long satae) {
		this.satae = satae;
	}
    
}