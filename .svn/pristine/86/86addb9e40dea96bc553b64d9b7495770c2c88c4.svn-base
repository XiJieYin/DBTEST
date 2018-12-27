package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoSwzmDao;
import com.gx.hz.pojo.OriInfoFcz;
import com.gx.hz.pojo.OriInfoSwzm;
import com.gx.hz.service.OriInfoSwzmService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */

@Service("oriInfoSwzmService")
public class OriInfoSwzmServiceImpl  extends BaseServiceImpl<OriInfoSwzm> implements
        OriInfoSwzmService {



    @Resource
    OriInfoSwzmDao oriInfoSwzmDao;

    @Override
    public BaseDao<OriInfoSwzm> getDao() {
        return oriInfoSwzmDao;
    }

    @Override
    public int insertSelect(OriInfoSwzm oriInfoCzrkdjb) {
        return oriInfoSwzmDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoSwzm oriInfoCzrkdjb) {
        return oriInfoSwzmDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoSwzm selectByTPBH(String tphb) {
        List<OriInfoSwzm> list= oriInfoSwzmDao.selectByTPBH(tphb);

        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public OriInfoSwzm selectByPrimaryId(Long id) {
        return oriInfoSwzmDao.selectByInfoPrimaryId(id);
    }
}
