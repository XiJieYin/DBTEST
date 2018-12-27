package com.gx.hz.pojo;

/**
 * 
 *
 * @version 
 * @author lkx  2017-8-14 下午4:26:21
 *
 */
public class SysRoleMenu {
    private Long id;

    private Long roleId;

    private Long menuId;
    
    public SysRoleMenu() {
	}
	public SysRoleMenu(Long roleId, Long menuId) {
		this.roleId = roleId;
		this.menuId = menuId;
	}



	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}