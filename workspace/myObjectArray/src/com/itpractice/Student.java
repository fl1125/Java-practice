package com.itpractice;
/*
 * �Զ����ɹ��췽����
 * 		���������Ҽ� -- Source -- Generate Constructors from Superclass...	�޲ι��췽��
 * 		���������Ҽ� -- Source -- Generate Constructor using Fields...		���ι��췽��
 * �Զ�����getXxx()/setXxx():
 * 		���������Ҽ� -- Source -- Generate Getters and Setters...
 */
public class Student {
   private String name;
   private int age;

   public Student() {
	
}

public Student(String name, int age) {
	
	this.name = name;
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
} 

}
