package com.gx.hz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.SysDzclDetailDao;
import com.gx.hz.pojo.SysDzclDetail;
import com.gx.hz.service.SysDzclDetailService;
@Service("sysDzclDetailService")
public class SysDzclDetailServiceImpl extends BaseServiceImpl<SysDzclDetail> implements SysDzclDetailService {
	@Resource
	private SysDzclDetailDao sysDzclDetailDao;

	@Override
	public BaseDao<SysDzclDetail> getDao() {
		// TODO Auto-generated method stub
		return sysDzclDetailDao;
	}

}
