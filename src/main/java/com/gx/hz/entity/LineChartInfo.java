package com.gx.hz.entity;

/**
 * 
 * 【档案查询次数折线图---不对数据库的实体】
 *
 * @version 
 * @author cyq  2018年3月1日 下午5:32:12
 *
 */
public class LineChartInfo {

	private Object data;
	private String typeCode;
	private String typeName;
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}
