package com.gx.hz.dao;

import com.gx.hz.pojo.OriInfoPrimary;
import com.gx.hz.pojo.OriInfoPrimaryCopy;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OriInfoPrimaryCopyDao extends BaseDao<OriInfoPrimaryCopy>{
    int deleteByPrimaryKey(Long id);

    int insert(OriInfoPrimaryCopy record);

    int insertSelective(OriInfoPrimaryCopy record);

    OriInfoPrimaryCopy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OriInfoPrimaryCopy record);

    int updateByTpbh(String ywtpbh); //根据图片编号修改图片审核状态
    
    int updateByTmbhAndTpbh(String tmbh,String ywtpbh); //根据图片编号修改图片审核状态

    int updateByPrimaryKey(OriInfoPrimaryCopy record);

    List<OriInfoPrimaryCopy> selectByTPBH(String tpbh);

    List<OriInfoPrimaryCopy> selectByTMBHANDTPBH(@Param("tmbh")String tmbh,@Param("tpbh")String tpbh);

    int findCountPrimaryByJzId(Long jzId);

   
    List<OriInfoPrimaryCopy> selectByTPBHAndUserId(@Param("tpbh") String tpbh,@Param("userId")Integer userId);

    List<OriInfoPrimaryCopy> selectByTPBHAndConsistency(@Param("tpbh") String tpbh, @Param("consistency")Integer consistency);
    
    List<OriInfoPrimaryCopy> selectByTMBHAndTPBHAndConsistency(@Param("tmbh") String tmbh,@Param("tpbh") String tpbh, @Param("consistency")Integer consistency);
   
    List<OriInfoPrimaryCopy> selectByJZBHAndUserId(@Param("jzbh") String jzbh,@Param("userId")Integer userId);
   
    List<OriInfoPrimaryCopy> selectByJZBH(@Param("jzbh") String jzbh);

    int updateConsistencyByTpbh(OriInfoPrimaryCopy record);

    /**
     * 根据原文图片编号跟用户id查询原文录入主表信息
     * 
     * @author cyq 2018年4月3日
     * @param ywtpbh
     * @param userId
     * @return
     */
    OriInfoPrimaryCopy selectByTpbhAndUserId(@Param("ywtpbh")String ywtpbh , @Param("userId")Integer userId);
    
    OriInfoPrimaryCopy selectByTmbhAndTpbhAndUserId(@Param("tmbh")String tmbh,@Param("ywtpbh")String ywtpbh , @Param("userId")Integer userId);
    
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
}