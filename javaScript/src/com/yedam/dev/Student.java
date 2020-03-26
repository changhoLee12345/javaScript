package com.yedam.dev;

public class Student {
	String sName;
	String sNo;
	int age;
	public Student(String sName, String sNo, int age) {
		super();
		this.sName = sName;
		this.sNo = sNo;
		this.age = age;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsNo() {
		return sNo;
	}
	public void setsNo(String sNo) {
		this.sNo = sNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [sName=" + sName + ", sNo=" + sNo + ", age=" + age + "]";
	}
}
