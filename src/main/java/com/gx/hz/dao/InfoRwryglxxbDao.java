package com.gx.hz.dao;

import com.gx.hz.pojo.InfoRwryglxxb;
import org.apache.ibatis.annotations.Param;

import java.util.List;




/**
 * 任务基本信息表Dao
 * @author ten
 *
 */
public interface InfoRwryglxxbDao extends BaseDao<InfoRwryglxxb> {
    int deleteByPrimaryKey(Long id);

    int insert(InfoRwryglxxb record);

    int insertSelective(InfoRwryglxxb record);

    int insertSelectiveByRW(InfoRwryglxxb record);

    InfoRwryglxxb selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InfoRwryglxxb record);

    int updateByPrimaryKey(InfoRwryglxxb record);

	List<InfoRwryglxxb> getRwryName(@Param("rwId")Long rwId);
	List<InfoRwryglxxb> getRwryByRwIdAndRoleCode(@Param("rwId")Long rwId,@Param("code")String code);

    int deleteRwryglxxbByRWID(Long id);
    
    List<InfoRwryglxxb> selectByUserId(Long userId);

    List<InfoRwryglxxb> selectByRoleId(Long roleId);
}