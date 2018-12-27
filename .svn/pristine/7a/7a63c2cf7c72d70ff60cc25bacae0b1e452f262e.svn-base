package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriInfoRhyyxxkCopyDao;
import com.gx.hz.pojo.OriInfoByzxlzCopy;
import com.gx.hz.pojo.OriInfoRhyyxxkCopy;
import com.gx.hz.service.OriInfoRhyyxxkCopyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/5.
 */
@Service("oriInfoRhyyxxkCopyService")
public class OriInfoRhyyxxkCopyServiceImpl extends BaseServiceImpl<OriInfoRhyyxxkCopy> implements
        OriInfoRhyyxxkCopyService {



    @Resource
    OriInfoRhyyxxkCopyDao oriInfoRhyyxxkCopyDao;

    @Override
    public BaseDao<OriInfoRhyyxxkCopy> getDao() {
        return oriInfoRhyyxxkCopyDao;
    }

    @Override
    public int insertSelect(OriInfoRhyyxxkCopy oriInfoCzrkdjb) {
        return oriInfoRhyyxxkCopyDao.insertSelective(oriInfoCzrkdjb);
    }

    @Override
    public int updateSelect(OriInfoRhyyxxkCopy oriInfoCzrkdjb) {
        return oriInfoRhyyxxkCopyDao.updateByPrimaryKeySelective(oriInfoCzrkdjb);
    }

    @Override
    public OriInfoRhyyxxkCopy selectByTPBH(String tphb) {
        return oriInfoRhyyxxkCopyDao.selectByTPBH(tphb);
    }

    @Override
    public OriInfoRhyyxxkCopy selectByPrimaryId(Long id) {
        return oriInfoRhyyxxkCopyDao.selectByInfoPrimaryId(id);
    }

    @Override
    public OriInfoRhyyxxkCopy selectByTPBHAndUserId(String tphb, Integer userId) {
        List<OriInfoRhyyxxkCopy> oriInfoByzxlzCopies=    oriInfoRhyyxxkCopyDao.selectByTPBHAndUserId(tphb,userId);
        if(oriInfoByzxlzCopies.size()>0){
            return oriInfoByzxlzCopies.get(0);
        }
        return null;
    }
}
