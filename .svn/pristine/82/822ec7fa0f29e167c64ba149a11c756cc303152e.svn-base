package com.gx.hz.dao;

import java.util.List;

import com.gx.hz.pojo.OriInfoSfz;

public interface OriInfoSfzDao extends BaseDao<OriInfoSfz> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoSfz record);

    int insertSelective(OriInfoSfz record);

    OriInfoSfz selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoSfz record);

    int updateByPrimaryKey(OriInfoSfz record);

    List<OriInfoSfz> selectByTPBH(String tpbh);

    OriInfoSfz selectByInfoPrimaryId(Long id);

    /**
     * 
     * 【通过图片编号更新信息】
     * 
     * @author cyq 2018年2月7日
     * @param ck
     * @return
     */
    int updateByTpbh(OriInfoSfz sfz);
}