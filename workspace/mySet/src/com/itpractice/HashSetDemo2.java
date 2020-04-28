package com.itpractice;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 使用HashSet存储自定义对象并遍历
 * 
 */
public class HashSetDemo2 {

	public static void main(String[] args) {
        
		HashSet<Student> hs = new HashSet<Student>();
		
		Student s = new Student("j", 2);
		Student s2 = new Student("b", 4);
		
		hs.add(s);
		hs.add(s2);
		for(Student student :hs){
			System.out.println(student);
		}
	}

}

class Student{
	String name;
	int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		
		if(this.age != s.age){
			return false;
		}
		if(!this.name.equals(s.name)){
			return false;
		}
		return true;
	}
	@Override
	public int hashCode() {
	 return 1;
	}
}