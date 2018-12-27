package com.gx.hz.service;

import java.util.List;
import java.util.Map;

import com.gx.common.utils.PageInfo;
import com.gx.common.utils.ResultBean;
import com.gx.hz.pojo.TmTmxxbTJ;
import com.gx.hz.pojo.TmTmxxbYW;

public interface TmTmxxbTJService  extends IBaseService<TmTmxxbTJ>{

    PageInfo<TmTmxxbTJ> getTmTmxxbTJByCondition(int limit, int offset,Map<String,Object> maps) throws Exception;

    int insertService(TmTmxxbTJ tm);

    int updateService(TmTmxxbTJ tm);

    List<TmTmxxbTJ> queryByjzbh(String jzbh);
    
    int queryByjzbhToInt(String jzbh);
    
    PageInfo<TmTmxxbTJ> getShtmList( int limit, int offset,Map<String,Object> maps) throws Exception;

    public int deleteByIds(String... ids) throws Exception;

	TmTmxxbTJ queryByTmbh(String tmbh);
	
	/**
	 * 查询总记录数
	 * @param jzbh卷宗编号
	 * @return
	 */
	int getTmXuhao(String jzbh);
	
	/**
	 * 查询顺序号最大的条目信息
	 * @param jzbh卷宗编号
	 * @return
	 */
	TmTmxxbTJ queryMaxSxhByJzbh(String jzbh);


    TmTmxxbTJ getTMByTpbh(String tpbh);

	ResultBean updateType(Long[] ids, Long wtgId);

	/**
	 * 
	 * 【根据卷宗编号获取已关联的条目跟图片信息】
	 * 
	 * @author cyq 2018年3月9日
	 * @param limit
	 * @param offset
	 * @param maps
	 * @return
	 * @throws Exception
	 */
	 PageInfo<TmTmxxbTJ> getTJGlTmImgAndDetailPage(int limit, int offset,Map<String,Object> maps) throws Exception;

	int deleteByTmbh(String[] tmbhs);
	
	List<TmTmxxbTJ> queryByTmbhs(String[] tmbhs);

	TmTmxxbTJ getTmXuhaoAndYS(String jzbh);

	TmTmxxbTJ getTMByTmbh(String tmbh);
}
