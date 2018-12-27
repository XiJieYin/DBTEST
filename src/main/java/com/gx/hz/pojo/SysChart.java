package com.gx.hz.pojo;

import java.io.Serializable;
/**
 * 模板配置
 * @author GXKJ
 *
 */
public class SysChart implements Serializable{
    private Integer id;

	private Integer userId;

	private String title;

	private Short status;

	private String sypb;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public String getSypb() {
		return sypb;
	}

	public void setSypb(String sypb) {
		this.sypb = sypb == null ? null : sypb.trim();
	}

}