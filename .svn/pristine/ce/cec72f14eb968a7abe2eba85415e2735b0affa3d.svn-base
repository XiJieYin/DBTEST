/**
 * Copyright (C) 2015 GuangZhou GuanXuan Information Technology CO., Ltd. All rights reserved
 *
 * 本代码版权归广州冠宣信息科技有限公司所有，且受到相关的法律保护。
 * 没有经过版权所有者的书面同意，
 * 任何其他个人或组织均不得以任何形式将本文件或本文件的部分代码用于其他商业用途。
 *
 */
package com.gx.hz.dao;

import java.util.List;
import java.util.Map;

import com.gx.hz.pojo.SysRoleData;


/**
 * 
 * 【请在此写上此类功能描述文字】
 *
 * @version 
 * @author lkx  2017-8-9 下午1:13:06
 *
 */
public interface SysRoleDataDao extends BaseDao<SysRoleData> {
	public List<Map<String, Object>> queryDataWithRoleId(Long id);
	
	/**
	 * 根据角色主键查询拥有的组织权限
	 * @param id
	 * @return
	 */
	public List<SysRoleData> queryOrgDatahRoleId(Integer roleId);
	
	/**
	 * 批量插入数据权限的数据
	 * 
	 * @author cyq 2017-12-1
	 * @param srdList
	 * @return
	 */
	public int insertBatch(List<SysRoleData> srdList);
	
	/**
	 * 批量删除数据
	 * 
	 * @author cyq 2017-12-1
	 * @param idsList
	 * @return
	 */
	public int delBatch(String[] idsList);
}
