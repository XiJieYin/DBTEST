/**
 * Copyright (C) 2015 GuangZhou GuanXuan Information Technology CO., Ltd. All rights reserved
 *
 * 本代码版权归广州冠宣信息科技有限公司所有，且受到相关的法律保护。
 * 没有经过版权所有者的书面同意，
 * 任何其他个人或组织均不得以任何形式将本文件或本文件的部分代码用于其他商业用途。
 *
 */
package com.gx.hz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.SysLogDao;
import com.gx.hz.pojo.SysLog;
import com.gx.hz.service.SysLogService;

/**
 * @author hqj
 *
 */
@Service("SysLogService")
public class SysLogServiceImpl extends BaseServiceImpl<SysLog> implements SysLogService {
	@Resource
	SysLogDao sysLogDao;
	/**
	 * 【请在此输入描述文字】
	 * 
	 * (non-Javadoc)
	 * @see com.gx.hz.service.impl.BaseServiceImpl#getDao()
	 */
	@Override
	public BaseDao<SysLog> getDao() {
		// TODO 这是系统自动生成描述，请在此补完后续代码
		return sysLogDao;
	}
	/**
	 * 【请在此输入描述文字】
	 * 
	 * (non-Javadoc)
	 * @see com.gx.hz.service.SysLogService#findSysLogAndSysUser()
	 */
	@Override
	public List<SysLog> findSysLogAndSysUser(){
		List<SysLog>  list=sysLogDao.findSysLogAndSysUser();
		return list;
	}


}
