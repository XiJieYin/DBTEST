package com.gx.hz.service;

import java.util.List;
import java.util.Map;

import com.gx.common.utils.PageInfo;
import com.gx.common.utils.ResultBean;
import com.gx.hz.pojo.DosJz;
import com.gx.hz.pojo.InfoTxm;
import com.gx.hz.pojo.InfoYcfk;

public interface InfoYcfkService extends IBaseService<InfoYcfk>{
	public PageInfo<InfoYcfk> getInfoTxmCondition(int limit, int offset,Map<String,Object> maps) throws Exception;

	public int delectByjzBhToType(String jzbh);
	
	public int delectByjzBhToClType(String jzbh);


	public int update(InfoYcfk InfoYcfk);

	public ResultBean addYcfk(InfoYcfk infoYcfk);

	public ResultBean getFk();

	public PageInfo<InfoYcfk> getFkList(int limit, int offset);

	public PageInfo<DosJz> getFkJzList(int limit, int offset, String jzbh);

	public List<InfoYcfk> queryByQcwtToJzbh(String jzbh);

	public ResultBean updateJz(Long id, Integer sl, String type, String jzbh);

	public ResultBean updateType(Long id);
	

	public PageInfo<DosJz> getYcJzList(int limit, int offset);

	public List<InfoYcfk> selectByYcsx(String jzbh);


	
}
