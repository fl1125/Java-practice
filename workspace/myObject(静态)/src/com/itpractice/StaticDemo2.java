package com.itpractice;
/*
 * static的注意事项
 *     静态方法：
 *         可以调用静态的成员变量
 *         可以调用静态的成员方法
 *         不可以调用非静态成员变量
 *         不可以调用非静态成员方法
 *         静态方法只能调用的静态的成员
 *      非静态方法：
 *         可以调用静态的成员变量
 *         可以调用静态的成员方法
 *         可以调用非静态的成员变量
 *         可以调用非静态的成员方法
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
