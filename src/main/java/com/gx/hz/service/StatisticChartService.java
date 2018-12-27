package com.gx.hz.service;

import com.gx.hz.pojo.StatisticChart;

public interface StatisticChartService extends IBaseService<StatisticChart> {
	public int updateChartsCoordinate(StatisticChart sc);
}
