package com.itpractice;
/*
 * static��ע������
 *     ��̬������
 *         ���Ե��þ�̬�ĳ�Ա����
 *         ���Ե��þ�̬�ĳ�Ա����
 *         �����Ե��÷Ǿ�̬��Ա����
 *         �����Ե��÷Ǿ�̬��Ա����
 *         ��̬����ֻ�ܵ��õľ�̬�ĳ�Ա
 *      �Ǿ�̬������
 *         ���Ե��þ�̬�ĳ�Ա����
 *         ���Ե��þ�̬�ĳ�Ա����
 *         ���Ե��÷Ǿ�̬�ĳ�Ա����
 *         ���Ե��÷Ǿ�̬�ĳ�Ա����
 *         
 * 
 * 
 */
public class StaticDemo2 {
       
	public static void main(String[] args) {
		Student.graduateFrom = "aa";
		Student.study();
	}
}

class Student{
	String name;
	int age;
	static String graduateFrom;
	
	public static void study(){
		System.out.println(graduateFrom);
		sleep();
	}
	
	public static void sleep(){
		System.out.println("sleep");
	}
}
