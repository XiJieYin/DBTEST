package com.gx.hz.service.impl;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.InfoRwryjhDao;
import com.gx.hz.pojo.InfoRwryjh;
import com.gx.hz.service.InfoRwryjhService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ten on 17/11/17.
 */
@Service("infoRwryjhService")
public class InfoRwryjhServiceImpl  extends BaseServiceImpl<InfoRwryjh> implements InfoRwryjhService {


    @Resource
    InfoRwryjhDao infoRwryjhDao;

    @Override
    public BaseDao<InfoRwryjh> getDao() {
        return null;
    }

    @Override
    public int insertNewRWJH(List<InfoRwryjh> infoRwryjhs) {
        int rs=1;
        try{

            if(infoRwryjhs!=null && infoRwryjhs.size()>0) {
                infoRwryjhDao.updateRwryjbSatae2CancleByRWID(infoRwryjhs.get(0).getRwId());
                List<InfoRwryjh> infoRwryjhsOld=infoRwryjhDao.getJHByRWID(infoRwryjhs.get(0).getRwId());

//                List<Integer> integers=new ArrayList<Integer>();
//                List<Integer> removes=new ArrayList<Integer>();


//                for (int i=0;i<infoRwryjhs.size();i++) {
//                    integers.add(i);
//                    if(infoRwryjhsOld!=null && infoRwryjhsOld.size()>0){
//
//
//                        for(InfoRwryjh old:infoRwryjhsOld){
//                            if(old.getRwId().equals(infoRwryjhs.get(i).getRwId()) && old.getUserId().equals(infoRwryjhs.get(i).getUserId()) && old.getRylx().equals(infoRwryjhs.get(i).getRylx())){
//                                   infoRwryjhDao.updateRwryjbSatae2UsedByID(old.getId());
//                                   removes.add(i);
//                            }
//                        }
//                    }
//                }



                for(InfoRwryjh integer:infoRwryjhs){
                    integer.setSatae((short)1);
                    int tr = infoRwryjhDao.insertSelective(integer);
                    rs = rs * tr;
                }

            }
        }catch(Exception e) {
            e.printStackTrace();
//        logger.error("保存或修改角色出错 ", e);
//        resultBean.setFail("修改失败！");
        }
        return rs;
    }
}
