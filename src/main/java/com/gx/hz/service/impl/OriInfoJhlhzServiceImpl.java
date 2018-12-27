package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoJhlhzDao;
import com.gx.hz.pojo.OriInfoFcz;
import com.gx.hz.pojo.OriInfoJhlhz;
import com.gx.hz.service.OriInfoJhlhzService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */
@Service("oriInfoJhlhzService")
public class OriInfoJhlhzServiceImpl extends BaseServiceImpl<OriInfoJhlhz> implements
        OriInfoJhlhzService {



    @Resource
    OriInfoJhlhzDao oriInfoJhlhzDao;

    @Override
    public BaseDao<OriInfoJhlhz> getDao() {
        return oriInfoJhlhzDao;
    }

    @Override
    public int insertSelect(OriInfoJhlhz oriInfoCzrkdjb) {
        return oriInfoJhlhzDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoJhlhz oriInfoCzrkdjb) {
        return oriInfoJhlhzDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoJhlhz selectByTPBH(String tphb) {
        List<OriInfoJhlhz> list= oriInfoJhlhzDao.selectByTPBH(tphb);

        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public OriInfoJhlhz selectByPrimaryId(Long id) {
        return oriInfoJhlhzDao.selectByInfoPrimaryId(id);
    }

}
