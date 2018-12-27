package com.gx.hz.service;

import com.gx.hz.pojo.OriInfoCszmCopy;

/**
 * Created by ten on 17/12/5.
 */
public interface OriInfoCszmCopyService extends IBaseService<OriInfoCszmCopy> {


    public int insertSelect(OriInfoCszmCopy oriInfoByzxlz);
    public int updateSelect(OriInfoCszmCopy oriInfoByzxlz);

    public OriInfoCszmCopy selectByTPBH(String tphb);
    public OriInfoCszmCopy selectByPrimaryId(Long id);
    public OriInfoCszmCopy selectByTPBHAndUserId(String tphb,Integer userId);
}
