package com.gx.hz.service.impl;


import com.gx.common.utils.PageInfo;
import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.InfoRwryglxxbDao;
import com.gx.hz.pojo.InfoRwryglxxb;
import com.gx.hz.service.InfoRwryglxxbService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service("infoRwryglxxbService")
public class InfoRwryglxxbServiceImpl extends BaseServiceImpl<InfoRwryglxxb> implements InfoRwryglxxbService {
	@Resource
	InfoRwryglxxbDao infoRwryglxxbDao;

	@Override
	public PageInfo<InfoRwryglxxb> getInfoRwryglxxbByCondition(int limit,
			int offset, Map<String, Object> maps) throws Exception {
		return null;
	}

	@Override
	public int updateInfoRwryglxxb(InfoRwryglxxb InfoRwryglxxb)
			throws Exception {
		return 0;
	}

	@Override
	public BaseDao<InfoRwryglxxb> getDao() {
		return null;
	}


    /**
     * 插入任务安排人员关联信息表
     * @param infoRwryglxxb
     * @return
     */
	@Override
	public int insertNewRW(List<InfoRwryglxxb> infoRwryglxxb) {
        int rs=1;
        try{

          if(infoRwryglxxb!=null && infoRwryglxxb.size()>0) {

              infoRwryglxxbDao.deleteRwryglxxbByRWID(infoRwryglxxb.get(0).getRwId());

              for (InfoRwryglxxb rwry : infoRwryglxxb) {
                  int tr = infoRwryglxxbDao.insertSelectiveByRW(rwry);
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

	@Override
	public List<InfoRwryglxxb> getRwryName(Long rwId) {
		return infoRwryglxxbDao.getRwryName(rwId);
	}

	@Override
	public List<InfoRwryglxxb> getRwIdByUser(Long userId) {
		return infoRwryglxxbDao.selectByUserId(userId);
	}


    @Override
    public List<InfoRwryglxxb> getRwryByRwIdAndRoleCode(Long rwId, String code) {
        return infoRwryglxxbDao.getRwryByRwIdAndRoleCode(rwId,code);
    }

	@Override
	public List<InfoRwryglxxb> getRwIdByRole(Long roleId) {
		// TODO Auto-generated method stub
		return infoRwryglxxbDao.selectByRoleId(roleId);
	}


	
}
