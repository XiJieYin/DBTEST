package com.gx.hz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.ScanStatisticRwDao;
import com.gx.hz.pojo.ScanStatisticRw;
import com.gx.hz.service.ScanStatisticRwService;
@Service("scanStatisticRwService")
public class ScanStatisticRwServiceImpl extends BaseServiceImpl<ScanStatisticRw>implements ScanStatisticRwService {
	
	@Resource //注入
	ScanStatisticRwDao scanStatisticRwDao;
	
	@Override
	public BaseDao<ScanStatisticRw> getDao() {
		// 系统自动建立的方法
		return scanStatisticRwDao;
	}

	@Override
	public List<ScanStatisticRw> findScanStatisticRwByPage() {

		List<ScanStatisticRw>  list = scanStatisticRwDao.findScanStatisticRwByPage();
		return list;
	}
	

}
