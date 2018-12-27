package com.gx.hz.service;

import com.gx.hz.pojo.OriInfoPrimary;
import com.gx.hz.pojo.OriInfoPrimaryCopy;

import java.util.List;

/**
 * Created by ten on 17/12/4.
 */
public interface OriInfoPrimaryCopyService extends IBaseService<OriInfoPrimaryCopy> {
	
	public List<OriInfoPrimaryCopy> getOriInfoPrimaryByJz(String jzbh);

    public int insertOriInfo(OriInfoPrimaryCopy OriInfoPrimaryCopy);
    
    public int updateOriInfo(OriInfoPrimaryCopy OriInfoPrimaryCopy);
    
    public int updateByTpbh(String ywtpbh);
    
    public OriInfoPrimaryCopy findOriInFoByTPBh(String tpbh);

    public Integer findCountPrimaryByJzId(Long jzId);
    
    public List<OriInfoPrimaryCopy> getOriInfoPrimaryCopyByJz(String jzbh);

    public OriInfoPrimaryCopy findOriInFoByTPBhAndUserId (String tpbh,Integer UserId);


    public List<OriInfoPrimaryCopy> getOriInfoPrimaryCopyByJzAndUserId(String jzbh,Integer userId);


    public List<OriInfoPrimaryCopy> getOriInfoPrimaryCopyByJzbh(String jzbh);

    public int updateConsistencyByTpbh(String  tpbh,Integer state, String jzbh);
//    public int
	List<OriInfoPrimaryCopy> getOriInfoPrimaryCopyByJzAndUserIds(String jzbh,
			Integer userId);

	OriInfoPrimaryCopy findOriInFoByTMBHAndTPBh(String tmbh, String tpbh);

	int updateByTmbhAndTpbh(String tmbh, String ywtpbh);
}
