package com.gx.hz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.AnjuanVDao;
import com.gx.hz.dao.BaseDao;
import com.gx.hz.pojo.AnjuanV;
import com.gx.hz.service.AnjuanVService;
@Service("anjuanVService")
public class AnjuanVServiceImpl extends BaseServiceImpl<AnjuanV> implements AnjuanVService {
	
	@Resource
	private AnjuanVDao anjuanVDao;
	
	@Override
	public BaseDao<AnjuanV> getDao() {
		// TODO Auto-generated method stub
		return anjuanVDao;
	}


}
