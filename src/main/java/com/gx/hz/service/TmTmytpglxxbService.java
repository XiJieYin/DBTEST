package com.gx.hz.service;

import com.gx.hz.pojo.SysUser;
import com.gx.hz.pojo.TmTmytpglxxb;

import java.util.List;

/**
 * 条目与图片关联信息接口类
 * @author Administrator
 *
 */
public interface TmTmytpglxxbService extends IBaseService<TmTmytpglxxb>{

	List<TmTmytpglxxb> queryByTmbh(String tmbh);
	
	List<TmTmytpglxxb> queryByTpbh(String tpbh);

    int insertService(TmTmytpglxxb tm);

    int insertTmTmytpglxxbServices(String list,SysUser sysUser,String tmlx);
    
    int deleteTmTmytpglxxbServices(String list,SysUser sysUser,String tmlx, String flag);

    int deleteByTMBH(String tmbh);

	int delectByTpbh(String tpbh);
}
