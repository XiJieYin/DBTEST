package com.gx.hz.pojo;

import java.util.Date;
/**
 * 档案库存
 * @author 曾令福
 *
 */
public class DosFilesStock {
    private Integer id;

    private String organization;//组织机构

    private Long organizationId;//组织机构id

    private String address;//存放仓库

    private Long addressId;//存放仓库id

    private String jzType;//档案类型

    private Long jzCount;//卷宗数量

    private Long nowJzCount;

    private Long borrowedJzCount;

    private String remark;//备注

   
    
    private String updateUser;

    private Long updateUserId;

    private Date updateTime;
    
    
    private String gdlx; //归档类型
    
    private Long jzwc; //卷宗完成数量
    
    private String kssj; //起止年月-起
    
    private String jssj;  //起止年月-止
    
    private Long lrxt; //是否录入系统 0-是 1-否
    
    private Long smtp;//是否扫描图片 0-是 1-否
    
    private String gdxt; //归档系统
    
    private String gddnxt; //归档电脑系统
    
    private String gdxtip;//归档系统IP地址
    
    private String kstxm; //起止条形码-起
    
    private String jstxm; //起止条形码-止
    
    private Long sumnumber;  // 合计页数
    
    private Long sumnumberitems; //合计条目数
    
    private Integer deleteStatus;
           
    public Integer getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Integer deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public Long getSumnumber() {
		return sumnumber;
	}

	public void setSumnumber(Long sumnumber) {
		this.sumnumber = sumnumber;
	}

	public Long getSumnumberitems() {
		return sumnumberitems;
	}

	public void setSumnumberitems(Long sumnumberitems) {
		this.sumnumberitems = sumnumberitems;
	}

	
    
    public String getKssj() {
		return kssj;
	}

	public void setKssj(String kssj) {
		this.kssj = kssj;
	}

	public String getJssj() {
		return jssj;
	}

	public void setJssj(String jssj) {
		this.jssj = jssj;
	}

	public Long getLrxt() {
		return lrxt;
	}

	public void setLrxt(Long lrxt) {
		this.lrxt = lrxt;
	}

	public Long getSmtp() {
		return smtp;
	}

	public void setSmtp(Long smtp) {
		this.smtp = smtp;
	}

	public String getGdxt() {
		return gdxt;
	}

	public void setGdxt(String gdxt) {
		this.gdxt = gdxt;
	}

	public String getGddnxt() {
		return gddnxt;
	}

	public void setGddnxt(String gddnxt) {
		this.gddnxt = gddnxt;
	}

	public String getKstxm() {
		return kstxm;
	}

	public void setKstxm(String kstxm) {
		this.kstxm = kstxm;
	}

	public String getJstxm() {
		return jstxm;
	}

	public void setJstxm(String jstxm) {
		this.jstxm = jstxm;
	}

	private String title; //标题内容

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getJzType() {
        return jzType;
    }

    public void setJzType(String jzType) {
        this.jzType = jzType == null ? null : jzType.trim();
    }

    public Long getJzCount() {
        return jzCount;
    }

    public void setJzCount(Long jzCount) {
        this.jzCount = jzCount;
    }

    public Long getNowJzCount() {
        return nowJzCount;
    }

    public void setNowJzCount(Long nowJzCount) {
        this.nowJzCount = nowJzCount;
    }

    public Long getBorrowedJzCount() {
        return borrowedJzCount;
    }

    public void setBorrowedJzCount(Long borrowedJzCount) {
        this.borrowedJzCount = borrowedJzCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	

	public String getGdlx() {
		return gdlx;
	}

	public void setGdlx(String gdlx) {
		this.gdlx = gdlx;
	}

	public Long getJzwc() {
		return jzwc;
	}

	public void setJzwc(Long jzwc) {
		this.jzwc = jzwc;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGdxtip() {
		return gdxtip;
	}

	public void setGdxtip(String gdxtip) {
		this.gdxtip = gdxtip;
	}

}