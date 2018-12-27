package com.gx.hz.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gx.hz.pojo.DictTable;

public interface DictTableDao extends BaseDao<DictTable>{

	int delTabAndColByTabId(@Param("tableId") Integer tableId);
	
	int insertTabAndCol(Map<String, Object> parmsMap);
	
	List<DictTable> getTabAndColByTabId(Map<String, Object> parmsMap);
}
