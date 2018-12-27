/**
 * Copyright (C) 2015 GuangZhou GuanXuan Information Technology CO., Ltd. All rights reserved
 *
 * 本代码版权归广州冠宣信息科技有限公司所有，且受到相关的法律保护。
 * 没有经过版权所有者的书面同意，
 * 任何其他个人或组织均不得以任何形式将本文件或本文件的部分代码用于其他商业用途。
 *
 */
package com.gx.common.log.factory;

import java.util.Date;

import com.gx.hz.pojo.SysLog;

/**
 * 日志工厂类
 * 
 * @version
 * @author cyq 2017-11-24 上午10:41:57
 * 
 */
public class LogFactory {

	/**
	 * 记录系统日志
	 * 
	 * @author cyq 2017-11-24
	 * @param userId
	 * @param content
	 * @param method
	 * @param module
	 * @param type
	 * @return
	 */
	public static SysLog createSystemLog(Integer userId,String userName, String content,
			String method, String module, Integer type) {
		SysLog log = new SysLog();
		log.setUserId(userId);
		log.setRemark(content);
		log.setLogTime(new Date());
		log.setMethod(method);
		log.setModule(module);
		log.setType(type);
		log.setUserName(userName);
		return log;
	}

}
