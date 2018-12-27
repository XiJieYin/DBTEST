package com.gx.hz.dao;

import com.gx.hz.pojo.InfoClglLog;

public interface InfoClglLogDao extends BaseDao<InfoClglLog> {
	
	int insertSelective(InfoClglLog infoClglLog);
	
}
