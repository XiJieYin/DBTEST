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
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.SysRoleMenuDao;
import com.gx.hz.pojo.SysRoleMenu;
import com.gx.hz.service.SysRoleMenuService;

/**
 * 
 * 【请在此写上此类功能描述文字】
 *
 * @version 
 * @author lkx  2017-8-9 下午1:13:26
 *
 */
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl  extends BaseServiceImpl<SysRoleMenu> implements SysRoleMenuService {

	/**
	 * 【请在此输入描述文字】
	 * 
	 * (non-Javadoc)
	 * @see com.gx.hz.service.impl.BaseServiceImpl#getDao()
	 */
	@Resource
    private SysRoleMenuDao sysRoleMenuDao;

	@Override
	public BaseDao<SysRoleMenu> getDao() {
		// TODO Auto-generated method stub
		return sysRoleMenuDao;
	}

	@Override
	public List<Map<String, Object>> getMenuTreeWithRoleId(int id) {
		return sysRoleMenuDao.queryMenuWithRoleId(id);
	}
	
	



}
