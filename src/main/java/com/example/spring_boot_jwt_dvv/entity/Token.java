package com.example.spring_boot_jwt_dvv.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_token")
public class Token extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 933388817898163768L;
	@Column(length = 1000)
	private String token;
	private Date tokenExpDate;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Date getTokenExpDate() {
		return tokenExpDate;
	}
	public void setTokenExpDate(Date tokenExpDate) {
		this.tokenExpDate = tokenExpDate;
	}
	
}
