package com.gx.hz.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gx.hz.pojo.InfoYcrz;

public interface InfoYcrzDao extends BaseDao<InfoYcrz>{
	List<InfoYcrz> selectByYcrz(@Param("type")String type,@Param("jzbh")String jzbh);
	List<InfoYcrz>  selectByJzbhToType(@Param("jzbh")String jzbh);
	InfoYcrz  selectByTypeAndId(@Param("jzbh")String jzbh,@Param("type") Integer type);
}
