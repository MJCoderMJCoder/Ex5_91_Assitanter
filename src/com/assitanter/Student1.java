package com.assitanter;

class Student1 {
	public int studentAge;
	protected String studentAddr;
	String studentName;
	private int studentAccount;
	
	public Student1(int studentAge, String studentAddr, String studentName, int studentAccount) {
		this.studentAccount = studentAccount;
		this.studentAddr = studentAddr;
		this.studentAge = studentAge;
		this.studentName = studentName;	//this代表实例对象自身
	}
	
	public Student1() {
		this.studentAge = 18;
	}
}
