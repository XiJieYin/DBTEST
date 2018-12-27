package com.gx.hz.dao;

import com.gx.hz.pojo.InfoRWJBXX;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;




/**
 * 任务基本信息表Dao
 * @author ten
 *
 */
public interface InfoRWJBXXDao extends BaseDao<InfoRWJBXX> {
    int deleteByPrimaryKey(Integer id);

    int insert(InfoRWJBXX record);

    int insertSelective(InfoRWJBXX record);

    InfoRWJBXX selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InfoRWJBXX record);

    int updateByPrimaryKey(InfoRWJBXX record);
    
    List<InfoRWJBXX> selectRwmc(@Param("id")Integer id,@Param("roleId")Integer roleId);
    
    List<InfoRWJBXX> queryRwTj(Map<String, Object> conditionMap);

    int getwfp(@Param("userId")Integer userId,@Param("roleId")Integer roleId,@Param("rylx")Integer rylx);
    
    int getjxz(@Param("userId")Integer userId,@Param("roleId")Integer roleId,@Param("rylx")Integer rylx);
    
    int getywc(@Param("userId")Integer userId,@Param("roleId")Integer roleId,@Param("rylx")Integer rylx);
    
    public List<InfoRWJBXX> selectByUserId(Long userId);
    
    public List<InfoRWJBXX> selectByFzrRoleId(Long fzrRoleId);
    
    public List<InfoRWJBXX> queryByConditions(Map<String, Object> conditionMap);
    
    //所有人员类型都可以获取的任务名称信息
    public List<InfoRWJBXX> queryByAllRylxConditions(Map<String, Object> conditionMap);
    
    public List<InfoRWJBXX> queryByConditionss(Map<String, Object> conditionMap);
    
    public List<InfoRWJBXX> queryByTmgl(Map<String, Object> conditionMap);

    public List<InfoRWJBXX> queryByFzr(Map<String, Object> conditionMap);
    
    public List<InfoRWJBXX> queryByFzrRole(Map<String, Object> conditionMap);
    
    public List<InfoRWJBXX> selectByMyhome(Map<String, Object> conditionMap);

	int fakeDel(int parseInt);
	
	public List<InfoRWJBXX> selectByFzrId (Map<String, Object> conditionMap);
	
	public List<InfoRWJBXX> selectByOtherId (Map<String, Object> conditionMap);

	InfoRWJBXX selectByrwId(@Param("rwId")int rwId);
	
	InfoRWJBXX getOrgByRwId(Integer id);
	
	List<InfoRWJBXX> getWcRw();


    int updateCheck(@Param("icheck")Integer check, @Param("id")Integer id);

    List<InfoRWJBXX> findRWByJzbh(@Param("jzbh")String jzbh);

	List<InfoRWJBXX> queryRwByUser(@Param("userId")Long userId,@Param("rylx")Integer rylx);


}