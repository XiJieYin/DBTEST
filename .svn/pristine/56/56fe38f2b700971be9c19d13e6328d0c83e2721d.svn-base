package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoTxzCopyDao;
import com.gx.hz.pojo.OriInfoByzxlzCopy;
import com.gx.hz.pojo.OriInfoTxzCopy;
import com.gx.hz.service.OriInfoTxzCopyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */
@Service("oriInfoTxzCopyService")
public class OriInfoTxzCopyServiceImpl extends BaseServiceImpl<OriInfoTxzCopy> implements
        OriInfoTxzCopyService {



    @Resource
    OriInfoTxzCopyDao oriInfoTxzCopyDao;

    @Override
    public BaseDao<OriInfoTxzCopy> getDao() {
        return oriInfoTxzCopyDao;
    }

    @Override
    public int insertSelect(OriInfoTxzCopy oriInfoCzrkdjb) {
        return oriInfoTxzCopyDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoTxzCopy oriInfoCzrkdjb) {
        return oriInfoTxzCopyDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoTxzCopy selectByTPBH(String tphb) {
        return oriInfoTxzCopyDao.selectByTPBH(tphb);
    }

    @Override
    public OriInfoTxzCopy selectByPrimaryId(Long id) {
        return oriInfoTxzCopyDao.selectByInfoPrimaryId(id);
    }

    @Override
    public OriInfoTxzCopy selectByTPBHAndUserId(String tphb, Integer userId) {
        List<OriInfoTxzCopy> oriInfoByzxlzCopies=    oriInfoTxzCopyDao.selectByTPBHAndUserId(tphb,userId);
        if(oriInfoByzxlzCopies.size()>0){
            return oriInfoByzxlzCopies.get(0);
        }
        return null;
    }
}
