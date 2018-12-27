/**
 * Copyright (C) 2015 GuangZhou GuanXuan Information Technology CO., Ltd. All rights reserved
 *
 * 本代码版权归广州冠宣信息科技有限公司所有，且受到相关的法律保护。
 * 没有经过版权所有者的书面同意，
 * 任何其他个人或组织均不得以任何形式将本文件或本文件的部分代码用于其他商业用途。
 *
 */
package com.gx.hz.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.SysMenuDao;
import com.gx.hz.pojo.SysMenu;
import com.gx.hz.service.SysMenuService;

/**
 * 【请在此写上此类功能描述文字】
 *
 * @version 
 * @author lkx  2017年8月1日 上午10:04:14
 * 
 */
@Service("sysMenuService")
public class SysMenuServiceImpl extends BaseServiceImpl<SysMenu>  implements SysMenuService {

	@Resource
	SysMenuDao sysMenuDao;
	
	
	@Override
	public BaseDao<SysMenu> getDao() {
		return sysMenuDao;
	}
//添加菜单
	@Override
	public int add(SysMenu t) {
		return sysMenuDao.insert(t);
	}
//更新修改菜单
	@Override
	public int update(SysMenu t) {
		return sysMenuDao.updateByPrimaryKeySelective(t);
	}
//根据ID删除菜单
	@Override
	public int deleteById(Serializable id) {
		return sysMenuDao.deleteByPrimaryKey(id);
	}
//根据ID获取菜单
	@Override
	public SysMenu getById(Serializable id) {
		return sysMenuDao.selectByPrimaryKey(id);
	}
//查询所有菜单
	@Override
	public List<SysMenu> queryAll() {
		return sysMenuDao.selectAll();
	}
//根据条件查询菜单
	@Override
	public List<SysMenu> queryByCondition(Map<String, Object> conditionMap) {
		return sysMenuDao.queryByCondition(conditionMap);
	}
	
	
	
}
