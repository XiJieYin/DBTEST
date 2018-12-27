/**
 * Copyright (C) 2015 GuangZhou GuanXuan Information Technology CO., Ltd. All rights reserved
 *
 * 本代码版权归广州冠宣信息科技有限公司所有，且受到相关的法律保护。
 * 没有经过版权所有者的书面同意，
 * 任何其他个人或组织均不得以任何形式将本文件或本文件的部分代码用于其他商业用途。
 *
 */
package com.gx.hz.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.SysRoleDataDao;
import com.gx.hz.pojo.SysRoleData;
import com.gx.hz.service.SysRoleDataService;

/**
 * 
 * 【请在此写上此类功能描述文字】
 *
 * @version 
 * @author lkx  2017-8-9 下午1:13:26
 *
 */
@Service("sysRoleDataService")
public class SysRoleDataServiceImpl  extends BaseServiceImpl<SysRoleData> implements SysRoleDataService {

	@Resource
	SysRoleDataDao sysRoleDataDao;
	
	@Override
	public BaseDao<SysRoleData> getDao() {
		return sysRoleDataDao;
	}

	@Override
	public List<Map<String, Object>> getOrgDataTreeWithRoleId(Long id) {
		List<Map<String, Object>> list = sysRoleDataDao.queryDataWithRoleId(id);
		return list;
	}

	@Override
	public List<SysRoleData> getOrgDatahRoleId(Integer roleId) {
		return sysRoleDataDao.queryOrgDatahRoleId(roleId);
	}


	/**
	 * 【批量插入和删除无效的数据权限】
	 * 
	 * (non-Javadoc)
	 * @see com.gx.hz.service.SysRoleDataService#addOrUpdateRoleData(java.util.List)
	 */
	@Override
	public void addOrUpdateRoleData(String roleId, String[] addOrgIds,
			String[] delIds)
			throws Exception {
		
		List<SysRoleData> srdList = new ArrayList<SysRoleData>(0);
		if (addOrgIds != null) {
			for (int i = 0 ;i < addOrgIds.length; i ++) {
				SysRoleData srd = new SysRoleData();
				srd.setRoleId(Long.parseLong(roleId));
				srd.setOrgId(addOrgIds[i]);
				srdList.add(srd);
			}
			//插入新增的
			sysRoleDataDao.insertBatch(srdList);
		}
		if (delIds != null) {
			//删除去掉的
			sysRoleDataDao.delBatch(delIds);
		}
	}
	



}
