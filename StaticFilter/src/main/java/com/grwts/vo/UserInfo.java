package com.grwts.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(value = {"password","city"})
public class UserInfo {
	private String userNamej;
	//@JsonIgnore
	private String password;
	private String city;
	
	public UserInfo(String userNamej, String password, String city) {
		super();
		this.userNamej = userNamej;
		this.password = password;
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getUserNamej() {
		return userNamej;
	}
	public void setUserNamej(String userNamej) {
		this.userNamej = userNamej;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserInfo(String userNamej, String password) {
		super();
		this.userNamej = userNamej;
		this.password = password;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserInfo [userNamej=" + userNamej + ", password=" + password + "]";
	}
		

}
