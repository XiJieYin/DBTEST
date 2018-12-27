package com.gx.hz.service;

import com.gx.hz.pojo.OriInfoLXZCopy;

/**
 * Created by ten on 17/12/5.
 */
public interface OriInfoLXZCopyService extends IBaseService<OriInfoLXZCopy> {


    public int insertSelect(OriInfoLXZCopy oriInfoCzrkdjb);
    public int updateSelect(OriInfoLXZCopy oriInfoCzrkdjb);

    public OriInfoLXZCopy selectByTPBH(String tphb);
    public OriInfoLXZCopy selectByPrimaryId(Long id);
    public OriInfoLXZCopy selectByTPBHAndUserId(String tphb,Integer userId);

}
