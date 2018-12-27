/**
 * Copyright (C) 2015 GuangZhou GuanXuan Information Technology CO., Ltd. All rights reserved
 *
 * 本代码版权归广州冠宣信息科技有限公司所有，且受到相关的法律保护。
 * 没有经过版权所有者的书面同意，
 * 任何其他个人或组织均不得以任何形式将本文件或本文件的部分代码用于其他商业用途。
 *
 */
package com.gx.hz.dao;

import com.gx.hz.pojo.SysMenu;
import com.gx.hz.pojo.SysRole;
import com.gx.hz.pojo.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @version
 * @author cyq 2017-8-1 上午9:18:27
 * 
 */
public interface SysUserDao extends BaseDao<SysUser> {
	void addRS(HashMap<String, Integer> map);

	void deleRS(int userId);

	int fakeDel(int id);

	SysUser checkUserLogin(Map<String, Object> map);

	List<SysMenu> queryUserMenu(SysUser sysUser);

	int resetPWD(SysUser sysUser);

	Integer queryIdByUserName(String userName);

	List<SysUser> getUsersByRole(Integer roleId);

	List<SysUser> getUsersByRoleCode(String roleCode);

	List<SysUser> getUsersByRoleCode(@Param("roleCode") String roleCode, @Param("name") String name,
			@Param("orgCode") String orgCode);

	List<SysUser> getUserByCodeAndOrgCode(Map<String, Object> map);

	List<SysRole> getRoleCodeAll();

	SysUser findUserByUserName(String userName);

	int setRoleIds(SysUser sysUser);

	SysUser checkUserByPki(String idCard);
}
