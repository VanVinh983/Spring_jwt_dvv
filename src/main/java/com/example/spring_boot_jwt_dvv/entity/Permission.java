package com.example.spring_boot_jwt_dvv.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_permission")
public class Permission extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7432948859957609837L;
	private String permissionName;
    private String permissionKey;
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public String getPermissionKey() {
		return permissionKey;
	}
	public void setPermissionKey(String permissionKey) {
		this.permissionKey = permissionKey;
	}
    
}