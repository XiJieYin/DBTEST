package com.gx.hz.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gx.hz.pojo.DictMaterial;

public interface DictMaterialDao extends BaseDao<DictMaterial>{

	/**
	 * 
	 * 【保存材料字段关联关系 】
	 * 
	 * @author cyq 2018年3月29日
	 * @param parmsMap
	 * @return
	 */
	int insertMatAndCol(Map<String,Object> parmsMap);
	
	/**
	 * 
	 * 【查询材料关联的字段信息】
	 * 
	 * @author cyq 2018年3月29日
	 * @param code
	 * @return
	 */
	List<DictMaterial> getMatAndColByCode(Map<String,Object> parmsMap);
	
	/**
	 * 
	 * 【删除材料字段关联信息】
	 * 
	 * @author cyq 2018年3月29日
	 * @param materialId
	 * @return
	 */
	int delMatAndColByMatId(@Param("materialId") Integer materialId);
	
	/**
	 * 
	 *  CS获取第一层材料列表 
	 * 
	 * @author cyq 2018年5月4日
	 * @return
	 */
	List<DictMaterial> getCsFristType();
	
	/**
	 * 
	 * CS获取第二层材料列表
	 * 
	 * @author cyq 2018年5月4日
	 * @param parentId
	 * @return
	 */
	List<DictMaterial> getCsSecondType(@Param("parentId") Integer parentId);
}
