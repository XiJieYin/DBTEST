package com.gx.hz.service;

import java.util.List;
import java.util.Map;

import com.gx.common.utils.PageInfo;
import com.gx.hz.entity.LineChartInfo;
import com.gx.hz.pojo.Bhqs;
import com.gx.hz.pojo.Daqk;
import com.gx.hz.pojo.Tbcxtj;

public interface TbcxtjService {

	List<Tbcxtj> getCxcs(Integer type);

	List<Tbcxtj> getCxcsfg(String zzjgmc, Integer type);

	List<Bhqs> getdabh();

	List<Daqk> getDaqk(String year);

	List<Daqk> getFghjda(String orgName, String year);

	int getFgzys(String orgName, String year);

	List<Integer> getCxcsToNdAndLx(String year, Integer type);
	
	PageInfo<Tbcxtj>  selectByCxcs(int limit,int offset,String orgCode,String type,String strDate);
	
	/**
	 * 
	 * 按年度查询档案查询的情况,折线图数据
	 * 
	 * @author cyq 2018年3月1日
	 * @param year
	 */
	public List<Map<String,Object>> selectSearchCount(String year);
}
