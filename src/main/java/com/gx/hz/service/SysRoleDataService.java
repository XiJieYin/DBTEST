/**
 * Copyright (C) 2015 GuangZhou GuanXuan Information Technology CO., Ltd. All rights reserved
 *
 * 本代码版权归广州冠宣信息科技有限公司所有，且受到相关的法律保护。
 * 没有经过版权所有者的书面同意，
 * 任何其他个人或组织均不得以任何形式将本文件或本文件的部分代码用于其他商业用途。
 *
 */
package com.gx.hz.service;

import java.util.List;
import java.util.Map;

import com.gx.hz.pojo.SysRoleData;

/**
 * 
 * @version
 * @author lkx 2017年8月1日 上午10:03:25
 * 
 */
public interface SysRoleDataService extends IBaseService<SysRoleData> {
	public List<Map<String, Object>> getOrgDataTreeWithRoleId(Long id);

	/**
	 * 根据角色ID查询所拥有的权限
	 * 
	 * @param id
	 * @return
	 */
	public List<SysRoleData> getOrgDatahRoleId(Integer id);

	/**
	 * 批量插入和删除无效的数据权限
	 * 
	 * @author cyq 2017-12-1
	 * @param srdList
	 * @return
	 */
	public void addOrUpdateRoleData(String roleId, String[] addOrgIds,
			String[] delIds) throws Exception;
}
