package com.gx.hz.service;

import com.gx.hz.pojo.OriInfoByzxlzCopy;

/**
 * Created by ten on 17/12/4.
 */
public interface OriInfoByzxlzCopyService extends IBaseService<OriInfoByzxlzCopy> {


    public int insertOriInfoByzxlzCopy(OriInfoByzxlzCopy OriInfoByzxlzCopy);
        public int updateSelect(OriInfoByzxlzCopy OriInfoByzxlzCopy);


    public OriInfoByzxlzCopy selectByTPBH(String tphb);
    public OriInfoByzxlzCopy selectByPrimaryId(Long id);

    public OriInfoByzxlzCopy selectByTPBHAndUserId(String tphb,Integer userId);

}
