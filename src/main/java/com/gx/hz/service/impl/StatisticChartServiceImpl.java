package com.gx.hz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.StatisticChartDao;
import com.gx.hz.pojo.StatisticChart;
import com.gx.hz.service.StatisticChartService;
@Service("statisticChart")
public class StatisticChartServiceImpl extends BaseServiceImpl<StatisticChart>
		implements StatisticChartService {
	@Resource
	StatisticChartDao scDao;
	
	@Override
	public BaseDao<StatisticChart> getDao() {
		// TODO Auto-generated method stub
		return scDao;
	}

	@Override
	public int updateChartsCoordinate(StatisticChart sc) {
		
		return scDao.updateByIdName(sc);
	}

	

}
