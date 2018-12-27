/**
 * Copyright (C) 2015 GuangZhou GuanXuan Information Technology CO., Ltd. All rights reserved
 *
 * 本代码版权归广州冠宣信息科技有限公司所有，且受到相关的法律保护。
 * 没有经过版权所有者的书面同意，
 * 任何其他个人或组织均不得以任何形式将本文件或本文件的部分代码用于其他商业用途。
 *
 */
package com.gx.hz.service;

import com.gx.common.utils.ResultBean;
import com.gx.hz.pojo.SysMenu;
import com.gx.hz.pojo.SysRole;
import com.gx.hz.pojo.SysUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @version 
 * @author hqj  2017-8-1 上午9:19:28
 * 
 */
public interface SysUserService extends IBaseService<SysUser>{
	
	ResultBean saveUserRole(String userId,String roleId);
	int fakeDel(int id);
    void loginOut(SysUser sysUser);
	SysUser checkUserLogin(String loginId, String password);
	List<SysMenu> queryUserMenu(SysUser sysUser);
	ResultBean resetPWD(SysUser sysUser);
	ArrayList<Map<String, Object>> getOrgNameAndCode();
    List<SysUser> getUsersByRole(String roleId);
    List<SysUser> getUserByCode(String code,String name);
    List<SysUser> getUserByCodeAndOrgCode(String code,String orgCode);
    List<SysRole> getRoleCodeAll();
	SysUser checkUserByPki(String idCard);
}
