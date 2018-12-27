package com.gx.hz.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gx.hz.pojo.InfoLrxxtx;
import com.gx.hz.pojo.InfoYcrz;

public interface InfoLrxxtxDao extends BaseDao<InfoLrxxtx>{
	InfoLrxxtx selectByJzbhAndUserId(@Param("jzbh")String jzbh,@Param("userId")Long userId);
	List<InfoLrxxtx> selectByUserIdAndType(Long userId);
	int queryByConditionByType(Long userId);
	InfoLrxxtx selectByJzbh(String jzbh);
}
