package com.itpractice;

/*
 * 抽象类的成员特点：
 * 		成员变量
 * 			可以有成员变量
 * 			可以有常量
 * 		成员方法
 * 			可以有抽象方法
 * 			可以有非抽象方法
 * 		构造方法
 * 			可以有构造方法的，需要对抽象类的成员变量进行初始化
 * 
 * final:修饰类、成员变量、成员方法
 */
public class AbstractDemo3 {
	public static void main(String[] args) {
		Dog22 d = new Dog22();
		d.barking();
	}
}

abstract class Animal22 {
	String name = "哮天犬";
	final int num = 10;
	
	public Animal22() {
		System.out.println("我是抽象类的构造方法");
	}
	
	public abstract void eat();
	
	public void run() {}
}

class Dog22 extends Animal22 {
	public void barking() {
		System.out.println(name);
		System.out.println(num);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}
