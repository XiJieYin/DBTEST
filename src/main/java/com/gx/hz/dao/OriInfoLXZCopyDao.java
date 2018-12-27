package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoLXZCopy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OriInfoLXZCopyDao extends BaseDao<OriInfoLXZCopy> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoLXZCopy record);

    int insertSelective(OriInfoLXZCopy record);

    OriInfoLXZCopy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoLXZCopy record);

    int updateByPrimaryKey(OriInfoLXZCopy record);

    OriInfoLXZCopy selectByTPBH(String tpbh);
    List<OriInfoLXZCopy> selectByTPBHAndUserId(@Param("tpbh") String tpbh,@Param("userId")Integer userId);

    OriInfoLXZCopy selectByInfoPrimaryId(Long id);
}