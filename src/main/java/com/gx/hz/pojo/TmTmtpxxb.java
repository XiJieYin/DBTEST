package com.gx.hz.pojo;

import java.io.Serializable;
import java.util.Date;
/**
 * 卷宗图片信息实体类
 * @author Administrator
 *
 */
public class TmTmtpxxb implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6856129019515912627L;

	private Long id;

    private String tpbh;//图片编号

    private String imgpath;//

    private String bh;//关联的是哪一个案卷或卷宗

    private Integer sxm;//顺序码

    private Date uploadTime;

    private String uploadUser;

    private Short lx;//编号类型 案卷－ 0 卷宗－1
    
    private Long satae;//状态 0 取消 ，1:正常录用

    private Long isLr; //是否已经录入 1：已经录入，其它待定

    private Long cleanSatae;//是否清晰图片 0：不清晰 1：清晰

    private Long ywId;

    private String fileName;

    private String childNum;

    private String thumbImg;
    
    private String fileNamess;
    
    private String hzName;
    
    private String tmbh;
    
    public String getTmbh() {
		return tmbh;
	}

	public void setTmbh(String tmbh) {
		this.tmbh = tmbh;
	}

	public OriInfoPrimary getOriInfoPrimary() {
		return oriInfoPrimary;
	}

	public void setOriInfoPrimary(OriInfoPrimary oriInfoPrimary) {
		this.oriInfoPrimary = oriInfoPrimary;
	}
	private OriInfoPrimary oriInfoPrimary;

    public String getHzName() {
		return hzName;
	}

	public void setHzName(String hzName) {
		this.hzName = hzName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getFileNamess() {
		return fileNamess;
	}

	public void setFileNamess(String fileNamess) {
		this.fileNamess = fileNamess;
	}

	public Long getYwId() {
		return ywId;
	}

	public void setYwId(Long ywId) {
		this.ywId = ywId;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTpbh() {
        return tpbh;
    }

    public void setTpbh(String tpbh) {
        this.tpbh = tpbh == null ? null : tpbh.trim();
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh == null ? null : bh.trim();
    }

    public Integer getSxm() {
        return sxm;
    }

    public void setSxm(Integer sxm) {
        this.sxm = sxm;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUploadUser() {
        return uploadUser;
    }

    public void setUploadUser(String uploadUser) {
        this.uploadUser = uploadUser == null ? null : uploadUser.trim();
    }

    public Short getLx() {
        return lx;
    }

    public void setLx(Short lx) {
        this.lx = lx;
    }

	public Long getSatae() {
		return satae;
	}

	public void setSatae(Long satae) {
		this.satae = satae;
	}

    public Long getIsLr() {
        return isLr;
    }

    public void setIsLr(Long isLr) {
        this.isLr = isLr;
    }

    public Long getCleanSatae() {
        return cleanSatae;
    }

    public void setCleanSatae(Long cleanSatae) {
        this.cleanSatae = cleanSatae;
    }

    public void setFileName(String fileName){
        this.fileName=fileName;
    }
    public String getFileName(){
        return fileName;
    }


    public void setChildNum(String childNum){
        this.childNum=childNum;
    }
    public String getChildNum(){
        return childNum;
    }


    public String getThumbImg(){
        return thumbImg;
    }
    public void setThumbImg(String thumbImg){
        this.thumbImg=thumbImg;
    }

}