package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoTwzCopy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OriInfoTwzCopyDao extends BaseDao<OriInfoTwzCopy> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoTwzCopy record);

    int insertSelective(OriInfoTwzCopy record);

    OriInfoTwzCopy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoTwzCopy record);

    int updateByPrimaryKey(OriInfoTwzCopy record);

    OriInfoTwzCopy selectByTPBH(String tpbh);
    List<OriInfoTwzCopy> selectByTPBHAndUserId(@Param("tpbh") String tpbh,@Param("userId")Integer userId);

    OriInfoTwzCopy selectByInfoPrimaryId(Long id);

}