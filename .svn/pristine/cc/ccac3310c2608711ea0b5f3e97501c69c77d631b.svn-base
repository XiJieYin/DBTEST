/**
 * Copyright (C) 2015 GuangZhou GuanXuan Information Technology CO., Ltd. All rights reserved
 *
 * 本代码版权归广州冠宣信息科技有限公司所有，且受到相关的法律保护。
 * 没有经过版权所有者的书面同意，
 * 任何其他个人或组织均不得以任何形式将本文件或本文件的部分代码用于其他商业用途。
 *
 */
package com.gx.hz.dao;

import com.gx.hz.pojo.DosAJ;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 【DosAJmapper接口】
 *
 * @version 
 * @author hqj  2017年8月17日 下午5:11:17
 * 
 */
public interface DosAJDao extends BaseDao<DosAJ> {
	DosAJ  selectAjIdByAjh(int ajh);
	DosAJ checkAjh(String ajh);
	List<Map<String, Object>> countByOrg();
	List<Map<String, Object>> selectByUserId();
//	DosAJ checkAjhs(String ajh);
    int insertSelective(DosAJ record);
	List<DosAJ> selectByRwId(@Param("rwId")Long rwId);
	List<DosAJ> selectByNd(Map<String, Object> conditionMap);
	List<DosAJ> selectAjByJz();
    List<DosAJ> selectAllAjByPage(Map<String, Object> conditionMap); //分页查询所有案卷
	/**
	 * 
	 * 【通过案卷编号查询案卷信息】
	 * 
	 * @author cyq 2018年2月7日
	 * @param jzbh
	 * @return
	 */
	DosAJ selectByAjbh(@Param("ajbh")String ajbh);
	
	int deleteByAjbh(@Param("ajbh")String ajbh);
	
	/**
	 * 
	 * 【通过案卷编号更新案卷信息】
	 * 
	 * @author cyq 2018年2月7日
	 * @param aj
	 * @return
	 */
	public int updateByAjbh(DosAJ aj);
	
	public List<Map<String, Object>> getJZXZSLFromDOS_JZ(@Param("ajbh")String ajbh);
	
}
