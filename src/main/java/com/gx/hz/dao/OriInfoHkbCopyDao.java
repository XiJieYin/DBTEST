package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoHkbCopy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OriInfoHkbCopyDao extends BaseDao<OriInfoHkbCopy> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoHkbCopy record);

    int insertSelective(OriInfoHkbCopy record);

    OriInfoHkbCopy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoHkbCopy record);

    int updateByPrimaryKey(OriInfoHkbCopy record);

    OriInfoHkbCopy selectByTPBH(String tpbh);
    List<OriInfoHkbCopy> selectByTPBHAndUserId(@Param("tpbh") String tpbh,@Param("userId")Integer userId);

    OriInfoHkbCopy selectByInfoPrimaryId(Long id);
}