package com.gx.hz.service;


import com.gx.common.utils.PageInfo;
import com.gx.hz.pojo.DictTypeValue;


/**
 * 
 *
 * @version 
 * @author zhz  2018-04-10 下午4:11:42
 *
 */
public interface DictTypeValueService extends IBaseService<DictTypeValue> {
	
	public PageInfo<DictTypeValue> getDictTypeValueByCondition(int limit,int offset,String name,String typeId);
	
	public void insertBatch(String typevalue,Integer typeId);
	
	public int deleteByCondition(DictTypeValue dictTypeValue);

	public void updateByCondition(String typevalue, Integer id);
}
