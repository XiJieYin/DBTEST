package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoPrimary;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface OriInfoPrimaryDao extends BaseDao<OriInfoPrimary>{
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoPrimary record);

    int insertSelective(OriInfoPrimary record);

    OriInfoPrimary selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoPrimary record);

    int updateByPrimaryKey(OriInfoPrimary record);
    int updateConsistencyByPrimaryKey(OriInfoPrimary record);
    int updateConsistencyByTpbh(OriInfoPrimary record);

    List<OriInfoPrimary> selectByTPBH(String tpbh);

    int findCountPrimaryByJzId(Long jzId);
    
    List<OriInfoPrimary> selectByjzbh(String jzbh);

	int selectByjzbhToInt(String jzbh);
	
	//遍历图片是否录入
	int selectBytpbhToInt(String tpbh);

	List<OriInfoPrimary> selectByTmbh(String tmbh);
	
	/**
	 * 
	 * 【通过图片编号查询原文主表信息返回唯一结果】
	 * 
	 * @author cyq 2018年2月7日
	 * @param tpbh
	 * @return
	 */
	OriInfoPrimary selectByTpbh(@Param("tpbh")String tpbh);
	
	OriInfoPrimary selectByTmbhAndTpbh(@Param("tmbh")String tmbh,@Param("tpbh")String tpbh);
	/**
	 * 
	 * 【通过图片编号更新原文录入主表信息】
	 * 
	 * @author cyq 2018年2月7日
	 * @param ori
	 * @return
	 */
	int updateByTpbh(OriInfoPrimary ori);

	int delectByjzbh(String jzbh);

	int delectByTpbh(String tpbh);
	
	/**
	 * 
	 * 获取主表已经录入完成的原文数量
	 * 
	 * @author cyq 2018年4月3日
	 * @param tpbh	卷宗编号
	 * @param state	录入状态
	 * @return
	 */
	int getCountOriNum(@Param("jzbh")String jzbh, @Param("state")Integer state);
	
	/**
	 * 
	 * 根据卷宗编号录入状态获取原文主表信息
	 * 
	 * @author cyq 2018年4月11日
	 * @param jzbh
	 * @param consistency
	 * @return
	 */
	List<Integer> selectUnFinshOriInfo(Map<String,Object> parmsMap);
	
	/**
	 * 
	 * 获取卷宗所有的顺序码 
	 * 
	 * @author cyq 2018年4月14日
	 * @param jzbh
	 * @return
	 */
	List<Integer> selectAllSxmByJzbh(@Param("jzbh")String jzbh);
}