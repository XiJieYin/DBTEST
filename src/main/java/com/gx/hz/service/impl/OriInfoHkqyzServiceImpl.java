package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoHkqyzDao;
import com.gx.hz.pojo.OriInfoFcz;
import com.gx.hz.pojo.OriInfoHkqyz;
import com.gx.hz.service.OriInfoHkqyzService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */

@Service("oriInfoHkqyzService")
public class OriInfoHkqyzServiceImpl  extends BaseServiceImpl<OriInfoHkqyz> implements
        OriInfoHkqyzService {



    @Resource
    OriInfoHkqyzDao oriInfoHkqyzDao;

    @Override
    public BaseDao<OriInfoHkqyz> getDao() {
        return oriInfoHkqyzDao;
    }

    @Override
    public int insertSelect(OriInfoHkqyz oriInfoCzrkdjb) {
        return oriInfoHkqyzDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoHkqyz oriInfoCzrkdjb) {
        return oriInfoHkqyzDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoHkqyz selectByTPBH(String tphb) {
        List<OriInfoHkqyz> list= oriInfoHkqyzDao.selectByTPBH(tphb);

        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public OriInfoHkqyz selectByPrimaryId(Long id) {
        return oriInfoHkqyzDao.selectByInfoPrimaryId(id);
    }
}
