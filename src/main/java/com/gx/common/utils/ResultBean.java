package com.gx.common.utils;

import java.io.Serializable;

public class ResultBean implements Serializable {
	private static final long serialVersionUID = -7989090826871875850L;

	private boolean isSuccess; // 操作是否成功
	private String message; // 操作消息
	private Object objBean = null; // 操作返回对象
	private String title;

	public ResultBean() {
		this.isSuccess = false;
		this.message = "";
	}

	public void setSuccess(String msg) {
		this.isSuccess = true;
		this.message = msg;
	}

	public void setFail(String msg) {
		this.isSuccess = false;
		this.message = msg;

	}

	public ResultBean(boolean isSuccess, String message) {
		this.isSuccess = isSuccess;
		this.message = message;
	}

	public boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
		this.message = "操作成功！";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getObjBean() {
		return objBean;
	}

	public void setObjBean(Object objBean) {
		this.objBean = objBean;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}