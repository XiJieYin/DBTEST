package com.gx.hz.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gx.hz.pojo.TemplateImg;
import com.gx.hz.pojo.TemplateImgWithBLOBs;

public interface TemplateImgDao extends BaseDao<TemplateImg>{

	List<TemplateImg> selectAlls(String obj);
	
	TemplateImgWithBLOBs selectByPrimaryKeys(Integer obj);
	
	/**
	 * 
	 * 获取所有识别模板
	 * 
	 * @author cyq 2018年5月4日
	 * @return
	 */
	List<TemplateImg> selectAllTem();
	
	/**
	 * 
	 * 根据一级材料ID查找下面配置的模板列表
	 * 
	 * @author cyq 2018年5月4日
	 * @param parentId
	 * @return
	 */
	List<TemplateImg> selectByMatId(@Param("parentId") Integer parentId);

}
