package com.itpractice8;

public class StudentDemo {

	public static void main(String[] args) {
//		调用构造方法
		Student s = new Student();
		s.show();
		
		Student s2= new Student("jack");
		s2.show();
		Student s3 = new Student(22);
		s3.show();
 
		Student s4 = new Student("jack", 22);
		s4.show();
	}

}
