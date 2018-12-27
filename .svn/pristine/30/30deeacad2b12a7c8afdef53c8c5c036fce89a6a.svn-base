package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoZqzCopyDao;
import com.gx.hz.pojo.OriInfoByzxlzCopy;
import com.gx.hz.pojo.OriInfoZqzCopy;
import com.gx.hz.service.OriInfoZqzCopyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */
@Service("oriInfoZqzCopyService")
public class OriInfoZqzCopyServiceImpl extends BaseServiceImpl<OriInfoZqzCopy> implements
        OriInfoZqzCopyService {



    @Resource
    OriInfoZqzCopyDao oriInfoZqzCopyDao;

    @Override
    public BaseDao<OriInfoZqzCopy> getDao() {
        return oriInfoZqzCopyDao;
    }

    @Override
    public int insertSelect(OriInfoZqzCopy oriInfoCzrkdjb) {
        return oriInfoZqzCopyDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoZqzCopy selectByTPBH(String tphb) {
        List<OriInfoZqzCopy> list= oriInfoZqzCopyDao.selectByTPBH(tphb);

        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
//        return oriInfoZqzCopyDao.selectByTPBH(tphb);
    }

    @Override
    public OriInfoZqzCopy selectByPrimaryId(Long id) {
        return oriInfoZqzCopyDao.selectByInfoPrimaryId(id);
    }

    @Override
    public OriInfoZqzCopy selectByTPBHAndUserId(String tphb, Integer userId) {
        List<OriInfoZqzCopy>  oriInfoByzxlzCopies=    oriInfoZqzCopyDao.selectByTPBHAndUserId(tphb,userId);
        if(oriInfoByzxlzCopies.size()>0){
            return oriInfoByzxlzCopies.get(0);
        }
        return null;
    }

    @Override
    public int updateSelect(OriInfoZqzCopy oriInfoCzrkdjb) {
        return oriInfoZqzCopyDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }
}
