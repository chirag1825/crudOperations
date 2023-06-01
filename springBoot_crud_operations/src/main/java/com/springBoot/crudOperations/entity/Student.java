package com.springBoot.crudOperations.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentData")
public class Student {

	@Id
	@GeneratedValue
	@Column(name = "studentId")
	private int id;
	@Column(name = "schoolName")
	private String sName;
	@Column(name = "firstName")
	private String fName;
	@Column(name = "lastName")
	private String lName;
	@Column(name = "standard")
	private int std;
	@Column(name = "division")
	private String div;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getDiv() {
		return div;
	}
	public void setDiv(String div) {
		this.div = div;
	}
	public Student(int id, String sName, String fName, String lName, int std, String div) {
		super();
		this.id = id;
		this.sName = sName;
		this.fName = fName;
		this.lName = lName;
		this.std = std;
		this.div = div;
	}
	public Student() {
		super();
	}

	
}
