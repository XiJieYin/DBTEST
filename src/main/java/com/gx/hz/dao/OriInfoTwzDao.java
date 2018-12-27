package com.gx.hz.dao;

import java.util.List;

import com.gx.hz.pojo.OriInfoTwz;

public interface OriInfoTwzDao extends BaseDao<OriInfoTwz> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoTwz record);

    int insertSelective(OriInfoTwz record);

    OriInfoTwz selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoTwz record);

    int updateByPrimaryKey(OriInfoTwz record);

    List<OriInfoTwz> selectByTPBH(String tpbh);

    OriInfoTwz selectByInfoPrimaryId(Long id);

    /**
     * 
     * 【通过图片编号更新信息】
     * 
     * @author cyq 2018年2月7日
     * @param ck
     * @return
     */
    int updateByTpbh(OriInfoTwz twz);
}