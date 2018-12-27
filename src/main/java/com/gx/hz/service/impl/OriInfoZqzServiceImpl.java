package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoZqzDao;
import com.gx.hz.pojo.OriInfoZqz;
import com.gx.hz.service.OriInfoZqzService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */
@Service("oriInfoZqzService")
public class OriInfoZqzServiceImpl  extends BaseServiceImpl<OriInfoZqz> implements
        OriInfoZqzService {



    @Resource
    OriInfoZqzDao oriInfoZqzDao;

    @Override
    public BaseDao<OriInfoZqz> getDao() {
        return oriInfoZqzDao;
    }

    @Override
    public int insertSelect(OriInfoZqz oriInfoCzrkdjb) {
        return oriInfoZqzDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoZqz selectByTPBH(String tphb) {
        List<OriInfoZqz> list= oriInfoZqzDao.selectByTPBH(tphb);

        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
//        return oriInfoZqzDao.selectByTPBH(tphb);
    }

    @Override
    public OriInfoZqz selectByPrimaryId(Long id) {
        return oriInfoZqzDao.selectByInfoPrimaryId(id);
    }

    @Override
    public int updateSelect(OriInfoZqz oriInfoCzrkdjb) {
        return oriInfoZqzDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }
}
