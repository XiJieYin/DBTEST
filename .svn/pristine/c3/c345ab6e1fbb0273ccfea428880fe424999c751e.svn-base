package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoTxzDao;
import com.gx.hz.pojo.OriInfoFcz;
import com.gx.hz.pojo.OriInfoTxz;
import com.gx.hz.service.OriInfoTxzService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */
@Service("oriInfoTxzService")
public class OriInfoTxzServiceImpl  extends BaseServiceImpl<OriInfoTxz> implements
        OriInfoTxzService {



    @Resource
    OriInfoTxzDao oriInfoTxzDao;

    @Override
    public BaseDao<OriInfoTxz> getDao() {
        return oriInfoTxzDao;
    }

    @Override
    public int insertSelect(OriInfoTxz oriInfoCzrkdjb) {
        return oriInfoTxzDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoTxz oriInfoCzrkdjb) {
        return oriInfoTxzDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoTxz selectByTPBH(String tphb) {
        List<OriInfoTxz> list= oriInfoTxzDao.selectByTPBH(tphb);

        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public OriInfoTxz selectByPrimaryId(Long id) {
        return oriInfoTxzDao.selectByInfoPrimaryId(id);
    }
}
