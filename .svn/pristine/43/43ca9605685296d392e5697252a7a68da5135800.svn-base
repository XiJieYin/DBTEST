package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoSfzCopyDao;
import com.gx.hz.pojo.OriInfoByzxlzCopy;
import com.gx.hz.pojo.OriInfoSfzCopy;
import com.gx.hz.service.OriInfoSfzCopyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */

    @Service("oriInfoSfzCopyService")
    public class OriInfoSfzCopyServiceImpl extends BaseServiceImpl<OriInfoSfzCopy> implements
        OriInfoSfzCopyService {



    @Resource
    OriInfoSfzCopyDao oriInfoSfzCopyDao;

    @Override
    public BaseDao<OriInfoSfzCopy> getDao() {
        return oriInfoSfzCopyDao;
    }

    @Override
    public int insertSelect(OriInfoSfzCopy oriInfoCzrkdjb) {
        return oriInfoSfzCopyDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoSfzCopy oriInfoCzrkdjb) {
        return oriInfoSfzCopyDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoSfzCopy selectByTPBH(String tphb) {
        return oriInfoSfzCopyDao.selectByTPBH(tphb);
    }

    @Override
    public OriInfoSfzCopy selectByPrimaryId(Long id) {
        return oriInfoSfzCopyDao.selectByInfoPrimaryId(id);
    }

    @Override
    public OriInfoSfzCopy selectByTPBHAndUserId(String tphb, Integer userId) {
        List<OriInfoSfzCopy> oriInfoByzxlzCopies=    oriInfoSfzCopyDao.selectByTPBHAndUserId(tphb,userId);
        if(oriInfoByzxlzCopies.size()>0){
            return oriInfoByzxlzCopies.get(0);
        }
        return null;
    }
}
