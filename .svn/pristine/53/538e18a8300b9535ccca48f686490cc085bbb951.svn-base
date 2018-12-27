package com.gx.hz.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 通用业务类
 *
 * @param <T>
 */
public interface IBaseService<T> {
	
	/**
	 * 添加实体
	 *
	 * @param t
	 */
	public abstract int add(T t);
	
	/**
	 * 修改实体
	 *
	 * @param t
	 */
	public abstract int update(T t);
	
	/**
	 * 删除实体
	 *
	 * @param id
	 */
	public abstract int deleteById(Serializable id);
	
	/**
	 * 根据id查询
	 *
	 * @param id
	 */
	public abstract T getById(Serializable id);
	
	/**
	 * 查询所有实体
	 *
	 * @return
	 */
	public abstract List<T> queryAll();
	
	/**
	 * 条件查询所有实体
	 *
	 * @param conditionMap
	 * @return
	 */
	public abstract List<T> queryByCondition(Map<String, Object> conditionMap);
	
}
