package com.gx.hz.service;

import com.gx.hz.pojo.OriInfoJhlhzCopy;

/**
 * Created by ten on 17/12/5.
 */
public interface OriInfoJhlhzCopyService extends IBaseService<OriInfoJhlhzCopy> {


    public int insertSelect(OriInfoJhlhzCopy oriInfoCzrkdjb);
    public int updateSelect(OriInfoJhlhzCopy oriInfoCzrkdjb);


    public OriInfoJhlhzCopy selectByTPBH(String tphb);
    public OriInfoJhlhzCopy selectByPrimaryId(Long id);
    public OriInfoJhlhzCopy selectByTPBHAndUserId(String tphb,Integer userId);

}
