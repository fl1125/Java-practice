package com.itpractcie;
/*
 * Student是一个学生事物描述类，main方法不适合放在它里面。
 * 
 * 使用一个类，其实就是使用该类的成员。(成员变量和成员方法)
 * 而我们要想使用一个类的成员，就必须首先拥有该类的对象。
 * 我们如何拥有一个类的对象呢?
 * 		创建对象就可以了?
 * 我们如何创建对象呢?
 * 		格式：类名 对象名 = new 类名();
 * 对象如何访问成员呢?
 * 		成员变量：对象名.变量名
 * 		成员方法：对象名.方法名(...)
 */
public class StudentDemo {
	
	public static void main(String[] args) {
	    Student s = new Student();	
	    
	    System.out.println("姓名："+s.name);
	    System.out.println("年龄："+s.age);
	    
//	    赋值
	    s.name = "li";
	    s.age =12;
	    System.out.println("姓名："+s.name);
	    System.out.println("年龄："+s.age);

//调用成员方法
	    s.stduy();
	    s.eat();
	}

}
