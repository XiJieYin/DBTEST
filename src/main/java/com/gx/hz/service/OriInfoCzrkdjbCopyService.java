package com.gx.hz.service;

import com.gx.hz.pojo.OriInfoCzrkdjbCopy;

/**
 * Created by ten on 17/12/5.
 */
public interface OriInfoCzrkdjbCopyService extends IBaseService<OriInfoCzrkdjbCopy> {


    public int insertSelect(OriInfoCzrkdjbCopy OriInfoCzrkdjbCopy);
    public int updateSelect(OriInfoCzrkdjbCopy OriInfoCzrkdjbCopy);

    public OriInfoCzrkdjbCopy selectByTPBH(String tphb);
    public OriInfoCzrkdjbCopy selectByPrimaryId(Long id);
    public OriInfoCzrkdjbCopy selectByTPBHAndUserId(String tphb,Integer userId);
}
