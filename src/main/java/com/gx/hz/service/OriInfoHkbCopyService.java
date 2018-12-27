package com.gx.hz.service;

import com.gx.hz.pojo.OriInfoHkbCopy;

/**
 * Created by ten on 17/12/5.
 */
public interface OriInfoHkbCopyService extends IBaseService<OriInfoHkbCopy> {


    public int insertSelect(OriInfoHkbCopy oriInfoCzrkdjb);
    public int updateSelect(OriInfoHkbCopy oriInfoCzrkdjb);

    public OriInfoHkbCopy selectByTPBH(String tphb);
    public OriInfoHkbCopy selectByPrimaryId(Long id);
    public OriInfoHkbCopy selectByTPBHAndUserId(String tphb,Integer userId);

}
