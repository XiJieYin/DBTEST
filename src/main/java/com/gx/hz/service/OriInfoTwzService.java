package com.gx.hz.service;

import com.gx.hz.pojo.OriInfoTwz;

/**
 * Created by ten on 17/12/5.
 */
public interface OriInfoTwzService  extends IBaseService<OriInfoTwz> {


    public int insertSelect(OriInfoTwz oriInfoCzrkdjb);
    public int updateSelect(OriInfoTwz oriInfoCzrkdjb);

    public OriInfoTwz selectByTPBH(String tphb);
    public OriInfoTwz selectByPrimaryId(Long id);

}
