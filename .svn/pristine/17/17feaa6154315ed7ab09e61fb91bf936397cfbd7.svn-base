package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoCzrkdjb;

import java.util.List;

public interface OriInfoCzrkdjbDao extends BaseDao<OriInfoCzrkdjb> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoCzrkdjb record);

    int insertSelective(OriInfoCzrkdjb record);

    OriInfoCzrkdjb selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoCzrkdjb record);

    int updateByPrimaryKey(OriInfoCzrkdjb record);

    List<OriInfoCzrkdjb> selectByTPBH(String tpbh);

    OriInfoCzrkdjb selectByInfoPrimaryId(Long id);
    
    /**
     * 
     * 【通过图片编号更新信息】
     * 
     * @author cyq 2018年2月7日
     * @param ck
     * @return
     */
    int updateByTpbh(OriInfoCzrkdjb ck);
}