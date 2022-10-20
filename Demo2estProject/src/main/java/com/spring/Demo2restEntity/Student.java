package com.spring.Demo2restEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	private Integer sid;
	private String fname;
	private String lname;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer sid, String fname, String lname) {
		super();
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", " + (fname != null ? "fname=" + fname + ", " : "")
				+ (lname != null ? "lname=" + lname : "") + "]";
	}

}
