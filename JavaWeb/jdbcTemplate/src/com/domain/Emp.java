package com.domain;

import java.util.Date;

/*
 * 封装Emp表数据的Javabean
 * 
 */
public class Emp {
	private int id;
	private String NAME;
	private String gender;
	private double salary;
	private Date join_date;
	private int dept_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", NAME=" + NAME + ", gender=" + gender + ", salary=" + salary + ", join_date="
				+ join_date + ", dept_id=" + dept_id + "]";
	}
	


}
