package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoSfzCopy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OriInfoSfzCopyDao extends BaseDao<OriInfoSfzCopy> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoSfzCopy record);

    int insertSelective(OriInfoSfzCopy record);

    OriInfoSfzCopy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoSfzCopy record);

    int updateByPrimaryKey(OriInfoSfzCopy record);

    OriInfoSfzCopy selectByTPBH(String tpbh);
    List<OriInfoSfzCopy> selectByTPBHAndUserId(@Param("tpbh") String tpbh,@Param("userId")Integer userId);

    OriInfoSfzCopy selectByInfoPrimaryId(Long id);

}