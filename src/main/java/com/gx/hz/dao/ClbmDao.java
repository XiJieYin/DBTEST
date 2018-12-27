package com.gx.hz.dao;

import java.util.List;
import java.util.Map;

import com.gx.hz.pojo.Ckzl;
import com.gx.hz.pojo.Clbm;

public interface ClbmDao extends BaseDao<Clbm> {
		List<Clbm> queryClbmByParent();
		List<Clbm> queryByConditions(Map<String, Object> params);
}
