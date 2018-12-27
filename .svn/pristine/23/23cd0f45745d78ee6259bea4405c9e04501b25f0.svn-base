package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.OriTplrjlDao;
import com.gx.hz.pojo.OriTplrjl;
import com.gx.hz.service.OriTplrjlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by GXKJ on 2018/1/26.
 */
@Service("oriTplrjlService")
public class OriTplrjlServiceImpl  extends BaseServiceImpl<OriTplrjl> implements
        OriTplrjlService {

    @Resource
    OriTplrjlDao oriTplrjlDao;
    @Override
    public BaseDao<OriTplrjl> getDao() {
        return oriTplrjlDao;
    }

    @Override
    public int insertSelective(OriTplrjl record) {
        return oriTplrjlDao.insertSelective(record);
    }

    @Override
    public List<OriTplrjl> findOriTplrjlByJZBHAndUserId(String jzbh, Long userId) {
        return oriTplrjlDao.findOriTplrjlByJZBHAndUserId(jzbh,userId);
    }

    @Override
    public List<String> findOriTplrjlTPByJZBHAndUserId(String jzbh, Long userId) {
        return oriTplrjlDao.findOriTplrjlTPByJZBHAndUserId(jzbh,userId);
    }

    @Override
    public int findCountLrByJzbhAndUserId(String jzbh, Long userId) {
        return oriTplrjlDao.findCountLrByJzbhAndUserId(jzbh,userId);
    }

    @Override
    public int deleteOriTplrjlByTpbhAndUserId(String tpbh, Long userId) {
        return oriTplrjlDao.deleteOriTplrjlByTpbhAndUserId(tpbh,userId);
    }
}
