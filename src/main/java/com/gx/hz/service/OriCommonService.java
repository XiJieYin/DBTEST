package com.gx.hz.service;

import com.gx.common.utils.ResultBean;
import com.gx.hz.pojo.OriInfoPrimary;

public interface OriCommonService {

	public ResultBean insertByColsAndMatCode(OriInfoPrimary oriInfoPrimary, String code, String colJsonList, String rwId,String isCheck) throws Exception;
	
	public int getSeqByTableName(String tableName) throws Exception;
	
	
	ResultBean getUnFinshSxm(String isCheck, String jzbh) throws Exception;
	
	/**
	 * 
	 * 创建数据库表
	 * 
	 * @author cyq 2018年4月18日
	 * @param colList
	 * @throws Exception
	 */
	public void createTable(String tableName ,String colList) throws Exception;

	ResultBean getOriInfoByYwtpbh(String tmbh, String ywtpbh, String isCheck, String jzbh) throws Exception;
}
