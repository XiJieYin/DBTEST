package com.gx.hz.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface OriCommonDao {
	
	/**
	 * 
	 * 动态获取录入表的序列
	 * 
	 * @author cyq 2018年3月30日
	 * @param seqSql
	 * @return
	 */
	int getOriSequence(@Param("seq") String seqSql);
	
	/**
	 * 
	 * 动态插入主表关联信息
	 * 
	 * @author cyq 2018年4月4日
	 * @param insertSql
	 * @return
	 */
	int insertOriPrimary(@Param("insertSql") String insertSql);
	
	/**
	 * 
	 * 动态插入原文录入信息
	 * 
	 * @author cyq 2018年3月30日
	 * @param insertSql
	 * @return
	 */
	int insertOriInfo(@Param("insertSql") String insertSql);

	/**
	 * 
	 * 动态修改原文录入信息
	 * 
	 * @author cyq 2018年4月4日
	 * @param updateSql
	 * @return
	 */
	int updateOriInfo(@Param("updateSql") String updateSql);

	/**
	 * 
	 * 动态删除原文录入信息
	 * 
	 * @author cyq 2018年4月4日
	 * @param updateSql
	 * @return
	 */
	int deleteOriInfo(@Param("deleteSql") String deleteSql);
	
	/**
	 * 
	 * 动态删除原文录入信息
	 * 
	 * @author cyq 2018年4月4日
	 * @param updateSql
	 * @return
	 */
	List<Map<String, Object>> selectOriInfo(@Param("selectSql") String selectSql);
	
	
	/**
	 * 
	 * 根据配置的表名获取录入的数据
	 * 
	 * @author cyq 2018年4月3日
	 * @param tableName
	 * @return
	 */
	Map<String,Object> getOriInfoByTableName(@Param("tableName") String tableName, @Param("ywtpbh") String ywtpbh, @Param("userId") Integer userId);
	
	Map<String,Object> getOriInfoByTableNameAndYwpid(@Param("tableName") String tableName, @Param("ywtpbh") String ywtpbh, @Param("userId") Integer userId,@Param("ywpid") Integer ywpid);
	
	/**
	 * 
	 * 根据配置的表名获取录入的数据
	 * 
	 * @author cyq 2018年4月3日
	 * @param tableName
	 * @return
	 */
	List<Map<String,Object>> getOriInfoByYwtpbh(@Param("tableName") String tableName,@Param("ywtpbh") String ywtpbh);
	
	/**
	 * 
	 * 动态创建原文录入数据库表
	 * 
	 * @author cyq 2018年4月18日
	 * @param colList
	 * @throws Exception
	 */
	public void createTable(@Param("createSql") String createSql) throws Exception;
	
	/**
	 * 
	 * 动态创建原文录入数据序列
	 * 
	 * @author cyq 2018年4月18日
	 * @param createSeq
	 * @throws Exception
	 */
	public void createSequence(@Param("createSeq") String createSeq) throws Exception;
}
