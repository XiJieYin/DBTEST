package com.gx.hz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.HjdjQcdjDao;
import com.gx.hz.pojo.HjdjQcdj;
import com.gx.hz.service.HjdjQcdjService;

@Service("hjdjQcdjService")
public class HjdjQcdjServiceImpl extends BaseServiceImpl<HjdjQcdj> implements HjdjQcdjService {
	@Resource
	private HjdjQcdjDao hjdjQcdjDao;

	@Override
	public BaseDao<HjdjQcdj> getDao() {
		// TODO Auto-generated method stub
		return hjdjQcdjDao;
	}

}
