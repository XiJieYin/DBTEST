package com.gx.hz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.DictColumnDao;
import com.gx.hz.pojo.DictColumn;
import com.gx.hz.service.DictColumnService;

@Service("dictColumnService")
public class DictColumnServiceImpl extends BaseServiceImpl<DictColumn> implements DictColumnService{

	@Resource
	DictColumnDao dictColumnDao;
	
	@Override
	public BaseDao<DictColumn> getDao() {
		return dictColumnDao;
	}

	@Override
	public List<DictColumn> getColsByMatId(Integer materialId) {
		return dictColumnDao.getColsByMatId(materialId);
	}

	@Override
	public List<DictColumn> getColsByTabId(Integer tableId) {
		return dictColumnDao.getColsByTabId(tableId);
	}
	
	

}
