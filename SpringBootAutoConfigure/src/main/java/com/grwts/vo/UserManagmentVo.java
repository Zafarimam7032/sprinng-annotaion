package com.grwts.vo;

public class UserManagmentVo {
	private String userName;
	private String password;
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
	@Override
	public String toString() {
		return "UserManagmentVo [userName=" + userName + ", password=" + password + "]";
	}
	public UserManagmentVo(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public UserManagmentVo() {
		super();
	}
	

}
