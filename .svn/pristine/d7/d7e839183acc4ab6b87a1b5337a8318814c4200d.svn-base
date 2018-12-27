package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoByzxlzCopy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OriInfoByzxlzCopyDao extends BaseDao<OriInfoByzxlzCopy>{
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoByzxlzCopy record);

    int insertSelective(OriInfoByzxlzCopy record);

    OriInfoByzxlzCopy selectByPrimaryKey(Long id);

    OriInfoByzxlzCopy selectByTPBH(String tpbh);
    List<OriInfoByzxlzCopy> selectByTPBHAndUserId(@Param("tpbh") String tpbh,@Param("userId")Integer userId);

    OriInfoByzxlzCopy selectByInfoPrimaryId(Long id);

    int updateByPrimaryKeySelective(OriInfoByzxlzCopy record);

    int updateByPrimaryKey(OriInfoByzxlzCopy record);
}