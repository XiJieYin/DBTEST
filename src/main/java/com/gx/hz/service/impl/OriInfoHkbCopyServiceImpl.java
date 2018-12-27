package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoHkbCopyDao;
import com.gx.hz.pojo.OriInfoByzxlzCopy;
import com.gx.hz.pojo.OriInfoHkbCopy;
import com.gx.hz.service.OriInfoHkbCopyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */
@Service("oriInfoHkbCopyService")
public class OriInfoHkbCopyServiceImpl extends BaseServiceImpl<OriInfoHkbCopy> implements
        OriInfoHkbCopyService {



    @Resource
    OriInfoHkbCopyDao oriInfoHkbCopyDao;

    @Override
    public BaseDao<OriInfoHkbCopy> getDao() {
        return oriInfoHkbCopyDao;
    }

    @Override
    public int insertSelect(OriInfoHkbCopy oriInfoCzrkdjb) {
        return oriInfoHkbCopyDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoHkbCopy oriInfoCzrkdjb) {
        return oriInfoHkbCopyDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoHkbCopy selectByTPBH(String tphb) {
        return oriInfoHkbCopyDao.selectByTPBH(tphb);
    }

    @Override
    public OriInfoHkbCopy selectByPrimaryId(Long id) {
        return oriInfoHkbCopyDao.selectByInfoPrimaryId(id);
    }

    @Override
    public OriInfoHkbCopy selectByTPBHAndUserId(String tphb, Integer userId) {
        List<OriInfoHkbCopy> oriInfoByzxlzCopies=    oriInfoHkbCopyDao.selectByTPBHAndUserId(tphb,userId);
        if(oriInfoByzxlzCopies.size()>0){
            return oriInfoByzxlzCopies.get(0);
        }
        return null;
    }
}
