package com.gx.hz.entity;

/**
 * 
 * 【图片基本信息---不对数据库的实体】
 *
 * @version 
 * @author cyq  2018年1月31日 上午11:03:01
 *
 */
public class ImportImgInfo {

	private String tpbh;
	
	private String imgName;
	
	private String imgPath;
	
	private Integer sxm;

	public String getTpbh() {
		return tpbh;
	}

	public void setTpbh(String tpbh) {
		this.tpbh = tpbh;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public Integer getSxm() {
		return sxm;
	}

	public void setSxm(Integer sxm) {
		this.sxm = sxm;
	}
	
}
