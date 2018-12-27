package com.gx.hz.service;

import com.gx.hz.pojo.OriTplrjl;

import java.util.List;

/**
 * Created by GXKJ on 2018/1/26.
 */
public interface OriTplrjlService  extends IBaseService<OriTplrjl> {

    int insertSelective(OriTplrjl record);

    List<OriTplrjl> findOriTplrjlByJZBHAndUserId(String jzbh,Long userId);

    List<String> findOriTplrjlTPByJZBHAndUserId(String jzbh,Long userId);

    int findCountLrByJzbhAndUserId(String jzbh,Long userId);

    int deleteOriTplrjlByTpbhAndUserId(String tpbh,Long userId);

}
