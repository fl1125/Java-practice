package com.itpracice9;

public class StudentDemo {

	public static void main(String[] args) {

	 
//	 无参+setXxx()
	 Student s = new Student();
	 s.setName("jack");
	 s.setAge(18);
	 System.out.println(s.getName()+"---"+s.getAge());

	
	 
//		 带参构造
    Student s2 = new Student("jack",16);
    System.out.println(s2.getName()+"---"+s2.getAge());

	}

}
