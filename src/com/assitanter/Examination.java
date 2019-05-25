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
			System.out.println("通过考试，实际学分为" + c);
		}
		if(score < 60) {
			c = 0;
			System.out.println("未通过考试，实际学分为" + c);
		}
		//System.out.println("课程性质" + courseCharacter);
		//courseCharacter为protected权限，不可被不同包的非子类访问
		return c;
	}

}
