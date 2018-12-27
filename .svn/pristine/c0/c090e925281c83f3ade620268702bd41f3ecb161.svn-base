package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoJhlhzCopyDao;
import com.gx.hz.pojo.OriInfoByzxlzCopy;
import com.gx.hz.pojo.OriInfoJhlhzCopy;
import com.gx.hz.service.OriInfoJhlhzCopyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */
@Service("oriInfoJhlhzCopyService")
public class OriInfoJhlhzCopyServiceImpl extends BaseServiceImpl<OriInfoJhlhzCopy> implements
        OriInfoJhlhzCopyService {



    @Resource
    OriInfoJhlhzCopyDao oriInfoJhlhzCopyDao;

    @Override
    public BaseDao<OriInfoJhlhzCopy> getDao() {
        return oriInfoJhlhzCopyDao;
    }

    @Override
    public int insertSelect(OriInfoJhlhzCopy oriInfoCzrkdjb) {
        return oriInfoJhlhzCopyDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoJhlhzCopy oriInfoCzrkdjb) {
        return oriInfoJhlhzCopyDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoJhlhzCopy selectByTPBH(String tphb) {
        return oriInfoJhlhzCopyDao.selectByTPBH(tphb);
    }

    @Override
    public OriInfoJhlhzCopy selectByPrimaryId(Long id) {
        return oriInfoJhlhzCopyDao.selectByInfoPrimaryId(id);
    }

    @Override
    public OriInfoJhlhzCopy selectByTPBHAndUserId(String tphb, Integer userId) {
        List<OriInfoJhlhzCopy> oriInfoByzxlzCopies=    oriInfoJhlhzCopyDao.selectByTPBHAndUserId(tphb,userId);
        if(oriInfoByzxlzCopies.size()>0){
            return oriInfoByzxlzCopies.get(0);
        }
        return null;
    }

}
