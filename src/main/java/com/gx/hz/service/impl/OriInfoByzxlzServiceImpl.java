package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoByzxlzDao;
import com.gx.hz.pojo.OriInfoByzxlz;
import com.gx.hz.pojo.OriInfoZqz;
import com.gx.hz.service.OriInfoByzxlzService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 *毕业证／学业证service
 * Created by ten on 17/12/4.
 */



@Service("oriInfoByzxlzService")
public class OriInfoByzxlzServiceImpl extends BaseServiceImpl<OriInfoByzxlz> implements
        OriInfoByzxlzService {

    @Resource
    OriInfoByzxlzDao oriInfoByzxlzDao;
    @Override
    public BaseDao<OriInfoByzxlz> getDao() {
        return oriInfoByzxlzDao;
    }


    @Override
    public int insertOriInfoByzxlz(OriInfoByzxlz oriInfoByzxlz) {
        return oriInfoByzxlzDao.insertSelective(oriInfoByzxlz);
    }

    @Override
    public int updateSelect(OriInfoByzxlz oriInfoByzxlz) {
        return oriInfoByzxlzDao.updateByPrimaryKeySelective(oriInfoByzxlz);
    }

    @Override
    public OriInfoByzxlz selectByTPBH(String tphb) {
        List<OriInfoByzxlz> list= oriInfoByzxlzDao.selectByTPBH(tphb);

        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }


    }

    @Override
    public OriInfoByzxlz selectByPrimaryId(Long id) {
        return oriInfoByzxlzDao.selectByInfoPrimaryId(id);
    }
}
