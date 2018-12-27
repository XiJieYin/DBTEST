package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoZqzCopy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OriInfoZqzCopyDao extends BaseDao<OriInfoZqzCopy> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoZqzCopy record);

    int insertSelective(OriInfoZqzCopy record);

    OriInfoZqzCopy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoZqzCopy record);

    int updateByPrimaryKey(OriInfoZqzCopy record);

    List<OriInfoZqzCopy> selectByTPBH(String tpbh);
    List<OriInfoZqzCopy> selectByTPBHAndUserId(@Param("tpbh") String tpbh,@Param("userId")Integer userId);

    OriInfoZqzCopy selectByInfoPrimaryId(Long id);

}