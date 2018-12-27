package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoJhlhzCopy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OriInfoJhlhzCopyDao extends BaseDao<OriInfoJhlhzCopy> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoJhlhzCopy record);

    int insertSelective(OriInfoJhlhzCopy record);

    OriInfoJhlhzCopy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoJhlhzCopy record);

    int updateByPrimaryKey(OriInfoJhlhzCopy record);

    OriInfoJhlhzCopy selectByTPBH(String tpbh);
    List<OriInfoJhlhzCopy> selectByTPBHAndUserId(@Param("tpbh") String tpbh,@Param("userId")Integer userId);

    OriInfoJhlhzCopy selectByInfoPrimaryId(Long id);
}