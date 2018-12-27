package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoCzrkdjbCopyDao;
import com.gx.hz.pojo.OriInfoByzxlzCopy;
import com.gx.hz.pojo.OriInfoCzrkdjbCopy;
import com.gx.hz.service.OriInfoCzrkdjbCopyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */
@Service("oriInfoCzrkdjbCopyService")
public class OriInfoCzrkdjbCopyServiceImpl extends BaseServiceImpl<OriInfoCzrkdjbCopy> implements
        OriInfoCzrkdjbCopyService {



    @Resource
    OriInfoCzrkdjbCopyDao oriInfoCzrkdjbCopyDao;

    @Override
    public BaseDao<OriInfoCzrkdjbCopy> getDao() {
        return oriInfoCzrkdjbCopyDao;
    }

    @Override
    public int insertSelect(OriInfoCzrkdjbCopy oriInfoCzrkdjbCopy) {
        return oriInfoCzrkdjbCopyDao.insertSelective(oriInfoCzrkdjbCopy);
    }

    @Override
    public int updateSelect(OriInfoCzrkdjbCopy oriInfoCzrkdjbCopy) {
        return oriInfoCzrkdjbCopyDao.updateByPrimaryKeySelective(oriInfoCzrkdjbCopy);
    }

    @Override
    public OriInfoCzrkdjbCopy selectByTPBH(String tphb) {
        return oriInfoCzrkdjbCopyDao.selectByTPBH(tphb);
    }

    @Override
    public OriInfoCzrkdjbCopy selectByPrimaryId(Long id) {
        return oriInfoCzrkdjbCopyDao.selectByInfoPrimaryId(id);
    }

    @Override
    public OriInfoCzrkdjbCopy selectByTPBHAndUserId(String tphb, Integer userId) {
        List<OriInfoCzrkdjbCopy> oriInfoByzxlzCopies=    oriInfoCzrkdjbCopyDao.selectByTPBHAndUserId(tphb,userId);
        if(oriInfoByzxlzCopies.size()>0){
            return oriInfoByzxlzCopies.get(0);
        }
        return null;
    }
}
