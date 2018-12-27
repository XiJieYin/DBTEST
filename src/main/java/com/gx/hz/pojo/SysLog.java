package com.gx.hz.pojo;

import java.util.Date;


public class SysLog{
	
	public final static int TYPE_LOGIN = 1;//登录
	public final static int TYPE_LOGOUT = 2;//登出
	public final static int TYPE_INSERT = 3;//添加
	public final static int TYPE_UPDATE = 4;//修改
	public final static int TYPE_SELECT = 5;//查询
	public final static int TYPE_DELETE = 6;//删除
	public final static int TYPE_OTHER = 7;//其他
	
    private Long id;//序列

    private Integer userId;//操作用户ID

    private Date logTime;//操作时间

    private String module;//操作的模块

    private String method;//操作方法

    private Integer type;//操作类型   1

    private String remark;//备注

    private String ip;

    private String userName;//操作用户名

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
    
    /**
	 * 构造方法
	 * @param module  模块名称
	 * @param method  方法功能名称
	 * @param type    操作类型
	 * @param remark  操作说明
	 */
	public SysLog(String module, String method, int type, String remark, SysUser user) {
		super();
		this.logTime = new Date();
		this.module = module;
		this.method = method;
		this.type = type;
		this.remark = remark;
		if (user != null) {
			this.userName= user.getUserName();
			this.userId = user.getId();
		}
	}
	
	public SysLog(){
		super();
		this.logTime = new Date();
	}
    
}