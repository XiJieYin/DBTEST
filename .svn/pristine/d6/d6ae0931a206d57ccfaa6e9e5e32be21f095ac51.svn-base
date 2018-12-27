package com.gx.hz.dao;

import com.gx.hz.pojo.OriConsistencyDetail;
import com.gx.hz.pojo.OriInfoByzxlzCopy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by GXKJ on 2018/1/24.
 */
public interface OriConsistencyDetailDao  extends BaseDao<OriConsistencyDetail> {


    int insertSelective(OriConsistencyDetail record);

    OriConsistencyDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKey(OriConsistencyDetail record);


    List<OriConsistencyDetail> getConsistencyDetailByPrimaryId(Long id);


    List<OriConsistencyDetail> findDetailByNameAndTpbh(@Param("name")String name,@Param("tpbh")String tpbh);
    List<OriConsistencyDetail> findDetailByTpbh(@Param("tpbh")String tpbh);

    int deleteByTPBH(@Param("tpbh")String tpbh);
    int deleteByJZBH(@Param("jzbh")String jzbh);
    
    int deleteByTPBHAndName(@Param("tpbh")String tpbh, @Param("name")String name);
    
    List<OriConsistencyDetail> getConsistencyDetailsByJzbh(@Param("jzbh")String jzbh);
}
