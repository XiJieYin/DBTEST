package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoCszmDao;
import com.gx.hz.pojo.OriInfoByzxlz;
import com.gx.hz.pojo.OriInfoCszm;
import com.gx.hz.service.OriInfoCszmService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */

@Service("oriInfoCszmService")
public class OriInfoCszmServiceImpl extends BaseServiceImpl<OriInfoCszm> implements
        OriInfoCszmService {


    @Resource
    OriInfoCszmDao oriInfoCszm;

    @Override
    public BaseDao<OriInfoCszm> getDao() {
        return oriInfoCszm;
    }

    @Override
    public int insertSelect(OriInfoCszm oriInfoByzxlz) {
        return oriInfoCszm.insertSelective(oriInfoByzxlz);
    }

    @Override
    public int updateSelect(OriInfoCszm oriInfoByzxlz) {
        return oriInfoCszm.updateByPrimaryKeySelective(oriInfoByzxlz);
    }

    @Override
    public OriInfoCszm selectByTPBH(String tphb) {
        List<OriInfoCszm> list= oriInfoCszm.selectByTPBH(tphb);

        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }

    }

    @Override
    public OriInfoCszm selectByPrimaryId(Long id) {
        return oriInfoCszm.selectByInfoPrimaryId(id);
    }
}
