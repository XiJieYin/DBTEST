package com.gx.hz.dao;

import com.gx.hz.pojo.TmTmtpxxb;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TmTmtpxxbDao extends  BaseDao<TmTmtpxxb> {
    int deleteByPrimaryKey(Long id);

    int insert(TmTmtpxxb record);

    int insertSelective(TmTmtpxxb record);

    TmTmtpxxb selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TmTmtpxxb record);

    int updateByPrimaryKey(TmTmtpxxb record);
    
    public List<TmTmtpxxb> selectByTpbh(@Param("tpbh")String tpbh);

    public List<TmTmtpxxb> selectByJZBHAndTpbh(@Param("tpbh")String tpbh,@Param("jzbh")String jzbh);

    public List<TmTmtpxxb> selectByJZBHAndFileName(@Param("jzbh")String jzbh,@Param("filename")String fileName);

    public List<TmTmtpxxb> selectByJZBHAndFileNameToNum(@Param("jzbh")String jzbh,@Param("filename")String fileName);
    public List<TmTmtpxxb> selectByJZBHAndLikeFileName(@Param("jzbh")String jzbh,@Param("filename")String fileName);




    public List<TmTmtpxxb> selectByTpbhAllSatea(@Param("tpbh")String tpbh);

	public List<TmTmtpxxb> selectByJzbh(@Param("jzbh")String jzbh);

	public List<TmTmtpxxb> selectByJzbhForSatea(@Param("jzbh")String jzbh,@Param("satae")Integer satae);

    public List<TmTmtpxxb> selectNoPassTPByJzbh(@Param("jzbh")String jzbh);

	public List<TmTmtpxxb> queryByConditionByTmId(@Param("tmbh")String tmbh);


	public List<TmTmtpxxb> getTmTmtpxxbConditionNotConnect(Map<String, Object> conditionMap);

    int fakeDel(@Param("tpbh")String tpbh);


    int updateLr(@Param("id")Long id);
    int updateLrBytpbh(@Param("tpbh")String tpbh);
    int updateCleanSataeBytpbh(@Param("tpbh")String tpbh);

    int findCountLrByJzbh(@Param("jzbh")String jzbh) ;
    int updateSxmByTpbh(TmTmtpxxb tmTmtpxxb);
    int updateSxmByJzbhAndFileName(TmTmtpxxb tmTmtpxxb);
    
    /**
     * 
     * 【根据图片编号查询返回唯一结果】
     * 
     * @author cyq 2018年2月7日
     * @param tpbh
     * @return
     */
    TmTmtpxxb selectByTPBH(@Param("tpbh")String tpbh);
    
    /**
     * 
     * 【通过图片编号更新图片信息 】
     * 
     * @author cyq 2018年2月7日
     * @param xxb
     * @return
     */
    int updateByTpbh(TmTmtpxxb xxb);

	List<TmTmtpxxb> selectByJzbhs(@Param("jzbh")String jzbh);

	List<TmTmtpxxb> findLrTPByJZTM(@Param("jzbh")String jzbh);
}