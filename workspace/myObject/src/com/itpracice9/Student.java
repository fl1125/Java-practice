package com.itpracice9;
/*
 * ѧ����(���в����Ĺ��췽��)
 * 
 * 
 */
public class Student {
 
	private String name;
	private int age;
	
	public Student(){
	}
//	���췽��
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}


	
//	��Ա����
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