package com.gx.hz.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gx.hz.pojo.DictColumn;

public interface DictColumnDao extends BaseDao<DictColumn>{

	/**
	 * 【根据材料ID获取配置的字段的集合】
	 * @author cyq 2018年3月29日
	 * @param materialId
	 * @return
	 */
	List<DictColumn> getColsByMatId(@Param("materialId") Integer materialId);
	
	/**
	 * 【根据录入表ID获取配置的字段的集合】
	 * @author cyq 2018年3月29日
	 * @param materialId
	 * @return
	 */
	List<DictColumn> getColsByTabId(@Param("tableId") Integer tableId);
}
