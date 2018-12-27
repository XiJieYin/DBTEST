package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.InfoOrilrjlDao;
import com.gx.hz.pojo.InfoOrilrjl;

import com.gx.hz.service.InfoOrilrjlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Dily on 2018/1/12.
 */
@Service("infoOrilrjlService")
public class InfoOrilrjlServiceImpl extends BaseServiceImpl<InfoOrilrjl> implements InfoOrilrjlService {


    @Resource
    InfoOrilrjlDao infoOrilrjlDao;
    @Override
    public BaseDao<InfoOrilrjl> getDao() {
        return infoOrilrjlDao;
    }


    @Override
    public InfoOrilrjl selectJL(Long userId, Long jzid) {
        List<InfoOrilrjl> orilrjlList=infoOrilrjlDao.selectJL(userId,jzid);
        if(orilrjlList.size()>0){
            return orilrjlList.get(0);
        }

        return null;
    }
}
