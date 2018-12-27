package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoCszmCopy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OriInfoCszmCopyDao extends BaseDao<OriInfoCszmCopy>{
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoCszmCopy record);

    int insertSelective(OriInfoCszmCopy record);

    OriInfoCszmCopy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoCszmCopy record);

    int updateByPrimaryKey(OriInfoCszmCopy record);

    OriInfoCszmCopy selectByTPBH(String tpbh);
    List<OriInfoCszmCopy> selectByTPBHAndUserId(@Param("tpbh") String tpbh,@Param("userId")Integer userId);
    OriInfoCszmCopy selectByInfoPrimaryId(Long id);
}