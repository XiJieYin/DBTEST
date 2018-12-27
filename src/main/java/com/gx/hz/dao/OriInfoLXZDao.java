package com.gx.hz.dao;

import java.util.List;

import com.gx.hz.pojo.OriInfoLXZ;

public interface OriInfoLXZDao extends BaseDao<OriInfoLXZ> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoLXZ record);

    int insertSelective(OriInfoLXZ record);

    OriInfoLXZ selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoLXZ record);

    int updateByPrimaryKey(OriInfoLXZ record);

    List<OriInfoLXZ> selectByTPBH(String tpbh);

    OriInfoLXZ selectByInfoPrimaryId(Long id);
    
    /**
     * 
     * 【通过图片编号更新信息】
     * 
     * @author cyq 2018年2月7日
     * @param ck
     * @return
     */
    int updateByTpbh(OriInfoLXZ lxz);
}