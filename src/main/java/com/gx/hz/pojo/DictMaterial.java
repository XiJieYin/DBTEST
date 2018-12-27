package com.gx.hz.pojo;

import java.util.Date;
import java.util.List;

/**
 * 
 * 【录入材料字典】
 *
 * @version 
 * @author cyq  2018年3月29日 上午10:11:26
 *
 */
public class DictMaterial {
	
	//系统标识
    private Integer id;
    
    /** 系统标识  **/
    private String materialName;
    
    /** 父材料ID **/
    private Integer parentId;
    
    /** 展示顺序 **/
    private Integer showIndex;
    
    /** 是否有效 **/
    private Integer isEnable;
    
    /** 创建时间 **/
    private Date createTime;
    
    /** 更新时间 **/
    private Date updateTime;
    
    /** 创建人 **/
    private Integer createPerson;
    
    /** 更新人 **/
    private Integer updatePerson;
    
    /** 是否录入 **/
    private Integer isEntering;
    
    /** 备注 **/
    private String remark;
    
    /** 类别号 **/
    private String lbh;
    
    /** 材料编码 **/
    private String code;
    
    /** 关联的数据库表 **/
    private String enteringTable;
    
    private List<DictColumn> colList;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getShowIndex() {
        return showIndex;
    }

    public void setShowIndex(Integer showIndex) {
        this.showIndex = showIndex;
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

    public Integer getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(Integer createPerson) {
        this.createPerson = createPerson;
    }

    public Integer getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(Integer updatePerson) {
        this.updatePerson = updatePerson;
    }

	public Integer getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}

	public Integer getIsEntering() {
		return isEntering;
	}

	public void setIsEntering(Integer isEntering) {
		this.isEntering = isEntering;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getLbh() {
		return lbh;
	}

	public void setLbh(String lbh) {
		this.lbh = lbh;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<DictColumn> getColList() {
		return colList;
	}

	public void setColList(List<DictColumn> colList) {
		this.colList = colList;
	}

	public String getEnteringTable() {
		return enteringTable;
	}

	public void setEnteringTable(String enteringTable) {
		this.enteringTable = enteringTable;
	}

}