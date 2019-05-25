package com.assitanter;

class Teacher {
	public int age;
	protected String addr;
	String name;
	private int account;
	String teacherID;
	
	public Teacher(int age, String addr, String name, int account, String teacherID) {
		this.age = age;
		this.addr = addr;
		this.name = name;
		this.account = account;
		this.teacherID = teacherID;
	}
	
	public void getInfo(String teacherID) {
		this.teacherID = teacherID;
	}
	
	public void question(Student1 s) {
		System.out.print(s.studentAddr + " \t" + s.studentAge + " \t"
				+ s.studentName);
		//System.out.print("\t" + s.studentAccount);
	}

}
