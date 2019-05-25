package com.assitanter;

public class Assitanter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examination exam;
		Student1 zhangGang = new Student1(19, "山西太原", "张刚", 350);
		Teacher missLiu = new Teacher(35, "北京", "刘老师", 2000, "102198");
		ComputerCourse c1 = new ComputerCourse(missLiu, "12345", 3.5f, "必修", "Java语言程序设计", "5");
		c1.putInfo();
		exam = new Examination(zhangGang, c1, 55f);
		exam.putCredit();
		System.out.println();

	}

}
