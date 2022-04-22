package com.cg.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// Model class or Java Bean or POJO
@Entity
@Table(name="Dep")
public class Department {
	
	//Attributes
	@Id  // primary key
	private int deptno;
	private String dname;
	private String loc;
	
	//default constructor
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public Department(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	//setters and getters
	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	//toString
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
	
	
	

}
