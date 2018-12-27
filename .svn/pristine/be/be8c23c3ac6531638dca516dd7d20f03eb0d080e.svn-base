package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoRhyyxxkDao;
import com.gx.hz.pojo.OriInfoFcz;
import com.gx.hz.pojo.OriInfoRhyyxxk;
import com.gx.hz.service.OriInfoRhyyxxkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */
@Service("oriInfoRhyyxxkService")
public class OriInfoRhyyxxkServiceImpl extends BaseServiceImpl<OriInfoRhyyxxk> implements
        OriInfoRhyyxxkService {



    @Resource
    OriInfoRhyyxxkDao oriInfoRhyyxxkDao;

    @Override
    public BaseDao<OriInfoRhyyxxk> getDao() {
        return oriInfoRhyyxxkDao;
    }

    @Override
    public int insertSelect(OriInfoRhyyxxk oriInfoCzrkdjb) {
        return oriInfoRhyyxxkDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoRhyyxxk oriInfoCzrkdjb) {
        return oriInfoRhyyxxkDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoRhyyxxk selectByTPBH(String tphb) {
        List<OriInfoRhyyxxk> list= oriInfoRhyyxxkDao.selectByTPBH(tphb);

        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public OriInfoRhyyxxk selectByPrimaryId(Long id) {
        return oriInfoRhyyxxkDao.selectByInfoPrimaryId(id);
    }
}
