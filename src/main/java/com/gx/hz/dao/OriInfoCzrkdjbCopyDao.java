package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoCzrkdjbCopy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OriInfoCzrkdjbCopyDao extends BaseDao<OriInfoCzrkdjbCopy> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoCzrkdjbCopy record);

    int insertSelective(OriInfoCzrkdjbCopy record);

    OriInfoCzrkdjbCopy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoCzrkdjbCopy record);

    int updateByPrimaryKey(OriInfoCzrkdjbCopy record);

    OriInfoCzrkdjbCopy selectByTPBH(String tpbh);
    List<OriInfoCzrkdjbCopy> selectByTPBHAndUserId(@Param("tpbh") String tpbh,@Param("userId")Integer userId);

    OriInfoCzrkdjbCopy selectByInfoPrimaryId(Long id);
}