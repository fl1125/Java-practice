package com.itpractice;
/*
 * 
 * abstract 关键字，用于修饰方法和类
 * 抽象方法：不同的方法是相似的，但是内容又不太一样，所以我们只能抽取他的声明，没有具体的方法，没有具体方法体的方法就是抽象方法
 * 抽象类：有抽象方法的类必须是抽象类
 */
public class AbstractDemo {

	public static void main(String[] args) {
	
	}

}

abstract class Animal{
	public abstract void eat();
	
}

class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
		
	}
	/*public void eat(){
		System.out.println("猫吃鱼");
	}*/
}
abstract class Dog extends Animal{
	/*public void eat(){
		System.out.println("狗吃肉");
	}*/
}