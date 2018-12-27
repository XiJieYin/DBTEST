package com.gx.hz.service;

import com.gx.hz.pojo.OriInfoZqz;

/**
 * Created by ten on 17/12/5.
 */
public interface OriInfoZqzService  extends IBaseService<OriInfoZqz> {


    public int insertSelect(OriInfoZqz oriInfoCzrkdjb);
    public int updateSelect(OriInfoZqz oriInfoCzrkdjb);

    public OriInfoZqz selectByTPBH(String tphb);
    public OriInfoZqz selectByPrimaryId(Long id);

}
