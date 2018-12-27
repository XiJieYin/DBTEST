package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoHkqyzCopyDao;
import com.gx.hz.pojo.OriInfoByzxlzCopy;
import com.gx.hz.pojo.OriInfoHkqyzCopy;
import com.gx.hz.service.OriInfoHkqyzCopyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */

@Service("oriInfoHkqyzCopyService")
public class OriInfoHkqyzCopyServiceImpl extends BaseServiceImpl<OriInfoHkqyzCopy> implements
        OriInfoHkqyzCopyService {



    @Resource
    OriInfoHkqyzCopyDao oriInfoHkqyzCopyDao;

    @Override
    public BaseDao<OriInfoHkqyzCopy> getDao() {
        return oriInfoHkqyzCopyDao;
    }

    @Override
    public int insertSelect(OriInfoHkqyzCopy oriInfoCzrkdjb) {
        return oriInfoHkqyzCopyDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoHkqyzCopy oriInfoCzrkdjb) {
        return oriInfoHkqyzCopyDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoHkqyzCopy selectByTPBH(String tphb) {
        return oriInfoHkqyzCopyDao.selectByTPBH(tphb);
    }

    @Override
    public OriInfoHkqyzCopy selectByPrimaryId(Long id) {
        return oriInfoHkqyzCopyDao.selectByInfoPrimaryId(id);
    }

    @Override
    public OriInfoHkqyzCopy selectByTPBHAndUserId(String tphb, Integer userId) {
        List<OriInfoHkqyzCopy> oriInfoByzxlzCopies=    oriInfoHkqyzCopyDao.selectByTPBHAndUserId(tphb,userId);
        if(oriInfoByzxlzCopies.size()>0){
            return oriInfoByzxlzCopies.get(0);
        }
        return null;
    }
}
