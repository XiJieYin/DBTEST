package com.gx.common.utils;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 分页包装
 * @param <T>
 */
public class PageInfo<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	private int pageNo; //当前页码
	private int pageSize; //当前页条数
	private int total; //总记录

	//数据返回用的
	private List<T> data;
	
	
	public PageInfo() {
		super();
	}

	public PageInfo(int pageNo, int pageSize, int pageCount) {
		super();
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.total = pageCount;
	}

	public PageInfo(int pageNo, int pageSize) {
		super();
		this.pageNo = pageNo;
		this.pageSize = pageSize;
	}
	
	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int pageCount) {
		this.total = pageCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
	

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
