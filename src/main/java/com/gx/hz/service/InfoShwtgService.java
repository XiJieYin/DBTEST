package com.gx.hz.service;

import java.util.Map;

import com.gx.common.utils.PageInfo;
import com.gx.common.utils.ResultBean;
import com.gx.hz.pojo.DosAJ;
import com.gx.hz.pojo.DosJz;
import com.gx.hz.pojo.InfoShwtg;
import com.gx.hz.pojo.TmTmtpxxb;
import com.gx.hz.pojo.TmTmxxbYW;

public interface InfoShwtgService extends IBaseService<InfoShwtg>{
	public int InsertService(InfoShwtg infoShwtg);
	
	public int UpdateService(InfoShwtg infoShwtg);
	
	public PageInfo<InfoShwtg> getDosJzByConditionToAj(int limit,int offset,String orgCode,String qzh,String lbh,String mlh,String ajh,String cfwz,String tm,String kssj,String jssj,String zt,String rwmc,String rwId);
	
	public PageInfo<InfoShwtg> getDosJzByConditionToJz(int limit,int offset,String orgCode,String qzh,String lbh,String mlh,String ajh,String cfwz,String tm,String kssj,String jssj,String zt,String rwmc);
	
	public PageInfo<InfoShwtg> getDosJzByConditionToTm(int limit,int offset,String orgCode,String qzh,String lbh,String mlh,String ajh,String cfwz,String tm,String kssj,String jssj,String zt,String rwmc);
	
	public PageInfo<InfoShwtg> getDosJzByConditionToTp(int limit,int offset,String orgCode,String qzh,String lbh,String mlh,String ajh,String cfwz,String tm,String kssj,String jssj,String zt,String rwmc);

	public int getCount(Long rwId);
	
	public int getCounts(Long rwId,Long userId,Long rylx);
	
	public int getCountByRylx(Long rwId,Long userId,Long rylx);


	public InfoShwtg selectByshwt(Long jzId, Integer satae);

	public ResultBean selectByYw(String bh, Integer sataes);

	InfoShwtg getWtgByJzId(Integer sataes, Long jzId, Long userId, Long rwId, String tmbh);
}
