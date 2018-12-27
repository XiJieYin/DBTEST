package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoSfzDao;
import com.gx.hz.pojo.OriInfoFcz;
import com.gx.hz.pojo.OriInfoSfz;
import com.gx.hz.service.OriInfoSfzService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */

    @Service("oriInfoSfzService")
public class OriInfoSfzServiceImpl extends BaseServiceImpl<OriInfoSfz> implements
        OriInfoSfzService {



    @Resource
    OriInfoSfzDao oriInfoSfzDao;

    @Override
    public BaseDao<OriInfoSfz> getDao() {
        return oriInfoSfzDao;
    }

    @Override
    public int insertSelect(OriInfoSfz oriInfoCzrkdjb) {
        return oriInfoSfzDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoSfz oriInfoCzrkdjb) {
        return oriInfoSfzDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoSfz selectByTPBH(String tphb) {
        List<OriInfoSfz> list= oriInfoSfzDao.selectByTPBH(tphb);

        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public OriInfoSfz selectByPrimaryId(Long id) {
        return oriInfoSfzDao.selectByInfoPrimaryId(id);
    }
}
