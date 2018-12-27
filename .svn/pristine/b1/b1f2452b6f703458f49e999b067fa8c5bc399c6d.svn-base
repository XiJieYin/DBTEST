package com.gx.hz.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gx.hz.pojo.Dnzb;
import com.gx.hz.pojo.DosJz;

/**
 * 
 * 
 * @version
 * @author lkx 2017-8-14 上午10:35:01
 * 
 */
public interface DosJzDao extends BaseDao<DosJz> {
	List<DosJz> getJzByAjId(int ajId);
	
	List<DosJz> getJzByAjbh(String ajbh);

	List<Map<String, Object>> countByOrg();

	DosJz selectByTxmbh(@Param("txmbh")String txmbh);
	
	int selectByTjToYearOrRwId(Map<String, Object> conditionMap);
	
	DosJz queryByJzbh(@Param("jzbh")String jzbh);

	int updateById(Long id);
	
	public List<DosJz> queryDataPage(Map<String, Object> conditionMap);

	List<Dnzb> selectDnzb();
	
	List<DosJz> queryByPage(Map<String, Object> conditionMap);

	int getjzCountByRwId(@Param("rwId")int rwId);
	
	int selectByRwId(Integer rwId);
	
	int selectByRwIdMax(Integer rwId);

	List<DosJz> selectByParams(Map<String, Object> params);

	List<DosJz> queryByJz(Map<String, Object> params);
	
	List<DosJz> selectByCountAndNd();
	
	List<DosJz> selectByNd(Map<String,Object> params);
	
	int updateByYczt(String jzbh);
	/**
	 * 
	 * 【通过卷宗编号更新卷宗信息】
	 * 
	 * @author cyq 2018年2月7日
	 * @param jz
	 * @return
	 */
	public int updateByJzbh(DosJz jz);

	List<DosJz> queryByConditionByFk(Map<String, Object> params);

	List<DosJz> getDosJzByRwid(Map<String, Object> params);

	List<DosJz> queryByConditionByYcjz(Map<String, Object> params);
	
	public List<DosJz> queryAllJzByCondition(Map<String, Object> conditionMap); //获取所有卷宗信息

	int delectByjzbh(String jzbh);
	
	/**
	 * 
	 * 通过卷宗编号查询卷宗的信息和任务信息
	 * 
	 * @author cyq 2018年4月4日
	 * @param jzbh
	 * @return
	 */
	DosJz selectJzAndRwInfo(@Param("jzbh")String jzbh);
}
