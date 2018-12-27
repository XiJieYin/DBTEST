package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoFczCopyDao;
import com.gx.hz.pojo.OriInfoByzxlzCopy;
import com.gx.hz.pojo.OriInfoFczCopy;
import com.gx.hz.service.OriInfoFczCopyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */
@Service("oriInfoFczCopyService")
public class OriInfoFczCopyServiceImpl extends BaseServiceImpl<OriInfoFczCopy> implements
        OriInfoFczCopyService {



    @Resource
    OriInfoFczCopyDao oriInfoFczCopyDao;

    @Override
    public BaseDao<OriInfoFczCopy> getDao() {
        return oriInfoFczCopyDao;
    }

    @Override
    public int insertSelect(OriInfoFczCopy oriInfoCzrkdjb) {
        return oriInfoFczCopyDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoFczCopy oriInfoCzrkdjb) {
        return oriInfoFczCopyDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoFczCopy selectByTPBH(String tphb) {
        return oriInfoFczCopyDao.selectByTPBH(tphb);
    }

    @Override
    public OriInfoFczCopy selectByPrimaryId(Long id) {
        return oriInfoFczCopyDao.selectByInfoPrimaryId(id);
    }

    @Override
    public OriInfoFczCopy selectByTPBHAndUserId(String tphb, Integer userId) {
        List<OriInfoFczCopy> oriInfoByzxlzCopies=    oriInfoFczCopyDao.selectByTPBHAndUserId(tphb,userId);
        if(oriInfoByzxlzCopies.size()>0){
            return oriInfoByzxlzCopies.get(0);
        }
        return null;
    }
}
