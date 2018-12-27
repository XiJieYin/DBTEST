package com.gx.hz.dao;

import com.gx.hz.pojo.InfoTxm;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InfoTxmDao extends BaseDao<InfoTxm>{
	int insertSelective(InfoTxm infoTxm);
	int updateByTxmbh(@Param("txmbh") String txmbh);
	List<InfoTxm> selectByTXmbh(@Param("txmbh")String txmbh);
	List<InfoTxm> selectByParentId(Long parentId);
}
