package com.gx.hz.service;

import com.gx.common.utils.PageInfo;
import com.gx.common.utils.ResultBean;
import com.gx.hz.pojo.InfoSjcxjl;
import com.gx.hz.pojo.TmTmxxbTJ;
import com.gx.hz.pojo.TmTmxxbYW;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface TmTmxxbYWService  extends IBaseService<TmTmxxbYW>{

    PageInfo<TmTmxxbYW> getTmTmxxbYWByCondition(int limit, int offset,Map<String,Object> maps) throws Exception;
    
    int insertService(TmTmxxbYW tm);

	int updateService(TmTmxxbYW tm);

	List<TmTmxxbYW> queryByjzbh(String jzbh);

    public int deleteByIds(String... ids) throws Exception;

	TmTmxxbYW queryByTmbh(String tmbh);
	
	PageInfo<TmTmxxbYW> getShtmList( int limit, int offset,Map<String,Object> maps) throws Exception;
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
	TmTmxxbYW queryMaxSxhByJzbh(String jzbh);

    TmTmxxbYW getTMByTpbh(String tpbh);

	PageInfo<TmTmxxbYW> getByTm(int limit, int offset, String xm, String zjhm,
			String dalx, String ssdwmc, String txmbh, String jzbh, String qzh,
			String lbh, String mlh, Short sxh, String tm, String dacfwzid,
			String flh, String zqzh, String qyzh, String ssdwid, String dalxid,String sfz,String cfwzmc,String dzms,String createTime,String updateTime) throws ParseException;
	

	ResultBean updateType(Long[]ids, Long wtgId);

	int queryByjzbhToInt(String jzbh);

	PageInfo<TmTmxxbYW> getGjbg(int limit, int offset, String sfz, String xm, String dz);

	PageInfo<TmTmxxbYW> getJx(int limit, int offset, String sfzh, String dz,
			String dnlx, String xm,String createTime,String updateTime);

	PageInfo<TmTmxxbYW> getByTmToUserOrg(int limit, int offset, String xm,
			String zjhm, String dalx, String ssdwmc, String txmbh, String jzbh,
			String qzh, String lbh, String mlh, Short sxh, String tm,
			String dacfwzid, String flh, String zqzh, String qyzh,
			String ssdwid, String dalxid, String sfz, String cfwzmc,String dzms);
	
	
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
	 PageInfo<TmTmxxbYW> getYWGlTmImgAndDetailByCondition(int limit, int offset,Map<String,Object> maps) throws Exception;

	int deleteByTmbh(String[] tmbhs);
	
	List<TmTmxxbYW> queryByTmbhs(String[] tmbhs);

	TmTmxxbYW getTmXuhaoAndYS(String jzbh);

	TmTmxxbYW getLastTM();

	TmTmxxbYW getTMByTmbh(String tmbh);
}
