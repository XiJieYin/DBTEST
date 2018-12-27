package com.gx.hz.dao;


import com.gx.hz.pojo.DictInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * 
 *
 * @version 
 * @author lkx  2017-8-14 上午10:35:01
 *
 */
public interface DictInfoDao extends BaseDao<DictInfo>{
	public int updateForDelById(int id);
	public List<DictInfo>  selectByType(@Param("type")String type,@Param("name")String name);
	public List<DictInfo> getDicNameByRWId(@Param("rwId")Long rwId);
	public DictInfo selectByName(@Param("jzlx")String jzlx);
	public List<DictInfo> selectByCode(@Param("code")String code);
	public List<DictInfo> selectTypeByRwId(String rwId);
}
