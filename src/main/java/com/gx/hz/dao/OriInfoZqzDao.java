package com.gx.hz.dao;

import java.util.List;

import com.gx.hz.pojo.OriInfoZqz;

public interface OriInfoZqzDao extends BaseDao<OriInfoZqz> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoZqz record);

    int insertSelective(OriInfoZqz record);

    OriInfoZqz selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoZqz record);

    int updateByPrimaryKey(OriInfoZqz record);

    List<OriInfoZqz> selectByTPBH(String tpbh);

    OriInfoZqz selectByInfoPrimaryId(Long id);
    
    /**
     * 
     * 【通过图片编号更新信息】
     * 
     * @author cyq 2018年2月7日
     * @param ck
     * @return
     */
    int updateByTpbh(OriInfoZqz zqz);

}