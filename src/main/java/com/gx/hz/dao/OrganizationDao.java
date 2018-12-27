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

import org.apache.ibatis.annotations.Param;

import com.gx.hz.pojo.Organization;
import com.gx.hz.pojo.SysUser;

/**
 * @author hqj
 *
 */
public interface OrganizationDao extends BaseDao<Organization> {
	List<Organization> selectAll(Organization o);
	List<Organization> selectAlls();
	Organization getParentInfo(String parentId);
	Organization getOrgByCode(@Param("zzjgdm")String zzjgdm); //根据编号获取组织机构
	List<Organization> getOrgsByUser(SysUser su);
	List<Organization> getPcsCodeByFjCode(Organization o);
	List<Organization> queryAllFjCode();
	List<Organization> getAsyncOrgTree(Map<String, Object> map);
	List<Organization> findUserOrgTree(Map<String, Object> map);//获取用户权限内的组织结构树
	int updateSsjgdm(Organization o);
	int updateSfyx(Organization o);
	List<Map<String, Object>> queryOrgCodeAndNameInFJ();
	List<Map<String, Object>> queryAllByCondition(Map<String, Object> conditionMap);
	List<Organization> queryByFG();
	Organization queryByZzjgmc(String zzjgmc);
	List<Organization> selectByFgToDm(@Param("dm")String dm,@Param("zzjgdm")String zzjgdm);
}
