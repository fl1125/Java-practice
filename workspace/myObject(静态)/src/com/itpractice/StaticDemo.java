package com.itpractice;
/*
 * static:��һ���ؼ��֣��������γ�Ա�����ͳ�Ա����
 *   �ص㣺
 *     �����еĶ���������
 *     ����ʹ����������
 *     ��̬�ļ������ڶ���
 *     ������ļ��ض�����   
 *     
 * 
 * 
 */

public class StaticDemo {
	public static void main(String[] args) {
		
	Person.graduateFrom = "hn";
	
	Person p = new Person();
	p.name = "jack";
	p.age = 18;
//	p.graduateFrom = "hn";
	p.speak();
	
	Person p2 = new Person();
	p2.name = "black";
	p2.age = 22;
//	p2.graduateFrom = "hn";
	p2.speak();
	
	}

}
  class Person{
	  String name;
	  int age;
	  static String graduateFrom;
	  
	  public void speak(){
		  System.out.println(name +"---"+graduateFrom);
	  }
  }