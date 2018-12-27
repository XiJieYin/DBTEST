package com.gx.hz.dao;

import org.apache.ibatis.annotations.Param;

import com.gx.hz.pojo.Ckzl;
import com.gx.hz.pojo.Txmwz;

public interface TxmwzDao extends BaseDao<Txmwz>{
	Txmwz queryByCodeAndZzjgdm(@Param("zzjgdm")String zzjgdm,@Param("clbm")String clbm);
}
