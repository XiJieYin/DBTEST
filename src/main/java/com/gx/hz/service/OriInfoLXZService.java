package com.gx.hz.service;

import com.gx.hz.pojo.OriInfoLXZ;

/**
 * Created by ten on 17/12/5.
 */
public interface OriInfoLXZService extends IBaseService<OriInfoLXZ> {


    public int insertSelect(OriInfoLXZ oriInfoCzrkdjb);
    public int updateSelect(OriInfoLXZ oriInfoCzrkdjb);

    public OriInfoLXZ selectByTPBH(String tphb);
    public OriInfoLXZ selectByPrimaryId(Long id);

}
