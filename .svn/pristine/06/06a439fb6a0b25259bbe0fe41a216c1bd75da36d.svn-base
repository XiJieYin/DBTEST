package com.gx.hz.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDao<T> {
	
	public int insert(T t);
	
	public int updateByPrimaryKey(T t);
	
	public int deleteByPrimaryKey(Serializable id);
	
	public int updateByPrimaryKeySelective(T t);
	
	public T selectByPrimaryKey(Serializable id);
	
	public List<T> selectAll();
	
	public List<T> queryByCondition(Map<String, Object> conditionMap);
	
	public int insertSelective (T t);
}
