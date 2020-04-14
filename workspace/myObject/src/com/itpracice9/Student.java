package com.itpracice9;
/*
 * 学生类(带有参数的构造方法)
 * 
 * 
 */
public class Student {
 
	private String name;
	private int age;
	
	public Student(){
	}
//	构造方法
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}


	
//	成员方法
	public void setName(String name){
		this.name = name;
	} 
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	

}
