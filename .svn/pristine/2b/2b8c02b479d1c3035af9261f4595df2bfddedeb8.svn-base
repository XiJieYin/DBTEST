package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoByzxlzCopyDao;
import com.gx.hz.pojo.OriInfoByzxlzCopy;
import com.gx.hz.service.OriInfoByzxlzCopyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 *毕业证／学业证service
 * Created by ten on 17/12/4.
 */



@Service("oriInfoByzxlzCopyService")
public class OriInfoByzxlzCopyServiceImpl extends BaseServiceImpl<OriInfoByzxlzCopy> implements
        OriInfoByzxlzCopyService {

    @Resource
    OriInfoByzxlzCopyDao oriInfoByzxlzCopyDao;
    @Override
    public BaseDao<OriInfoByzxlzCopy> getDao() {
        return oriInfoByzxlzCopyDao;
    }


    @Override
    public int insertOriInfoByzxlzCopy(OriInfoByzxlzCopy oriInfoByzxlzCopy) {
        return oriInfoByzxlzCopyDao.insertSelective(oriInfoByzxlzCopy);
    }

    @Override
    public int updateSelect(OriInfoByzxlzCopy oriInfoByzxlzCopy) {
        return oriInfoByzxlzCopyDao.updateByPrimaryKeySelective(oriInfoByzxlzCopy);
    }

    @Override
    public OriInfoByzxlzCopy selectByTPBH(String tphb) {
        return oriInfoByzxlzCopyDao.selectByTPBH(tphb);
    }

    @Override
    public OriInfoByzxlzCopy selectByPrimaryId(Long id) {
        return oriInfoByzxlzCopyDao.selectByInfoPrimaryId(id);
    }

    @Override
    public OriInfoByzxlzCopy selectByTPBHAndUserId(String tphb, Integer userId) {
        List<OriInfoByzxlzCopy>  oriInfoByzxlzCopies=    oriInfoByzxlzCopyDao.selectByTPBHAndUserId(tphb,userId);
        if(oriInfoByzxlzCopies.size()>0){
            return oriInfoByzxlzCopies.get(0);
        }
        return null;
    }
}
