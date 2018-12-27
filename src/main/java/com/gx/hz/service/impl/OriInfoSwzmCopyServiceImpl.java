package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoSwzmCopyDao;
import com.gx.hz.pojo.OriInfoByzxlzCopy;
import com.gx.hz.pojo.OriInfoSwzmCopy;
import com.gx.hz.service.OriInfoSwzmCopyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */

@Service("oriInfoSwzmCopyService")
public class OriInfoSwzmCopyServiceImpl extends BaseServiceImpl<OriInfoSwzmCopy> implements
        OriInfoSwzmCopyService {



    @Resource
    OriInfoSwzmCopyDao oriInfoSwzmCopyDao;

    @Override
    public BaseDao<OriInfoSwzmCopy> getDao() {
        return oriInfoSwzmCopyDao;
    }

    @Override
    public int insertSelect(OriInfoSwzmCopy oriInfoCzrkdjb) {
        return oriInfoSwzmCopyDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoSwzmCopy oriInfoCzrkdjb) {
        return oriInfoSwzmCopyDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoSwzmCopy selectByTPBH(String tphb) {
        return oriInfoSwzmCopyDao.selectByTPBH(tphb);
    }

    @Override
    public OriInfoSwzmCopy selectByPrimaryId(Long id) {
        return oriInfoSwzmCopyDao.selectByInfoPrimaryId(id);
    }

    @Override
    public OriInfoSwzmCopy selectByTPBHAndUserId(String tphb, Integer userId) {
        List<OriInfoSwzmCopy> oriInfoByzxlzCopies=    oriInfoSwzmCopyDao.selectByTPBHAndUserId(tphb,userId);
        if(oriInfoByzxlzCopies.size()>0){
            return oriInfoByzxlzCopies.get(0);
        }
        return null;
    }
}
