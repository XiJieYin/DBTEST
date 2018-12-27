package com.gx.hz.pojo;

public class DictDd {
    private Long id;

    private String code;

    private String ddmc;

    private String dddz;

    private Short isEnable;

    private String remark;

    private String dictDm;
    
    private Integer deleteStatus;
    
    private String zzjgmc;
           
    public String getZzjgmc() {
		return zzjgmc;
	}

	public void setZzjgmc(String zzjgmc) {
		this.zzjgmc = zzjgmc;
	}

	public Integer getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Integer deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDdmc() {
        return ddmc;
    }

    public void setDdmc(String ddmc) {
        this.ddmc = ddmc == null ? null : ddmc.trim();
    }

    public String getDddz() {
        return dddz;
    }

    public void setDddz(String dddz) {
        this.dddz = dddz == null ? null : dddz.trim();
    }

    public Short getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Short isEnable) {
        this.isEnable = isEnable;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDictDm() {
        return dictDm;
    }

    public void setDictDm(String dictDm) {
        this.dictDm = dictDm == null ? null : dictDm.trim();
    }
}