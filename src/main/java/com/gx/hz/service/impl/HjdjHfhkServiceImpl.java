package com.gx.hz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.HjdjHfhkDao;
import com.gx.hz.pojo.HjdjHfhk;
import com.gx.hz.service.HjdjHfhkService;

@Service("hjdjHfhkService")
public class HjdjHfhkServiceImpl extends BaseServiceImpl<HjdjHfhk> implements HjdjHfhkService {
	@Resource
	private HjdjHfhkDao hjdjHfhkDao;

	@Override
	public BaseDao<HjdjHfhk> getDao() {
		// TODO Auto-generated method stub
		return hjdjHfhkDao;
	}

}
