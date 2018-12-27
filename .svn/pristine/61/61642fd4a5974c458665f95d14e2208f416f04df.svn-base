package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoFczCopy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OriInfoFczCopyDao extends BaseDao<OriInfoFczCopy> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoFczCopy record);

    int insertSelective(OriInfoFczCopy record);

    OriInfoFczCopy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoFczCopy record);

    int updateByPrimaryKey(OriInfoFczCopy record);

    OriInfoFczCopy selectByTPBH(String tpbh);
    List<OriInfoFczCopy> selectByTPBHAndUserId(@Param("tpbh") String tpbh,@Param("userId")Integer userId);

    OriInfoFczCopy selectByInfoPrimaryId(Long id);
}