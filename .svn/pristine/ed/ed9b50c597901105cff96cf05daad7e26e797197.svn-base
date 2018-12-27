package com.gx.hz.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gx.hz.pojo.Txmfw;

public interface TxmfwDao extends BaseDao<Txmfw>{
	int insertSelective(Txmfw txmfw);
	List<Txmfw> findByOrgcodeAndLxbh(@Param("orgcode")String orgcode,@Param("lxbh")String lxbh);
}
