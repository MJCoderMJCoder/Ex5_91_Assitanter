package com.assitanter;

import com.course.Course;

class Examination {
	Student1 student;
	float score;
	Course course;
	
	public Examination(Student1 student, Course course, float score) {
		this.student = student;
		this.course = course;
		this.score = score;
	}
	
	public float putCredit() {
		float c = 0.0f;
		if(score >= 60) {
			c = course.credit;
			System.out.println("ͨ�����ԣ�ʵ��ѧ��Ϊ" + c);
		}
		if(score < 60) {
			c = 0;
			System.out.println("δͨ�����ԣ�ʵ��ѧ��Ϊ" + c);
		}
		//System.out.println("�γ�����" + courseCharacter);
		//courseCharacterΪprotectedȨ�ޣ����ɱ���ͬ���ķ��������
		return c;
	}

}
