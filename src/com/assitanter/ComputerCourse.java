package com.assitanter;

import com.course.Course;

class ComputerCourse extends Course {
	Teacher teacher;
	public ComputerCourse(Teacher teacher, String courseID, float credit, String courseCharacter,
			String description, String term) {
		
		/* 
		 * super�ؼ��֣�ʵ�ֶԸ���ĳ�Ա�ͷ����ķ���;
		 * ����Ĺ��췽���ķ������У���һ��Ϊsuper���Ϳ��Ե��ø���ĸ��๹�췽��
		 * ��������ж������вι��췽������Javaϵͳ�����ṩĬ�ϵ��޲ι��췽����
		 * ���������Ĺ��췽����һ��Ҫͨ��super��ʾ���ø�����вι��췽��
		*/
		super(courseID, credit, courseCharacter, description, term);	//���ø���Ĺ��췽��
		this.teacher = teacher;
	}
	
	public void putInfo() {
		System.out.println("�γ̱�� " + courseID);
		System.out.println("ѧ�� " + credit);
		System.out.println("�γ����� "+ courseCharacter);
		
		//termΪprivateȨ�ޣ�ֻ�ܱ�����ʣ����ɱ���ͬ�����������
		//System.out.println("����ѧ�� " + term);
		
		//descriptionΪĬ��Ȩ�ޣ�ֻ�ܱ�����������ʣ����ɱ���ͬ�����������
		//System.out.println("�γ̽��� " + description);
	}

}
