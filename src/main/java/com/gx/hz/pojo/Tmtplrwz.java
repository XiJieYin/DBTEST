package com.gx.hz.pojo;

public class Tmtplrwz {
    private Long id;

    private Long jzId;

    private Long totalPage;

    private Long nowPage;

    private String jzbh;

    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJzId() {
        return jzId;
    }

    public void setJzId(Long jzId) {
        this.jzId = jzId;
    }

    public Long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    public Long getNowPage() {
        return nowPage;
    }

    public void setNowPage(Long nowPage) {
        this.nowPage = nowPage;
    }

    public String getJzbh() {
        return jzbh;
    }

    public void setJzbh(String jzbh) {
        this.jzbh = jzbh == null ? null : jzbh.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}