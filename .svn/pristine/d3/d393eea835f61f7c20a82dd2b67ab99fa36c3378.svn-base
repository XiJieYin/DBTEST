package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.TmtplrwzDao;
import com.gx.hz.pojo.Tmtplrwz;
import com.gx.hz.service.TmtplrwzService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ten on 17/12/22.
 */

@Service("tmtplrwzService")
public class TmtplrwzServiceImpl extends BaseServiceImpl<Tmtplrwz> implements TmtplrwzService {

    @Resource
    private TmtplrwzDao tmtplrwzDao;

    @Override
    public BaseDao<Tmtplrwz> getDao() {
        return tmtplrwzDao;
    }

    @Override
    public Tmtplrwz findTmtpLrwzByJzId(Long jzId) {
        List<Tmtplrwz>  tmtplrwzs=tmtplrwzDao.selectByJZID(jzId);
        if(tmtplrwzs !=null && tmtplrwzs.size()>0){
            return tmtplrwzs.get(0);
        }
        return null;
    }
    @Override
    public List<Tmtplrwz> findTmtpLrwzListByJzId(Long jzId) {
        List<Tmtplrwz>  tmtplrwzs=tmtplrwzDao.selectByJZID(jzId);

        return tmtplrwzs;
    }

    @Override
    public Tmtplrwz findTmtpLrwzByJzIdAndUserId(Long jzId, Long userId) {
        List<Tmtplrwz>  tmtplrwzs=tmtplrwzDao.selectByJZIDAndUserId(jzId,userId);
        if(tmtplrwzs !=null && tmtplrwzs.size()>0){
            return tmtplrwzs.get(0);
        }
        return null;
    }

    @Override
    public Tmtplrwz findTmtpLrwzByJzBh(String jzbh) {
        List<Tmtplrwz>  tmtplrwzs=tmtplrwzDao.selectByJZBH(jzbh);
        if(tmtplrwzs !=null && tmtplrwzs.size()>0){
            return tmtplrwzs.get(0);
        }
        return null;
    }

    @Override
    public int updateSeleted(Tmtplrwz tmtplrwz) {
        return tmtplrwzDao.updateByPrimaryKeySelective(tmtplrwz);
    }

    @Override
    public int insertSelected(Tmtplrwz tmtplrwz) {
        return tmtplrwzDao.insertSelective(tmtplrwz);
    }
}
