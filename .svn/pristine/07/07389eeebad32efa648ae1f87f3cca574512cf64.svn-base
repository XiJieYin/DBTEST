package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoRhyyxxkCopy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OriInfoRhyyxxkCopyDao extends BaseDao<OriInfoRhyyxxkCopy> {
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoRhyyxxkCopy record);

    int insertSelective(OriInfoRhyyxxkCopy record);

    OriInfoRhyyxxkCopy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoRhyyxxkCopy record);

    int updateByPrimaryKey(OriInfoRhyyxxkCopy record);

    OriInfoRhyyxxkCopy selectByTPBH(String tpbh);
    List<OriInfoRhyyxxkCopy> selectByTPBHAndUserId(@Param("tpbh") String tpbh,@Param("userId")Integer userId);

    OriInfoRhyyxxkCopy selectByInfoPrimaryId(Long id);
}