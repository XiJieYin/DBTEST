package com.gx.hz.service;

import com.gx.hz.pojo.OriInfoSwzm;

/**
 * Created by ten on 17/12/5.
 */
public interface OriInfoSwzmService  extends IBaseService<OriInfoSwzm> {


    public int insertSelect(OriInfoSwzm oriInfoCzrkdjb);
    public int updateSelect(OriInfoSwzm oriInfoCzrkdjb);

    public OriInfoSwzm selectByTPBH(String tphb);
    public OriInfoSwzm selectByPrimaryId(Long id);
}
