package com.gx.hz.service;

import com.gx.hz.pojo.OriInfoSfzCopy;

/**
 * Created by ten on 17/12/5.
 */
public interface OriInfoSfzCopyService extends IBaseService<OriInfoSfzCopy> {


    public int insertSelect(OriInfoSfzCopy oriInfoCzrkdjb);
    public int updateSelect(OriInfoSfzCopy oriInfoCzrkdjb);
    public OriInfoSfzCopy selectByTPBH(String tphb);
    public OriInfoSfzCopy selectByPrimaryId(Long id);
    public OriInfoSfzCopy selectByTPBHAndUserId(String tphb,Integer userId);

}
