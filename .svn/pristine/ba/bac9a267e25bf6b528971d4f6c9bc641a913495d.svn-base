package com.gx.hz.dao;

import com.gx.hz.pojo.OriTplrjl;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by GXKJ on 2018/1/26.
 */
public interface OriTplrjlDao  extends BaseDao<OriTplrjl> {

    int insertSelective(OriTplrjl record);

    List<OriTplrjl> findOriTplrjlByJZBHAndUserId(@Param("jzbh")String jzbh,@Param("userId")Long userId);

    List<String> findOriTplrjlTPByJZBHAndUserId(@Param("jzbh")String jzbh,@Param("userId")Long userId);
    int findCountLrByJzbhAndUserId(@Param("jzbh")String jzbh,@Param("userId")Long userId);
    int deleteOriTplrjlByTpbhAndUserId(@Param("tpbh")String tpbh,@Param("userId")Long userId);

}
