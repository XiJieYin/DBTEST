package com.gx.hz.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gx.hz.dao.BaseDao;
import com.gx.hz.dao.TemplateImgXDao;
import com.gx.hz.pojo.TemplateImgX;
import com.gx.hz.service.TemplateImgXService;
@Service("templateImgXService")
public class TemplateImgXServiceImpl extends BaseServiceImpl<TemplateImgX> implements TemplateImgXService{
	
	@Resource
	TemplateImgXDao templateImgXDao;
	
	@Override
	public BaseDao<TemplateImgX> getDao() {
		return templateImgXDao;
	}
	@Override
	public List<TemplateImgX> getTemplateImg(Integer tempId, Short status) {
		Map<String, Object> params = new HashMap<String, Object>(0);
		if (tempId != null ) {
			params.put("tempId", tempId);
		}
		if (status != null ) {
			params.put("status", status);
		}
		List<TemplateImgX> mpList = templateImgXDao.queryByCondition(params);
		return mpList;
	}

	

}
