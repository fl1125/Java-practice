package com.itpractice;
/*
 * static:是一个关键字，用于修饰成员变量和成员方法
 *   特点：
 *     被所有的对象所共享
 *     可以使用类名调用
 *     静态的加载优于对象
 *     随着类的加载而加载   
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