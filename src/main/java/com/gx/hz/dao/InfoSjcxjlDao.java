package com.gx.hz.dao;

import com.gx.hz.pojo.InfoSjcxjl;
import com.gx.hz.pojo.OriInfoFcz;

/**
 * Created by ten on 17/12/15.
 */
public interface InfoSjcxjlDao extends BaseDao<InfoSjcxjl>  {

    int deleteByPrimaryKey(Long id);

    int insert(OriInfoFcz record);

    int insertSelective(InfoSjcxjl record);

    int updateByPrimaryKeySelective(InfoSjcxjl record);

    int updateByPrimaryKey(InfoSjcxjl record);

    InfoSjcxjl selectByYWZBID(Long id);
    

}
