package com.gx.hz.dao;

import java.util.List;

import com.gx.hz.pojo.OriInfoTxz;

public interface OriInfoTxzDao extends BaseDao<OriInfoTxz>{
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoTxz record);

    int insertSelective(OriInfoTxz record);

    OriInfoTxz selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoTxz record);

    int updateByPrimaryKey(OriInfoTxz record);

    List<OriInfoTxz> selectByTPBH(String tpbh);

    OriInfoTxz selectByInfoPrimaryId(Long id);
    
    /**
     * 
     * 【通过图片编号更新信息】
     * 
     * @author cyq 2018年2月7日
     * @param ck
     * @return
     */
    int updateByTpbh(OriInfoTxz txz);
}