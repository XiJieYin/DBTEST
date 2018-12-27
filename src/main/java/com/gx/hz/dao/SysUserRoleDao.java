/**
 * Copyright (C) 2015 GuangZhou GuanXuan Information Technology CO., Ltd. All rights reserved
 *
 * 本代码版权归广州冠宣信息科技有限公司所有，且受到相关的法律保护。
 * 没有经过版权所有者的书面同意，
 * 任何其他个人或组织均不得以任何形式将本文件或本文件的部分代码用于其他商业用途。
 *
 */
package com.gx.hz.dao;

import com.gx.hz.pojo.SysUser;
import com.gx.hz.pojo.SysUserRole;


/**
 * 
 * 【请在此写上此类功能描述文字】
 *
 * @version 
 * @author lkx  2017-8-9 下午1:13:06
 *
 */
public interface SysUserRoleDao extends BaseDao<SysUserRole> {
	public SysUserRole getRoleIdByUserId(int userId);
	public int deleteByUserId(int userId);
	public SysUser getRolesIdByUserId(int userId);
}
