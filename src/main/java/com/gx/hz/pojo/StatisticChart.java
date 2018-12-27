package com.gx.hz.pojo;

public class StatisticChart {
    private Integer id;

    private String chartName;

    private Short chartXIndex;

    private Short chartYIndex;

    private String idName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChartName() {
        return chartName;
    }

    public void setChartName(String chartName) {
        this.chartName = chartName == null ? null : chartName.trim();
    }

    public Short getChartXIndex() {
        return chartXIndex;
    }

    public void setChartXIndex(Short chartXIndex) {
        this.chartXIndex = chartXIndex;
    }

    public Short getChartYIndex() {
        return chartYIndex;
    }

    public void setChartYIndex(Short chartYIndex) {
        this.chartYIndex = chartYIndex;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName == null ? null : idName.trim();
    }

	@Override
	public String toString() {
		return "StatisticChart [id=" + id + ", chartName=" + chartName
				+ ", chartXIndex=" + chartXIndex + ", chartYIndex="
				+ chartYIndex + ", idName=" + idName + "]";
	}
    
}