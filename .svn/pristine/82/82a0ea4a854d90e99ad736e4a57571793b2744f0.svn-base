package com.gx.hz.service;

import com.gx.common.utils.ResultBean;
import com.gx.hz.pojo.OriInfoPrimary;
import com.gx.hz.pojo.OriInfoPrimaryCopy;
import com.gx.hz.pojo.TmTmtpxxb;

import java.util.List;

/**
 * Created by ten on 17/12/4.
 */
public interface OriInfoPrimaryService  extends IBaseService<OriInfoPrimary> {

    public int insertOriInfo(OriInfoPrimary oriInfoPrimary);
    public int updateOriInfo(OriInfoPrimary oriInfoPrimary);
    
    public int getOriInfoPrimaryByJzTolr(String jzbh);
    public OriInfoPrimary findOriInFoByTPBh(String tpbh);

    public Integer findCountPrimaryByJzId(Long jzId);
    
    public List<OriInfoPrimary> getOriInfoPrimaryByJz(String jzbh);
    
    public int getOriInfoPrimaryByJzToInt(String jzbh);
    public int  getOriInfoPrimaryByJzTolrs(String jzbh);
    
    public List<OriInfoPrimary> getOriInfoPrimaryByJzAndSatae(String jzbh);
    List<TmTmtpxxb> getTmTmtpxxbByJzAndSatae(String jzbh);
    List<TmTmtpxxb> selectNoPassTPByJzbh(String jzbh);
    List<OriInfoPrimary> selectByTmbh(String tmbh);

    public int updateConsistencyByPrimaryKey(Long id,Integer state);
    public int updateConsistencyByTpbh(String  tpbh,Integer state);


    public OriInfoPrimary findFullOriInfoByTPBH(String tpbh);
    
    public int getOriInfoPrimaryBytpbhToInt(String tpbh);
//    public int
	public ResultBean delectByTpbh(String tpbh);
}
