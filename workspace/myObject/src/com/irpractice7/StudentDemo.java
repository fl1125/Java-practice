package com.irpractice7;

public class StudentDemo {

	public static void main(String[] args) {
        Student s = new Student();
	    System.out.println(s.getName()+" "+s.getAge());
        
        s.setAge(22);
		s.setName("liu");
		 System.out.println(s.getName()+" "+s.getAge());

	}

}
