package com.wch.dubbo.bean;

import java.io.Serializable;

/**
 * @author CH W
 * @description
 * @date 2020年5月14日 下午4:43:04
 * @version 1.0
 */
public class User implements Serializable {
	private static final long serialVersionUID = -4078825954655393019L;
	
	private String userName;
	private String password;
	private String mobile;
	private String description;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "{userName：" + userName + "，password：" + password +"，mobile：" + mobile + "，description：" + description + "}";
	}

}
