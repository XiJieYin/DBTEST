package com.gx.hz.dao;

import com.gx.hz.pojo.StatisticChart;

public interface StatisticChartDao extends BaseDao<StatisticChart> {
	int updateByIdName(StatisticChart sc);
}
