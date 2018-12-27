package com.gx.hz.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gx.hz.entity.LineChartMonthInfo;
import com.gx.hz.pojo.Tbcxtj;

public interface TbcxtjDao extends BaseDao<Tbcxtj>{
	List<Tbcxtj> selectAll();
	
	List<Integer> selectByNd();
	
	List<Tbcxtj> selectByCxcs(Map <String,Object> params);
	
	List<Tbcxtj> selectAllByNd(Integer nd);
	
	Tbcxtj selectByOrgcode(@Param("orgCode")String orgCode,@Param("type")Integer type, @Param("date")Date date);

	List<Tbcxtj> selectAllByType(@Param("type")Integer type);
	List<Tbcxtj> selectAllByLX();
	/**
	 * 
	 * 根据类型，年度获取每个月的查询次数总和
	 * 
	 * @author cyq 2018年3月2日
	 * @param params
	 * @return
	 */
	List<Integer> selectSearchCount(Map <String,Object> params);
	
	/**
	 * 
	 * 获取查询过的年度
	 * 
	 * @author cyq 2018年3月2日
	 * @return
	 */
	List<String> selectCsYears();
} 
