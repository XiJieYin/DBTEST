package com.gx.hz.dao;

import java.util.List;

import com.gx.hz.pojo.OriInfoFcz;

public interface OriInfoFczDao extends BaseDao<OriInfoFcz> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoFcz record);

    int insertSelective(OriInfoFcz record);

    OriInfoFcz selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoFcz record);

    int updateByPrimaryKey(OriInfoFcz record);

    List<OriInfoFcz> selectByTPBH(String tpbh);

    OriInfoFcz selectByInfoPrimaryId(Long id);
    
    /**
     * 
     * 【通过图片编号更新信息】
     * 
     * @author cyq 2018年2月7日
     * @param ck
     * @return
     */
    int updateByTpbh(OriInfoFcz fcz);
}