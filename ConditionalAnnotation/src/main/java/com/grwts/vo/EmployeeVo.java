package com.grwts.vo;

public class EmployeeVo {
	private int empid;
	private String empName;
	private String city;
	private String companyName;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "EmployeeVo [empid=" + empid + ", empName=" + empName + ", city=" + city + ", companyName=" + companyName
				+ "]";
	}
	public EmployeeVo(int empid, String empName, String city, String companyName) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.city = city;
		this.companyName = companyName;
	}
	public EmployeeVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
