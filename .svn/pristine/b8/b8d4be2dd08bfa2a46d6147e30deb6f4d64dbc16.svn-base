package com.gx.hz.dao;

import java.util.List;

import com.gx.hz.pojo.OriInfoJhlhz;

public interface OriInfoJhlhzDao extends BaseDao<OriInfoJhlhz> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoJhlhz record);

    int insertSelective(OriInfoJhlhz record);

    OriInfoJhlhz selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoJhlhz record);

    int updateByPrimaryKey(OriInfoJhlhz record);

    List<OriInfoJhlhz> selectByTPBH(String tpbh);

    OriInfoJhlhz selectByInfoPrimaryId(Long id);
    
    /**
     * 
     * 【通过图片编号更新信息】
     * 
     * @author cyq 2018年2月7日
     * @param ck
     * @return
     */
    int updateByTpbh(OriInfoJhlhz jhlhz);
}