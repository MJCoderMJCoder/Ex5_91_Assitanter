package com.assitanter;

public class Assitanter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examination exam;
		Student1 zhangGang = new Student1(19, "ɽ��̫ԭ", "�Ÿ�", 350);
		Teacher missLiu = new Teacher(35, "����", "����ʦ", 2000, "102198");
		ComputerCourse c1 = new ComputerCourse(missLiu, "12345", 3.5f, "����", "Java���Գ������", "5");
		c1.putInfo();
		exam = new Examination(zhangGang, c1, 55f);
		exam.putCredit();
		System.out.println();

	}

}
