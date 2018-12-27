package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoLXZDao;
import com.gx.hz.pojo.OriInfoFcz;
import com.gx.hz.pojo.OriInfoLXZ;
import com.gx.hz.service.OriInfoLXZService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */
@Service("oriInfoLXZService")
public class OriInfoLXZServiceImpl  extends BaseServiceImpl<OriInfoLXZ> implements
        OriInfoLXZService {



    @Resource
    OriInfoLXZDao oriInfoLXZDao;

    @Override
    public BaseDao<OriInfoLXZ> getDao() {
        return oriInfoLXZDao;
    }

    @Override
    public int insertSelect(OriInfoLXZ oriInfoCzrkdjb) {
        return oriInfoLXZDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoLXZ oriInfoCzrkdjb) {
        return oriInfoLXZDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoLXZ selectByTPBH(String tphb) {
        List<OriInfoLXZ> list= oriInfoLXZDao.selectByTPBH(tphb);

        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public OriInfoLXZ selectByPrimaryId(Long id) {
        return oriInfoLXZDao.selectByInfoPrimaryId(id);
    }
}
