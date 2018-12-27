package com.gx.hz.pojo;

import java.io.Serializable;
import java.util.Date;

public class SysChartConfig implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
    private String panelName;//面板名称

    private Long giveOrder;//默认序号

    private Long newOrder;//最新序号

    private String giveSize;//默认尺寸

    private String newSize;//最新尺寸

    private String giveHeight;//默认高度

    private String newHeight;//最新高度

    private Long chartNumber;//关联图表(1.全市户籍档案情况 2.各业务档案占比3.各单位业务档案查询业务累计数4.全市档案变化趋势5.各类户籍档案变化历程)

    private String remark;//备注 

    private String updateUserid;

    private Date updateDate;

    private Long isDel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPanelName() {
        return panelName;
    }

    public void setPanelName(String panelName) {
        this.panelName = panelName == null ? null : panelName.trim();
    }

    public Long getGiveOrder() {
        return giveOrder;
    }

    public void setGiveOrder(Long giveOrder) {
        this.giveOrder = giveOrder;
    }

    public Long getNewOrder() {
        return newOrder;
    }

    public void setNewOrder(Long newOrder) {
        this.newOrder = newOrder;
    }

    public String getGiveSize() {
        return giveSize;
    }

    public void setGiveSize(String giveSize) {
        this.giveSize = giveSize == null ? null : giveSize.trim();
    }

    public String getNewSize() {
        return newSize;
    }

    public void setNewSize(String newSize) {
        this.newSize = newSize == null ? null : newSize.trim();
    }

    public String getGiveHeight() {
        return giveHeight;
    }

    public void setGiveHeight(String giveHeight) {
        this.giveHeight = giveHeight == null ? null : giveHeight.trim();
    }

    public String getNewHeight() {
        return newHeight;
    }

    public void setNewHeight(String newHeight) {
        this.newHeight = newHeight == null ? null : newHeight.trim();
    }

    public Long getChartNumber() {
        return chartNumber;
    }

    public void setChartNumber(Long chartNumber) {
        this.chartNumber = chartNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
    
    public String getUpdateUserid() {
        return updateUserid;
    }

    public void setUpdateUserid(String updateUserid) {
        this.updateUserid = updateUserid == null ? null : updateUserid.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Long getIsDel() {
        return isDel;
    }

    public void setIsDel(Long isDel) {
        this.isDel = isDel;
    }
}