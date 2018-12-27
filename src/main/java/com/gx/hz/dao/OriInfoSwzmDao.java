package com.gx.hz.dao;

import java.util.List;

import com.gx.hz.pojo.OriInfoSwzm;

public interface OriInfoSwzmDao extends BaseDao<OriInfoSwzm> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoSwzm record);

    int insertSelective(OriInfoSwzm record);

    OriInfoSwzm selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoSwzm record);

    int updateByPrimaryKey(OriInfoSwzm record);

    List<OriInfoSwzm> selectByTPBH(String tpbh);

    OriInfoSwzm selectByInfoPrimaryId(Long id);
    
    /**
     * 
     * 【通过图片编号更新信息】
     * 
     * @author cyq 2018年2月7日
     * @param ck
     * @return
     */
    int updateByTpbh(OriInfoSwzm swzm);

}