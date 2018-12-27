package com.gx.hz.dao;


import com.gx.common.utils.ResultBean;
import com.gx.hz.pojo.TmTmxxbTJ;
import com.gx.hz.pojo.TmTmxxbYW;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TmTmxxbYWDao extends BaseDao<TmTmxxbYW>{
    int deleteByPrimaryKey(Long id);

	int insert(TmTmxxbYW record);

    int insertSelective(TmTmxxbYW record);

    TmTmxxbYW selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(TmTmxxbYW record);

	int updateByPrimaryKey(TmTmxxbYW record);

	List<TmTmxxbYW> selectByJzbh(@Param("jzbh")String jzbh);

    int fakeDel(Integer id);
    
    TmTmxxbYW getTmXuhaoAndYS(@Param("jzbh")String jzbh);
    
    List<TmTmxxbYW> selectByJzbhToCount(@Param("jzbh")String jzbh);

	TmTmxxbYW queryByTmbh(String tmbh);
	
	public List<TmTmxxbYW> selectByDacx(Map<String, Object> conditionMap);
	
	/**
	 * 查询总记录数
	 * @param jzbh卷宗编号
	 * @return
	 */
	int getTmXuhao(@Param("jzbh")String jzbh);
	
	/**
	 * 根据卷宗查询顺序号最大的条目信息
	 * @param jzbh卷宗编号
	 * @return
	 */
	TmTmxxbYW getMaxSxhByJzbh(String jzbh);


    TmTmxxbYW getTMByTpbh(@Param("tpbh")String tpbh);
    
    TmTmxxbYW getTMByTmbh(@Param("tmbh")String tmbh);

	int updateType(Long id);

	List<TmTmxxbYW> getShtmList(Map<String, Object> maps);

	int selectByjzbhToInt(@Param("jzbh")String jzbh);

	List<TmTmxxbYW> getGjbg(Map<String, Object> maps);
	

	List<TmTmxxbYW> selectBySfzh (@Param("sfzh")String sfzh);
	
	/**
	 * 
	 * 【通过图片编号更新条目】
	 * 
	 * @author cyq 2018年2月7日
	 * @param t
	 * @return
	 */
	public int updateByTmbh(TmTmxxbYW t);
	
	/**
	 * 
	 * 【获取条目信息跟原文录入信息】
	 * 
	 * @author cyq 2018年2月13日
	 * @param parmsMap
	 * @return
	 */
	List<TmTmxxbYW> getTmAndPrimary(Map<String, Object> parmsMap);
	
	/**
	 * 
	 * 【根据卷宗编号获取已关联的条目跟图片信息】
	 * 
	 * @author cyq 2018年3月9日
	 * @param parmsMap
	 * @return
	 */
	List<TmTmxxbYW> getYWGlTmImgAndDetailByCondition(Map<String, Object> parmsMap);
	
	/**
	 * 
	 * 【根据卷宗编号获取已关联的条目总数】
	 * 
	 * @author cyq 2018年3月14日
	 * @param parmsMap
	 * @return
	 */
	int getYWGlTmImgAndDetailCount(Map<String, Object> parmsMap);

	int delectByjzbh(String jzbh);

	int deleteByTmbh(String tmbh);
	
	TmTmxxbYW getLastTM();
}