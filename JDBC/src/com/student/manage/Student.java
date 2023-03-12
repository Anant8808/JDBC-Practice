package com.student.manage;

public class Student {
	
	private int studentId;
	private String studentname;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", studentaddress=" + studentaddress
				+ ", studentcity=" + studentcity + "]";
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	public String getStudentcity() {
		return studentcity;
	}
	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentname, String studentaddress, String studentcity) {
		super();
		this.studentname = studentname;
		this.studentaddress = studentaddress;
		this.studentcity = studentcity;
	}
	private String studentaddress;
	private String studentcity;
	public Student(int studentId, String studentname, String studentaddress, String studentcity) {
		super();
		this.studentId = studentId;
		this.studentname = studentname;
		this.studentaddress = studentaddress;
		this.studentcity = studentcity;
	}

}
