package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoTwzDao;
import com.gx.hz.pojo.OriInfoFcz;
import com.gx.hz.pojo.OriInfoTwz;
import com.gx.hz.service.OriInfoTwzService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */
@Service("oriInfoTwzService")
public class OriInfoTwzServiceImpl  extends BaseServiceImpl<OriInfoTwz> implements
        OriInfoTwzService {



    @Resource
    OriInfoTwzDao oriInfoTwzDao;

    @Override
    public BaseDao<OriInfoTwz> getDao() {
        return oriInfoTwzDao;
    }

    @Override
    public int insertSelect(OriInfoTwz oriInfoCzrkdjb) {
        return oriInfoTwzDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoTwz oriInfoCzrkdjb) {
        return oriInfoTwzDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoTwz selectByTPBH(String tphb) {
        List<OriInfoTwz> list= oriInfoTwzDao.selectByTPBH(tphb);

        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public OriInfoTwz selectByPrimaryId(Long id) {
        return oriInfoTwzDao.selectByInfoPrimaryId(id);
    }
}
