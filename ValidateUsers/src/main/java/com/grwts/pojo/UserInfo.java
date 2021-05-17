package com.grwts.pojo;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class UserInfo {
	private int id;
	@Size(min = 4,max = 15)
	private String userName;
	@Size(min = 8,max = 16,message = "password should not be less then  8")
	private String password;
	
	private int age;
	@Past(message = "date of birth should in past")
	private String dob;
	public String getUserName() {
		return userName;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "UserInfo [userName=" + userName + ", password=" + password + ", age=" + age + ", dob=" + dob + "]";
	}
	public UserInfo(String userName, String password, int age, String dob) {
		super();
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.dob = dob;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserInfo(int id, @Size(min = 4, max = 15) String userName,
			@Size(min = 8, max = 16, message = "password should not be less then  8") String password, int age,
			@Past(message = "date of birth should in past") String dob) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.dob = dob;
	}
	

}
