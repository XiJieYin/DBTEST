package com.gx.hz.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ESDao {
	public List<Map<String, Object>> search(@Param("table")String table);
}
