package com.gx.hz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.HjdjZxhkDao;
import com.gx.hz.pojo.HjdjZxhk;
import com.gx.hz.service.HjdjZxhkService;
@Service("hjdjZxhkService")
public class HjdjZxhkServiceImpl extends BaseServiceImpl<HjdjZxhk> implements HjdjZxhkService {
	@Resource
	private HjdjZxhkDao hjdjZxhkDao;

	@Override
	public BaseDao<HjdjZxhk> getDao() {
		// TODO Auto-generated method stub
		return hjdjZxhkDao;
	}

}
