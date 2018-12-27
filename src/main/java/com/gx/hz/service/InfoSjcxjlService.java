package com.gx.hz.service;

import com.gx.common.utils.PageInfo;
import com.gx.common.utils.ResultBean;
import com.gx.hz.pojo.InfoSjcxjl;

/**
 * Created by ten on 17/12/15.
 */
public interface InfoSjcxjlService  extends IBaseService<InfoSjcxjl> {

	public PageInfo<InfoSjcxjl> getYwInfoByCondition(int limit, int offset, String xm, String zjhm,
			 String dalx, String ssdwmc, String txmbh, String jzbh, String qzh, String lbh, 
			 String mlh, Short sxh, String tm,String dacfwzid,String flh, String zqzh,String qyzh,String ssdwid,String dalxid,String sfz);


    public int insertSelect(InfoSjcxjl infoSjcxjl);
    public int updateSelect(InfoSjcxjl infoSjcxjl);


    public InfoSjcxjl selectByYWZBID(Long id);
    
    /**
     * 
     * 【查询人员轨迹变化】
     * 
     * @author cyq 2018年2月12日
     * @param name
     * @param idCard
     * @return
     */
    ResultBean queryPersonContrail(String name, String idCard);
}
