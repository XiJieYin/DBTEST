package com.gx.hz.dao;

import java.util.List;

import com.gx.hz.pojo.OriInfoHkqyz;

public interface OriInfoHkqyzDao extends BaseDao<OriInfoHkqyz> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoHkqyz record);

    int insertSelective(OriInfoHkqyz record);

    OriInfoHkqyz selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoHkqyz record);

    int updateByPrimaryKey(OriInfoHkqyz record);

    List<OriInfoHkqyz> selectByTPBH(String tpbh);

    OriInfoHkqyz selectByInfoPrimaryId(Long id);
    
    /**
     * 
     * 【通过图片编号更新信息】
     * 
     * @author cyq 2018年2月7日
     * @param ck
     * @return
     */
    int updateByTpbh(OriInfoHkqyz qyz);
}