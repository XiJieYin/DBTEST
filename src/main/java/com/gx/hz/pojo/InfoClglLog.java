package com.gx.hz.pojo;

import java.util.Date;

public class InfoClglLog {
    private Integer id;

    private String userName;

    private Integer userId;

    private String ljdwDm;

    private String ljdwName;

    private Integer cllx;

    private Integer czlx;

    private Date czsj;

    private String roleCode;

    private Long roleId;

    private String roleName;

    private String czjg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLjdwDm() {
        return ljdwDm;
    }

    public void setLjdwDm(String ljdwDm) {
        this.ljdwDm = ljdwDm == null ? null : ljdwDm.trim();
    }

    public String getLjdwName() {
        return ljdwName;
    }

    public void setLjdwName(String ljdwName) {
        this.ljdwName = ljdwName == null ? null : ljdwName.trim();
    }

    public Integer getCllx() {
        return cllx;
    }

    public void setCllx(Integer cllx) {
        this.cllx = cllx;
    }

    public Integer getCzlx() {
        return czlx;
    }

    public void setCzlx(Integer czlx) {
        this.czlx = czlx;
    }

    public Date getCzsj() {
        return czsj;
    }

    public void setCzsj(Date czsj) {
        this.czsj = czsj;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getCzjg() {
        return czjg;
    }

    public void setCzjg(String czjg) {
        this.czjg = czjg == null ? null : czjg.trim();
    }
}