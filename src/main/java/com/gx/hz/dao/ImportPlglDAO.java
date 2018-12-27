package com.gx.hz.dao;

import java.util.List;
import java.util.Map;

import com.gx.hz.pojo.ImportPlgl;

public interface ImportPlglDAO extends BaseDao<ImportPlgl> {
	public List<ImportPlgl> queryDataPage(Map<String, Object> conditionMap);
	
}
