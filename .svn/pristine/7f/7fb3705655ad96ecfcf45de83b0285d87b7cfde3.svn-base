package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoHkqyzCopy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OriInfoHkqyzCopyDao extends BaseDao<OriInfoHkqyzCopy> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoHkqyzCopy record);

    int insertSelective(OriInfoHkqyzCopy record);

    OriInfoHkqyzCopy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoHkqyzCopy record);

    int updateByPrimaryKey(OriInfoHkqyzCopy record);

    OriInfoHkqyzCopy selectByTPBH(String tpbh);
    List<OriInfoHkqyzCopy> selectByTPBHAndUserId(@Param("tpbh") String tpbh,@Param("userId")Integer userId);

    OriInfoHkqyzCopy selectByInfoPrimaryId(Long id);
}