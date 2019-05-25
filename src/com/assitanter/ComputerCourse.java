package com.assitanter;

import com.course.Course;

class ComputerCourse extends Course {
	Teacher teacher;
	public ComputerCourse(Teacher teacher, String courseID, float credit, String courseCharacter,
			String description, String term) {
		
		/* 
		 * super关键字：实现对父类的成员和方法的访问;
		 * 在类的构造方法的方法体中，第一条为super语句就可以调用该类的父类构造方法
		 * 如果父类中定义了有参构造方法，这Java系统不再提供默认的无参构造方法；
		 * 因此在子类的构造方法中一定要通过super显示调用父类的有参构造方法
		*/
		super(courseID, credit, courseCharacter, description, term);	//引用父类的构造方法
		this.teacher = teacher;
	}
	
	public void putInfo() {
		System.out.println("课程编号 " + courseID);
		System.out.println("学分 " + credit);
		System.out.println("课程性质 "+ courseCharacter);
		
		//term为private权限，只能本类访问，不可被不同包的子类访问
		//System.out.println("开设学期 " + term);
		
		//description为默认权限，只能被本包或本类访问，不可被不同包的子类访问
		//System.out.println("课程介绍 " + description);
	}

}
