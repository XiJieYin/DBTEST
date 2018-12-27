package com.gx.hz.service;

import com.gx.hz.pojo.OriInfoSfz;

/**
 * Created by ten on 17/12/5.
 */
public interface OriInfoSfzService  extends IBaseService<OriInfoSfz> {


    public int insertSelect(OriInfoSfz oriInfoCzrkdjb);
    public int updateSelect(OriInfoSfz oriInfoCzrkdjb);
    public OriInfoSfz selectByTPBH(String tphb);
    public OriInfoSfz selectByPrimaryId(Long id);

}
