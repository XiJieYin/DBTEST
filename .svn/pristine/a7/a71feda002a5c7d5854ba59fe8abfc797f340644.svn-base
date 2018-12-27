package com.gx.hz.service;

import java.util.List;
import java.util.Map;

import com.gx.common.utils.ResultBean;
import com.gx.hz.pojo.DictTable;

public interface DictTableServcie extends IBaseService<DictTable>{

	/**
	 * 
	 * 保存或更新录入表信息
	 * 
	 * @author cyq 2018年4月19日
	 * @param colList
	 * @param tableId
	 * @return
	 * @throws Exception
	 */
	ResultBean saveOrUpdateTableCol(String colList, String tableId, String isExist) throws Exception;
	
	List<DictTable> getTabAndColByTabId(Map<String, Object> parmsMap);
	
	/*List<DictTable> getAll();*/

}
