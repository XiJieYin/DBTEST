package com.gx.hz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.GuidaDao;
import com.gx.hz.pojo.Guida;
import com.gx.hz.service.GuidaService;

@Service("guidaService")
public class GuidaServiceImpl extends BaseServiceImpl<Guida> implements GuidaService {
	@Resource
	private GuidaDao guidaDao;

	@Override
	public BaseDao<Guida> getDao() {
		// TODO Auto-generated method stub
		return guidaDao;
	}

}
