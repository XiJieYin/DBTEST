package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoSwzmCopy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OriInfoSwzmCopyDao extends BaseDao<OriInfoSwzmCopy> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoSwzmCopy record);

    int insertSelective(OriInfoSwzmCopy record);

    OriInfoSwzmCopy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoSwzmCopy record);

    int updateByPrimaryKey(OriInfoSwzmCopy record);

    OriInfoSwzmCopy selectByTPBH(String tpbh);
    List<OriInfoSwzmCopy> selectByTPBHAndUserId(@Param("tpbh") String tpbh,@Param("userId")Integer userId);

    OriInfoSwzmCopy selectByInfoPrimaryId(Long id);

}