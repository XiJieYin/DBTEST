package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoFczDao;
import com.gx.hz.pojo.OriInfoCzrkdjb;
import com.gx.hz.pojo.OriInfoFcz;
import com.gx.hz.service.OriInfoFczService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */
@Service("oriInfoFczService")
public class OriInfoFczServiceImpl extends BaseServiceImpl<OriInfoFcz> implements
        OriInfoFczService {



    @Resource
    OriInfoFczDao oriInfoFczDao;

    @Override
    public BaseDao<OriInfoFcz> getDao() {
        return oriInfoFczDao;
    }

    @Override
    public int insertSelect(OriInfoFcz oriInfoCzrkdjb) {
        return oriInfoFczDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoFcz oriInfoCzrkdjb) {
        return oriInfoFczDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoFcz selectByTPBH(String tphb) {
        List<OriInfoFcz> list= oriInfoFczDao.selectByTPBH(tphb);

        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public OriInfoFcz selectByPrimaryId(Long id) {
        return oriInfoFczDao.selectByInfoPrimaryId(id);
    }
}
