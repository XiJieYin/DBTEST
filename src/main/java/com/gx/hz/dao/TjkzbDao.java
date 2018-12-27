package com.gx.hz.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gx.hz.pojo.Tjkzb;

public interface TjkzbDao extends BaseDao<Tjkzb>{
	Tjkzb selectByjzId(Long jzId);

	List<Tjkzb> selectByRwIdAndUserId(@Param("rwId")Long rwId,@Param("userId") Long userId);
}
