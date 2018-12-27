package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.service.IBaseService;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


public abstract class BaseServiceImpl<T> implements IBaseService<T> {
	
	public abstract BaseDao<T> getDao();

    @Transactional
	@Override
	public int add(T t) {
		return getDao().insert(t);
	}

    @Transactional
	@Override
	public int update(T t) {
		return getDao().updateByPrimaryKeySelective(t);
	}

    @Transactional
	@Override
	public int deleteById(Serializable id) {
		return getDao().deleteByPrimaryKey(id);
	}

	@Override
	public T getById(Serializable id) {
		return getDao().selectByPrimaryKey(id);
	}
	

	@Override
	public List<T> queryAll() {
		return getDao().selectAll();
	}

	@Override
	public List<T> queryByCondition(Map<String, Object> conditionMap) {
		return getDao().queryByCondition(conditionMap);
	}
	
}
