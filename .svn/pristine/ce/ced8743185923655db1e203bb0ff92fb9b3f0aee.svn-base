package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoByzxlz;

import java.util.List;

public interface OriInfoByzxlzDao extends BaseDao<OriInfoByzxlz>{
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoByzxlz record);

    int insertSelective(OriInfoByzxlz record);

    OriInfoByzxlz selectByPrimaryKey(Long id);

    List<OriInfoByzxlz> selectByTPBH(String tpbh);

    OriInfoByzxlz selectByInfoPrimaryId(Long id);

    int updateByPrimaryKeySelective(OriInfoByzxlz record);

    int updateByPrimaryKey(OriInfoByzxlz record);
    
    /**
     * 
     * 【通过图片编号更新信息】
     * 
     * @author cyq 2018年2月7日
     * @param byz
     * @return
     */
    int updateByTpbh(OriInfoByzxlz byz);
}