package com.gx.hz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.HjdjCsdjDao;
import com.gx.hz.pojo.HjdjCsdj;
import com.gx.hz.service.HjdjCsdjService;

@Service("hjdjCsdjService")
public class HjdjCsdjServiceImpl extends BaseServiceImpl<HjdjCsdj> implements HjdjCsdjService {
	@Resource
	private HjdjCsdjDao hjdjCsdjDao;

	@Override
	public BaseDao<HjdjCsdj> getDao() {
		// TODO Auto-generated method stub
		return hjdjCsdjDao;
	}

}
