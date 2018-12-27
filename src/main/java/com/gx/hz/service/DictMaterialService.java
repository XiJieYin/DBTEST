package com.gx.hz.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Value;

import com.gx.common.utils.ResultBean;
import com.gx.hz.pojo.DictMaterial;

public interface DictMaterialService extends IBaseService<DictMaterial> {

	/**
	 * 
	 * 【保存或更新材料录入字段信息】
	 * 
	 * @author cyq 2018年3月29日
	 * @param materialId
	 * @param materialName
	 * @param isExist
	 * @param columnList
	 * @return
	 * @throws Exception
	 */
	public ResultBean saveOrUpdateMatAndCol(DictMaterial material, String isExist, String columnList) throws Exception;

	public List<DictMaterial> getMatAndColByCode(@Param("code") String code) throws Exception;

	/**
	 * 
	 * 添加材料或移动材料树节点
	 * 
	 * @author cyq 2018年4月24日
	 * @param parentId
	 * @param id
	 * @return
	 */
	public ResultBean addOrMoveMat(Integer parentId, Integer id, Integer flag, String lbh);
}
