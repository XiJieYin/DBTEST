package com.gx.hz.dao;

import com.gx.hz.pojo.DosJzInfoRwjbxx;


/**
 * 任务基本信息表Dao
 * @author ten
 *
 */
public interface DosJzInfoRwjbxxDao extends BaseDao<DosJzInfoRwjbxx> {
    int deleteByPrimaryKey(Long id);

    int insert(DosJzInfoRwjbxx record);

    int insertSelective(DosJzInfoRwjbxx record);

    DosJzInfoRwjbxx selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DosJzInfoRwjbxx record);

    int updateByPrimaryKey(DosJzInfoRwjbxx record);

    void deleteDosJzInfoRwjbxx(int rwId);
    
}