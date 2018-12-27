package com.gx.hz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.HjdjXmbgDao;
import com.gx.hz.pojo.HjdjXmbg;
import com.gx.hz.service.HjdjXmbgService;

@Service("hjdjXmbgService")
public class HjdjXmbgServiceImpl extends BaseServiceImpl<HjdjXmbg> implements HjdjXmbgService {
	@Resource
	private HjdjXmbgDao hjdjXmbgDao;

	@Override
	public BaseDao<HjdjXmbg> getDao() {
		// TODO Auto-generated method stub
		return hjdjXmbgDao;
	}

}
