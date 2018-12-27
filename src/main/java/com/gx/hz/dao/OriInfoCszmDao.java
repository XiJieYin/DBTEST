package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoCszm;

import java.util.List;

public interface OriInfoCszmDao extends BaseDao<OriInfoCszm>{
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoCszm record);

    int insertSelective(OriInfoCszm record);

    OriInfoCszm selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoCszm record);

    int updateByPrimaryKey(OriInfoCszm record);

    List<OriInfoCszm> selectByTPBH(String tpbh);

    OriInfoCszm selectByInfoPrimaryId(Long id);
    
    /**
     * 
     * 【通过图片编号更新信息】
     * 
     * @author cyq 2018年2月7日
     * @param csz
     * @return
     */
    int updateByTpbh(OriInfoCszm csz);
}