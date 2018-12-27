package com.gx.hz.service;


import com.gx.common.utils.PageInfo;
import com.gx.hz.pojo.DictType;


/**
 * 
 *
 * @version 
 * @author zhz  2018-04-10 下午4:11:42
 *
 */
public interface DictTypeService extends IBaseService<DictType> {
	
	public PageInfo<DictType> getDictTypeByCondition(int limit,int offset,String name);

	public void updateByCondition(DictType dictType);
	
}
