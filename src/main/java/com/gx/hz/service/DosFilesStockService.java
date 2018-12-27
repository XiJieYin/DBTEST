package com.gx.hz.service;

import com.gx.common.utils.PageInfo;
import com.gx.common.utils.ResultBean;
import com.gx.hz.pojo.DosFilesStock;

public interface DosFilesStockService extends IBaseService<DosFilesStock> {

	PageInfo<DosFilesStock> getDosFilesStocks(int limit, int offset,
			 String address, String organization, String jzType);

	ResultBean deleteByIds(Integer[] ids);
	
	int insertSelective(DosFilesStock t);
}
