package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoCzrkdjbDao;
import com.gx.hz.pojo.OriInfoCszm;
import com.gx.hz.pojo.OriInfoCzrkdjb;
import com.gx.hz.service.OriInfoCzrkdjbService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */
@Service("oriInfoCzrkdjbService")
public class OriInfoCzrkdjbServiceImpl extends BaseServiceImpl<OriInfoCzrkdjb> implements
        OriInfoCzrkdjbService {



    @Resource
    OriInfoCzrkdjbDao oriInfoCzrkdjbDao;

    @Override
    public BaseDao<OriInfoCzrkdjb> getDao() {
        return oriInfoCzrkdjbDao;
    }

    @Override
    public int insertSelect(OriInfoCzrkdjb oriInfoCzrkdjb) {
        return oriInfoCzrkdjbDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoCzrkdjb oriInfoCzrkdjb) {
        return oriInfoCzrkdjbDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoCzrkdjb selectByTPBH(String tphb) {
        List<OriInfoCzrkdjb> list= oriInfoCzrkdjbDao.selectByTPBH(tphb);

        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public OriInfoCzrkdjb selectByPrimaryId(Long id) {
        return oriInfoCzrkdjbDao.selectByInfoPrimaryId(id);
    }
}
