package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoTxzCopy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OriInfoTxzCopyDao extends BaseDao<OriInfoTxzCopy>{
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoTxzCopy record);

    int insertSelective(OriInfoTxzCopy record);

    OriInfoTxzCopy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoTxzCopy record);

    int updateByPrimaryKey(OriInfoTxzCopy record);

    OriInfoTxzCopy selectByTPBH(String tpbh);
    List<OriInfoTxzCopy> selectByTPBHAndUserId(@Param("tpbh") String tpbh,@Param("userId")Integer userId);

    OriInfoTxzCopy selectByInfoPrimaryId(Long id);
}