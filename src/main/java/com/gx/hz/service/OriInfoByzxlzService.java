package com.gx.hz.service;

import com.gx.hz.pojo.OriInfoByzxlz;

/**
 * Created by ten on 17/12/4.
 */
public interface OriInfoByzxlzService extends IBaseService<OriInfoByzxlz> {


    public int insertOriInfoByzxlz(OriInfoByzxlz oriInfoByzxlz);
        public int updateSelect(OriInfoByzxlz oriInfoByzxlz);


    public OriInfoByzxlz selectByTPBH(String tphb);
    public OriInfoByzxlz selectByPrimaryId(Long id);



}
