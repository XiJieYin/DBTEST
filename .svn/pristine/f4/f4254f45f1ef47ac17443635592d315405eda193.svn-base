package com.gx.hz.dao;

import com.gx.hz.pojo.TmTmytpglxxb;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmTmytpglxxbDao extends BaseDao<TmTmytpglxxb>{
    int deleteByPrimaryKey(Long id);

    int insert(TmTmytpglxxb record);

    int insertSelective(TmTmytpglxxb record);

    TmTmytpglxxb selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TmTmytpglxxb record);

    int updateByPrimaryKey(TmTmytpglxxb record);
    
    List<TmTmytpglxxb> selectByTmbh(@Param("tmbh")String tmbh);

    int deleteByTMBH(@Param("tmbh")String tmbh);

	List<TmTmytpglxxb> queryByTpbh(@Param("tpbh")String tpbh);

    int deleteByTmbhAndTpbh(@Param("tmbh")String tmbh,@Param("tpbh")String tpbh);
    List<TmTmytpglxxb>  selectByTmbhAndTpbh(@Param("tmbh")String tmbh,@Param("tpbh")String tpbh);

	int delectByTpbh(String tpbh);
}