package com.gx.hz.dao;

import com.gx.hz.pojo.TmTmxxbTJ;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TmTmxxbTJDao extends BaseDao<TmTmxxbTJ> {
	int deleteByPrimaryKey(Long id);

	@Override
	int insert(TmTmxxbTJ record);

	int insertSelective(TmTmxxbTJ record);

	TmTmxxbTJ selectByPrimaryKey(Long id);

	@Override
	int updateByPrimaryKeySelective(TmTmxxbTJ record);

	@Override
	int updateByPrimaryKey(TmTmxxbTJ record);

	List<TmTmxxbTJ> selectByJzbh(@Param("jzbh") String jzbh);

	int selectByJzbhToInt(@Param("jzbh") String jzbh);

	List<TmTmxxbTJ> selectByJzbhToCount(@Param("jzbh") String jzbh);

	int fakeDel(Integer id);

	TmTmxxbTJ queryByTmbh(@Param("tmbh") String tmbh);

	/**
	 * 查询总记录数
	 * 
	 * @param jzbh卷宗编号
	 * @return
	 */
	int getTmXuhao(@Param("jzbh") String jzbh);

	/**
	 * 根据卷宗查询顺序号最大的条目信息
	 * 
	 * @param jzbh卷宗编号
	 * @return
	 */
	TmTmxxbTJ getMaxSxhByJzbh(String jzbh);

	TmTmxxbTJ getTMByTpbh(@Param("tpbh") String tpbh);

	void updateType(Long id);

	List<TmTmxxbTJ> getShtmList(Map<String, Object> maps);
	
	/**
	 * 
	 * 【通过条目编号更新条目】
	 * 
	 * @author cyq 2018年2月7日
	 * @param t
	 * @return
	 */
	public int updateByTmbh(TmTmxxbTJ t);
	
	/**
	 * 
	 * 【根据卷宗编号获取已关联的条目跟图片信息】
	 * 
	 * @author cyq 2018年3月9日
	 * @param parmsMap
	 * @return
	 */
	List<TmTmxxbTJ> getTJGlTmImgAndDetailByCondition(Map<String, Object> parmsMap);
	
	/**
	 * 
	 * 【根据卷宗编号获取已关联的条目总数】
	 * 
	 * @author cyq 2018年3月14日
	 * @param parmsMap
	 * @return
	 */
	int getTJGlTmImgAndDetailCount(Map<String, Object> parmsMap);

	int delectByjzbh(String jzbh);

	int deleteByTmbh(String tmbh);

	TmTmxxbTJ getTmXuhaoAndYS(String jzbh);

	TmTmxxbTJ getTMByTmbh(@Param("tmbh") String tmbh);

}