package com.gx.hz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.HjdjSwzxDao;
import com.gx.hz.pojo.HjdjSwzx;
import com.gx.hz.service.HjdjSwzxService;

@Service("hjdjSwzxService")
public class HjdjSwzxServiceImpl extends BaseServiceImpl<HjdjSwzx> implements HjdjSwzxService {
	@Resource
	private HjdjSwzxDao hjdjSwzxDao;

	@Override
	public BaseDao<HjdjSwzx> getDao() {
		// TODO Auto-generated method stub
		return hjdjSwzxDao;
	}

}
