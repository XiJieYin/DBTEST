package com.gx.hz.service;

import com.gx.hz.pojo.OriInfoHkqyz;

/**
 * Created by ten on 17/12/5.
 */
public interface OriInfoHkqyzService  extends IBaseService<OriInfoHkqyz> {


    public int insertSelect(OriInfoHkqyz oriInfoCzrkdjb);
    public int updateSelect(OriInfoHkqyz oriInfoCzrkdjb);



    public OriInfoHkqyz selectByTPBH(String tphb);
    public OriInfoHkqyz selectByPrimaryId(Long id);

}
