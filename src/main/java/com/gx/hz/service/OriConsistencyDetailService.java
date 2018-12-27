package com.gx.hz.service;

import com.gx.hz.pojo.OriConsistencyDetail;
import com.gx.hz.pojo.OriInfoByzxlzCopy;

import java.util.List;

/**
 * Created by GXKJ on 2018/1/24.
 */
public interface OriConsistencyDetailService  extends IBaseService<OriConsistencyDetail> {

    public int insertOriConsistencyDetail(OriConsistencyDetail oriConsistencyDetail);

    List<OriConsistencyDetail> getConsistencyDetailByPrimaryId(Long primaryId);

    List<OriConsistencyDetail> findDetailByNameAndTpbh(String name,String tpbh);

    List<OriConsistencyDetail> findDetailByTpbh(String tpbh);

    int deleteByTPBH(String tpbh);
    int deleteByJZBH(String jzbh);

    List<OriConsistencyDetail> getConsistencyDetailsByJzbh(String jzbh);

}
