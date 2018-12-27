package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoLXZCopyDao;
import com.gx.hz.pojo.OriInfoByzxlzCopy;
import com.gx.hz.pojo.OriInfoLXZCopy;
import com.gx.hz.service.OriInfoLXZCopyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */
@Service("oriInfoLXZCopyService")
public class OriInfoLXZCopyServiceImpl extends BaseServiceImpl<OriInfoLXZCopy> implements
        OriInfoLXZCopyService {



    @Resource
    OriInfoLXZCopyDao oriInfoLXZCopyDao;

    @Override
    public BaseDao<OriInfoLXZCopy> getDao() {
        return oriInfoLXZCopyDao;
    }

    @Override
    public int insertSelect(OriInfoLXZCopy oriInfoCzrkdjb) {
        return oriInfoLXZCopyDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoLXZCopy oriInfoCzrkdjb) {
        return oriInfoLXZCopyDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoLXZCopy selectByTPBH(String tphb) {
        return oriInfoLXZCopyDao.selectByTPBH(tphb);
    }

    @Override
    public OriInfoLXZCopy selectByPrimaryId(Long id) {
        return oriInfoLXZCopyDao.selectByInfoPrimaryId(id);
    }

    @Override
    public OriInfoLXZCopy selectByTPBHAndUserId(String tphb, Integer userId) {
        List<OriInfoLXZCopy> oriInfoByzxlzCopies=    oriInfoLXZCopyDao.selectByTPBHAndUserId(tphb,userId);
        if(oriInfoByzxlzCopies.size()>0){
            return oriInfoByzxlzCopies.get(0);
        }
        return null;
    }
}
