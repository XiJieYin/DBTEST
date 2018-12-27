package com.gx.hz.service;

import com.gx.hz.pojo.OriInfoTxzCopy;

/**
 * Created by ten on 17/12/5.
 */
public interface OriInfoTxzCopyService extends IBaseService<OriInfoTxzCopy> {


    public int insertSelect(OriInfoTxzCopy oriInfoCzrkdjb);
    public int updateSelect(OriInfoTxzCopy oriInfoCzrkdjb);

    public OriInfoTxzCopy selectByTPBH(String tphb);
    public OriInfoTxzCopy selectByPrimaryId(Long id);
    public OriInfoTxzCopy selectByTPBHAndUserId(String tphb,Integer userId);

}
