package com.dbtest.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface BaseDao {
	@Select(value="${sql}")
	List<Map<String, Object>> select(@Param("sql")String sql);
	@Insert(value="${sql}")
	int insert(@Param("sql")String sql);
	@Delete(value="${sql}")
	int delete(@Param("sql")String sql);
	@Update(value="${sql}")
	int update(@Param("sql")String sql);
	@Select(value="${sql}") 
	int getMaxId(@Param("sql")String sql);

	int createTriggerId(@Param("table")String table);
	
	int createTriggerGuid(@Param("table")String table);
	
	int dropTrigger(@Param("table")String table);
	
	int createGetGuid();
}