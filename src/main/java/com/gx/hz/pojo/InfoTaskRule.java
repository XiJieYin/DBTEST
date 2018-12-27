package com.gx.hz.pojo;

import java.util.Date;
import java.util.List;
/**
 * 任务规则表
 * @version 
 * @author cyq  2017-12-15 上午11:32:27
 *
 */
public class InfoTaskRule {
	
    private Integer id;

    private String ruleName;

    private Date createTime;

    private Date updateTime;

    private Integer cjr;

    private Integer xgr;

    private Short isEnable;

    private String orgCode;
    
    private String bz;
    
    private List<InfoTaskRuleDetail> dList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
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

    public Integer getCjr() {
        return cjr;
    }

    public void setCjr(Integer cjr) {
        this.cjr = cjr;
    }

    public Integer getXgr() {
        return xgr;
    }

    public void setXgr(Integer xgr) {
        this.xgr = xgr;
    }

    public Short getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Short isEnable) {
        this.isEnable = isEnable;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public List<InfoTaskRuleDetail> getdList() {
		return dList;
	}

	public void setdList(List<InfoTaskRuleDetail> dList) {
		this.dList = dList;
	}
    
}