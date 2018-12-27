package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoTwzCopyDao;
import com.gx.hz.pojo.OriInfoByzxlzCopy;
import com.gx.hz.pojo.OriInfoTwzCopy;
import com.gx.hz.service.OriInfoTwzCopyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */
@Service("oriInfoTwzCopyService")
public class OriInfoTwzCopyServiceImpl extends BaseServiceImpl<OriInfoTwzCopy> implements
        OriInfoTwzCopyService {



    @Resource
    OriInfoTwzCopyDao oriInfoTwzCopyDao;

    @Override
    public BaseDao<OriInfoTwzCopy> getDao() {
        return oriInfoTwzCopyDao;
    }

    @Override
    public int insertSelect(OriInfoTwzCopy oriInfoCzrkdjb) {
        return oriInfoTwzCopyDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoTwzCopy oriInfoCzrkdjb) {
        return oriInfoTwzCopyDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoTwzCopy selectByTPBH(String tphb) {
        return oriInfoTwzCopyDao.selectByTPBH(tphb);
    }

    @Override
    public OriInfoTwzCopy selectByPrimaryId(Long id) {
        return oriInfoTwzCopyDao.selectByInfoPrimaryId(id);
    }

    @Override
    public OriInfoTwzCopy selectByTPBHAndUserId(String tphb, Integer userId) {
        List<OriInfoTwzCopy> oriInfoByzxlzCopies=    oriInfoTwzCopyDao.selectByTPBHAndUserId(tphb,userId);
        if(oriInfoByzxlzCopies.size()>0){
            return oriInfoByzxlzCopies.get(0);
        }
        return null;
    }
}
