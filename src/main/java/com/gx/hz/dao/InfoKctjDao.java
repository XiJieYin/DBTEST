package com.gx.hz.dao;

import java.util.List;
import java.util.Map;
import com.gx.hz.pojo.InfoKctj;

/**
 * Created by Dily on 2018/1/12.
 */
public interface InfoKctjDao extends BaseDao<InfoKctj>{
	public List<InfoKctj> queryByPage(Map<String, Object> params);
}
