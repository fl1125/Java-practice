package com.itpractice4;
/*
 * 
 * 学生类的测试类
 *     
 * 通过对象直接访问成员变量，会存在数据的安全问题
 *   使用 private关键字来不让外界的对象直接访问成员变量
 *   
 *   private 是一个修饰符
 *   可以修饰成员变量，也可以修饰成员方法
 *   被private修饰的成员只能在本类中被访问
 *   
 *   针对private修饰的成员变量，使用getXxx()和setXxx()用于获取和设置成员变量的值
 */
public class StudentDemo {

	public static void main(String[] args) {
	 
	Student s = new Student();
	s.show();
	
//	s.age = 22;
	s.setAge(28);
	s.name = "jack";
	s.show();
		
	}

}
