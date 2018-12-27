package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoCszmCopyDao;
import com.gx.hz.pojo.OriInfoByzxlzCopy;
import com.gx.hz.pojo.OriInfoCszmCopy;
import com.gx.hz.service.OriInfoCszmCopyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */

@Service("oriInfoCszmCopyService")
public class OriInfoCszmCopyServiceImpl extends BaseServiceImpl<OriInfoCszmCopy> implements
        OriInfoCszmCopyService {


    @Resource
    OriInfoCszmCopyDao oriInfoCszmCopy;

    @Override
    public BaseDao<OriInfoCszmCopy> getDao() {
        return oriInfoCszmCopy;
    }

    @Override
    public int insertSelect(OriInfoCszmCopy oriInfoByzxlz) {
        return oriInfoCszmCopy.insertSelective(oriInfoByzxlz);
    }

    @Override
    public int updateSelect(OriInfoCszmCopy oriInfoByzxlz) {
        return oriInfoCszmCopy.updateByPrimaryKeySelective(oriInfoByzxlz);
    }

    @Override
    public OriInfoCszmCopy selectByTPBH(String tphb) {
        return oriInfoCszmCopy.selectByTPBH(tphb);
    }

    @Override
    public OriInfoCszmCopy selectByPrimaryId(Long id) {
        return oriInfoCszmCopy.selectByInfoPrimaryId(id);
    }

    @Override
    public OriInfoCszmCopy selectByTPBHAndUserId(String tphb, Integer userId) {
        List<OriInfoCszmCopy> oriInfoByzxlzCopies=    oriInfoCszmCopy.selectByTPBHAndUserId(tphb,userId);
        if(oriInfoByzxlzCopies.size()>0){
            return oriInfoByzxlzCopies.get(0);
        }
        return null;
    }
}
