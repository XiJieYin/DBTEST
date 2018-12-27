package com.gx.hz.dao;

import java.util.List;

import com.gx.hz.pojo.OriInfoRhyyxxk;

public interface OriInfoRhyyxxkDao extends BaseDao<OriInfoRhyyxxk> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoRhyyxxk record);

    int insertSelective(OriInfoRhyyxxk record);

    OriInfoRhyyxxk selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoRhyyxxk record);

    int updateByPrimaryKey(OriInfoRhyyxxk record);

    List<OriInfoRhyyxxk> selectByTPBH(String tpbh);

    OriInfoRhyyxxk selectByInfoPrimaryId(Long id);
    
    /**
     * 
     * 【通过图片编号更新信息】
     * 
     * @author cyq 2018年2月7日
     * @param ck
     * @return
     */
    int updateByTpbh(OriInfoRhyyxxk rhyyxxk);
}