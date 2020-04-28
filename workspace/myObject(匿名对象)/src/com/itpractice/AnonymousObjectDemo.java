package com.itpractice;
/*
 * 匿名对象：没有名字的对象
 *   应用场景:当方法之调用一次的时候可以使用匿名对象
 *         可以当做参数进行传递，但是无法在传参之前做其他的事情
 * 
 */
public class AnonymousObjectDemo {

	public static void main(String[] args) {
//      Student s  = new Student();
//      s.study();
       
		new Student().study();
//  匿名变量： 没有变量引用的对象
	}

}
class Student{
	String name;
	int age;
	
	public void study(){
		System.out.println("good");
	}
}