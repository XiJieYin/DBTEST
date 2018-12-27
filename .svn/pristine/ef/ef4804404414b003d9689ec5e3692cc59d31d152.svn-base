package com.gx.hz.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gx.hz.pojo.InfoShwtg;

public interface InfoShwtgDao extends BaseDao<InfoShwtg> {
	
	public List<InfoShwtg> queryByConditionToAj(Map<String, Object> conditionMap);
	
	public List<InfoShwtg> queryByConditionToJz(Map<String, Object> conditionMap);
	
	public List<InfoShwtg> queryByConditionToTm(Map<String, Object> conditionMap);
	
	public List<InfoShwtg> queryByConditionToTp(Map<String, Object> conditionMap);

	public int selectCount(Map<String, Object> params);
	
	public List<InfoShwtg> selectCountByRylx(Map<String, Object> params);

	public InfoShwtg getWtgByJzId(@Param("sataes")Integer sataes,@Param("jzId") Long jzId,@Param("userId") Long userId,
			@Param("rwId")Long rwId,@Param("tmbh")String tmbh);

	public List<InfoShwtg> selectByWt(@Param("jzId")Long jzId, @Param("sataes")Integer satae);

	public List<InfoShwtg> selectByYw(@Param("bh")String bh, @Param("sataes")Integer sataes);
	
	
}
