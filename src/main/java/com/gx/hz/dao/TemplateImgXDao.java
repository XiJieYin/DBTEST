package com.gx.hz.dao;

import java.util.List;

import com.gx.hz.pojo.TemplateImgX;

public interface TemplateImgXDao extends BaseDao<TemplateImgX>{
	public int updateStstusByNo(TemplateImgX t);

	public List<TemplateImgX> selectAlls(String obj);
}
