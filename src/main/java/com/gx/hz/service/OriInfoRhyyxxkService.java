package com.gx.hz.service;

import com.gx.hz.pojo.OriInfoRhyyxxk;

/**
 * Created by ten on 17/12/5.
 */
public interface OriInfoRhyyxxkService extends IBaseService<OriInfoRhyyxxk> {


    public int insertSelect(OriInfoRhyyxxk oriInfoCzrkdjb);
    public int updateSelect(OriInfoRhyyxxk oriInfoCzrkdjb);
    public OriInfoRhyyxxk selectByTPBH(String tphb);
    public OriInfoRhyyxxk selectByPrimaryId(Long id);

}
