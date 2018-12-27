package com.gx.hz.pojo;

import java.util.Date;
import java.util.List;

public class InfoRWJBXX {
	private Integer id;

	private String rwbh;

	private String mc;

	private Long jzsl;

	private Date jhkssj;

	private Date jhjssj;

	private Short zt;  //状态(0、删除 1、未开始 2、进行中  3、已完成)

	private Long wcsl;

	private String cjrmc;

	private Date cjsj;

	private String bz;

	private String ssdwmc;

	private String ssdwdm;

	private String orgCode;
	
	private String orgName;
	
	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	private String rymc;

	private Long ryId;
	
	private String wcclsl;
	
	private String wczjs;
	
	private String wczys;
	
	private String smys;
	
	private String wcjzsl;
	
	private String wcjz;
	
	private String lrys;
	
	private String shys;

    private String ruleId;
    
    private String orgMc;

    private Integer isCheck;
    
    private Integer fzrRoleId;

    public Integer getFzrRoleId() {
		return fzrRoleId;
	}

	public void setFzrRoleId(Integer fzrRoleId) {
		this.fzrRoleId = fzrRoleId;
	}

	public String getOrgMc() {
		return orgMc;
	}

	public void setOrgMc(String orgMc) {
		this.orgMc = orgMc;
	}

	public String getWcclsl() {
		return wcclsl;
	}

	public void setWcclsl(String wcclsl) {
		this.wcclsl = wcclsl;
	}

	public String getWczjs() {
		return wczjs;
	}

	public void setWczjs(String wczjs) {
		this.wczjs = wczjs;
	}

	public String getWczys() {
		return wczys;
	}

	public void setWczys(String wczys) {
		this.wczys = wczys;
	}

	public String getSmys() {
		return smys;
	}

	public void setSmys(String smys) {
		this.smys = smys;
	}

	public String getWcjzsl() {
		return wcjzsl;
	}

	public void setWcjzsl(String wcjzsl) {
		this.wcjzsl = wcjzsl;
	}

	public String getWcjz() {
		return wcjz;
	}

	public void setWcjz(String wcjz) {
		this.wcjz = wcjz;
	}

	public String getLrys() {
		return lrys;
	}

	public void setLrys(String lrys) {
		this.lrys = lrys;
	}

	public String getShys() {
		return shys;
	}

	public void setShys(String shys) {
		this.shys = shys;
	}

	public Long getRyId() {
		return ryId;
	}

	public void setRyId(Long ryId) {
		this.ryId = ryId;
	}

	public String getRymc() {
		return rymc;
	}

	public void setRymc(String rymc) {
		this.rymc = rymc;
	}

	private String fzrmc;

	private Long cjrId;

	private Long fzrId;

	private Date wcsj;
	
	private Long clsl;
	
	private Long zys;
	
	private Long rylx;

	public Long getRylx() {
		return rylx;
	}

	public void setRylx(Long rylx) {
		this.rylx = rylx;
	}

	public Long getClsl() {
		return clsl;
	}

	public void setClsl(Long clsl) {
		this.clsl = clsl;
	}

	public Long getZys() {
		return zys;
	}

	public void setZys(Long zys) {
		this.zys = zys;
	}

	// 非数据库字段
	private String cjrname; // 外键获取的创建人


	private String fzrname; // 外键获取的负责人
	
	private String jhkssjStr;
	
	private String jhjssjStr;
	
    
	private Organization org;

	private List<DictInfo> dictinfos;   //字典中作为档案类型的
	
	

	public String getJhkssjStr() {
		return jhkssjStr;
	}

	public void setJhkssjStr(String jhkssjStr) {
		this.jhkssjStr = jhkssjStr;
	}

	public String getJhjssjStr() {
		return jhjssjStr;
	}

	public void setJhjssjStr(String jhjssjStr) {
		this.jhjssjStr = jhjssjStr;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRwbh() {
		return rwbh;
	}

	public void setRwbh(String rwbh) {
		this.rwbh = rwbh == null ? null : rwbh.trim();
	}

	public String getMc() {
		return mc;
	}

	public void setMc(String mc) {
		this.mc = mc == null ? null : mc.trim();
	}

	public Long getJzsl() {
		return jzsl;
	}

	public void setJzsl(Long jzsl) {
		this.jzsl = jzsl;
	}

	public Date getJhkssj() {
		return jhkssj;
	}

	public void setJhkssj(Date jhkssj) {
		this.jhkssj = jhkssj;
	}

	public Date getJhjssj() {
		return jhjssj;
	}

	public void setJhjssj(Date jhjssj) {
		this.jhjssj = jhjssj;
	}

	public Short getZt() {
		return zt;
	}

	public void setZt(Short zt) {
		this.zt = zt;
	}

	public Long getWcsl() {
		return wcsl;
	}

	public void setWcsl(Long wcsl) {
		this.wcsl = wcsl;
	}

	public String getCjrmc() {
		return cjrmc;
	}

	public void setCjrmc(String cjrmc) {
		this.cjrmc = cjrmc == null ? null : cjrmc.trim();
	}

	public Date getCjsj() {
		return cjsj;
	}

	public void setCjsj(Date cjsj) {
		this.cjsj = cjsj;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz == null ? null : bz.trim();
	}

	public String getSsdwmc() {
		return ssdwmc;
	}

	public void setSsdwmc(String ssdwmc) {
		this.ssdwmc = ssdwmc == null ? null : ssdwmc.trim();
	}

	public String getSsdwdm() {
		return ssdwdm;
	}

	public void setSsdwdm(String ssdwdm) {
		this.ssdwdm = ssdwdm == null ? null : ssdwdm.trim();
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode == null ? null : orgCode.trim();
	}


	public String getFzrmc() {
		return fzrmc;
	}

	public void setFzrmc(String fzrmc) {
		this.fzrmc = fzrmc == null ? null : fzrmc.trim();
	}

	public Long getCjrId() {
		return cjrId;
	}

	public void setCjrId(Long cjrId) {
		this.cjrId = cjrId;
	}

	public Long getFzrId() {
		return fzrId;
	}

	public void setFzrId(Long fzrId) {
		this.fzrId = fzrId;
	}

	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

	public Date getWcsj() {
		return wcsj;
	}

	public void setWcsj(Date wcsj) {
		this.wcsj = wcsj;
	}

	public String getCjrname() {
		return cjrname;
	}

	public void setCjrname(String cjrname) {
		this.cjrname = cjrname;
	}

	public String getFzrname() {
		return fzrname;
	}

	public void setFzrname(String fzrname) {
		this.fzrname = fzrname;
	}

	public List<DictInfo> getDictinfos() {
		return dictinfos;
	}

	public void setDictinfos(List<DictInfo> dictinfos) {
		this.dictinfos = dictinfos;
	}

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public Integer getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
    }



}
