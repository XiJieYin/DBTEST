package com.gx.hz.pojo;

public class ScanStatisticRw {

	public static int SS_SUBSTATION_yuexiu = 1;//越秀分局
	public static int SS_SUBSTATION_tianhe = 2;//天河分局
	public static int SS_SUBSTATION_liwan = 3;// 荔湾分局
	public static int SS_SUBSTATION_baiyun = 4;// 白云分局
	public static int SS_SUBSTATION_huangpu = 5;// 黄埔分局
	public static int SS_SUBSTATION_haizhu = 6;// 海珠分局
	public static int SS_SUBSTATION_panyu = 7;// 番禺分局
	public static int SS_SUBSTATION_huadu = 8;// 花都分局
	public static int SS_SUBSTATION_nansha = 9;// 南沙分局
	public static int SS_SUBSTATION_conghua = 10;// 从化分局
	public static int SS_SUBSTATION_zengcheng = 11;// 增城分局
	
	public static int DA_TYPE_CZRKDJB = 1 ; //常住人口登记表
	public static int DA_TYPE_RKKP =2  ; //人口卡片
	public static int DA_TYPE_SFZDK =3  ; //身份证底卡
	public static int DA_TYPE_CSZMCL =4  ; //出生证明材料
	public static int DA_TYPE_QRZMCL = 5 ; //迁入证明材料
	public static int DA_TYPE_QCZMCL = 6 ; //迁出证明材料
	public static int DA_TYPE_SNYJCL = 7 ; //市内移居材料
	public static int DA_TYPE_XMBGCL =8 ; //项目变更材料
	public static int DA_TYPE_SFZBLCL = 9 ; //身份证办理材料
	public static int DA_TYPE_LSSFZCL = 10 ; //临时身份证材料
	public static int DA_TYPE_MPSBCL = 11 ; //门牌申办材料
	public static int DA_TYPE_SWZMCL =12  ; //死亡证明材料
	public static int DA_TYPE_ZDRKCL = 13 ; //重点人口材料
	public static int DA_TYPE_BJTXZCL = 14 ; //边境通行证材料
	public static int DA_TYPE_SFZSXMDJB = 15 ; //身份证顺序码登记表
	public static int DA_TYPE_NZRKTJB = 16 ; //年终人口统计表
	
	
	public static int SCAN_RW_STATUS_done = 1;//完成
	public static int SCAN_RW_STATUS_undone = 0;//未完成
	
	 private int id;//序列
	 
	 private String rwName;//任务名
	 
	 private int jzCount; //卷宗数量
	 
	 private int clCount; //材料数量
	 
	 private Integer ssSubStation; //所属分局
	 
	 private String ssPoliceStation; //所属派出所
	 
	 private Integer scanRwStatus; //状态
	 
	 private Integer daType; //档案类型


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRwName() {
		return rwName;
	}


	public void setRwName(String rwName) {
		this.rwName = rwName;
	}


	public int getJzCount() {
		return jzCount;
	}


	public void setJzCount(int jzCount) {
		this.jzCount = jzCount;
	}


	public int getClCount() {
		return clCount;
	}


	public void setClCount(int clCount) {
		this.clCount = clCount;
	}


	public Integer getSsSubStation() {
		return ssSubStation;
	}


	public void setSsSubStation(Integer ssSubStation) {
		this.ssSubStation = ssSubStation;
	}


	public String getSsPoliceStation() {
		return ssPoliceStation;
	}


	public void setSsPoliceStation(String ssPoliceStation) {
		this.ssPoliceStation = ssPoliceStation;
	}


	public Integer getScanRwStatus() {
		return scanRwStatus;
	}


	public void setScanRwStatus(Integer scanRwStatus) {
		this.scanRwStatus = scanRwStatus;
	}


	public Integer getDaType() {
		return daType;
	}


	public void setDaType(Integer daType) {
		this.daType = daType;
	}


	/**
	  * 构造方法
	  * @param module  模块名称
	  * @param method  方法功能名称
	  * @param scanRwStatus    完成状态
	  */
	public ScanStatisticRw() {
		super();
	}


	public ScanStatisticRw(int id, String rwName, int jzCount, int clCount,
			int ssSubStation, String ssPoliceStation, int scanRwStatus, int daType) {
		super();
		this.id = id;
		this.rwName = rwName;
		this.jzCount = jzCount;
		this.clCount = clCount;
		this.ssSubStation = ssSubStation;
		this.ssPoliceStation = ssPoliceStation;
		this.scanRwStatus = scanRwStatus;
		this.daType = daType;
	}
	 
}
