package com.gx.hz.dao;

import java.util.List;

import com.gx.hz.pojo.OriInfoHkb;

public interface OriInfoHkbDao extends BaseDao<OriInfoHkb> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoHkb record);

    int insertSelective(OriInfoHkb record);

    OriInfoHkb selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoHkb record);

    int updateByPrimaryKey(OriInfoHkb record);

    List<OriInfoHkb> selectByTPBH(String tpbh);

    OriInfoHkb selectByInfoPrimaryId(Long id);
    
    /**
     * 
     * 【通过图片编号更新信息】
     * 
     * @author cyq 2018年2月7日
     * @param ck
     * @return
     */
    int updateByTpbh(OriInfoHkb hkb);
}