package com.gx.hz.service;

import com.gx.common.utils.PageInfo;
import com.gx.hz.pojo.InfoRwryglxxb;

import java.util.List;
import java.util.Map;

public interface InfoRwryglxxbService extends IBaseService<InfoRwryglxxb> {

	public PageInfo<InfoRwryglxxb> getInfoRwryglxxbByCondition(int limit, int offset,
			Map<String,Object> maps) throws Exception;
	
	public int updateInfoRwryglxxb(InfoRwryglxxb InfoRwryglxxb) throws Exception;

	public int insertNewRW(List<InfoRwryglxxb> infoRwryglxxbs);

	public List<InfoRwryglxxb> getRwryName(Long rwId);
	
	public List<InfoRwryglxxb> getRwIdByUser(Long userId);

    public List<InfoRwryglxxb> getRwryByRwIdAndRoleCode(Long rwId,String code);

    public List<InfoRwryglxxb> getRwIdByRole(Long roleId);
}
