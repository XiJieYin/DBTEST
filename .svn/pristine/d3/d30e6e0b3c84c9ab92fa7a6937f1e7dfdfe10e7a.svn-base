package com.gx.hz.dao;

import com.gx.hz.pojo.InfoRwtj;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface InfoRwtjDao extends BaseDao<InfoRwtj>{

	InfoRwtj selectByUserIdAndRylx(@Param("userId")Long UserId,@Param("rylx") Long rylx,@Param("rwId")Long rwId);
	
	InfoRwtj selectByUserIdAndRylxs(@Param("userId")Long UserId,@Param("rylx") Long rylx,@Param("rwId")Long rwId, @Param("cjsj")String cjsj);

	List<InfoRwtj> selectByRwIdAndRylx(@Param("rylx") Long rylx,@Param("rwId")Long rwId);

	List<InfoRwtj> queryByRwId(@Param("rwId")Long rwId);

    int countLrConsistenceByRWID(@Param("rwId")Long rwId);
    
    int updateByPrimaryKeySelectives(InfoRwtj infoRwtj);

    List<InfoRwtj> selectByUserIdAndRylxss(Map<String, Object> param);


}
