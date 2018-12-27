package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoHkbDao;
import com.gx.hz.pojo.OriInfoFcz;
import com.gx.hz.pojo.OriInfoHkb;
import com.gx.hz.service.OriInfoHkbService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */
@Service("oriInfoHkbService")
public class OriInfoHkbServiceImpl extends BaseServiceImpl<OriInfoHkb> implements
        OriInfoHkbService {



    @Resource
    OriInfoHkbDao oriInfoHkbDao;

    @Override
    public BaseDao<OriInfoHkb> getDao() {
        return oriInfoHkbDao;
    }

    @Override
    public int insertSelect(OriInfoHkb oriInfoCzrkdjb) {
        return oriInfoHkbDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoHkb oriInfoCzrkdjb) {
        return oriInfoHkbDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoHkb selectByTPBH(String tphb) {
        List<OriInfoHkb> list = oriInfoHkbDao.selectByTPBH(tphb);

        if (list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }

    }
    @Override
    public OriInfoHkb selectByPrimaryId(Long id) {
        return oriInfoHkbDao.selectByInfoPrimaryId(id);
    }
}
