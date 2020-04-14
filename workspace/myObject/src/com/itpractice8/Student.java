package com.itpractice8;
/*
 * 构造方法：
 *    给对象的数据进行初始化
 * 格式： 
 *    方法名和类名相同
 *    没有返回值类型，连void都不能写
 *    没有具体的返回值
 * 
 * 成员变量赋值：
 *   setXxx()方法
 *   带参构造方法
 * 
 * 
 */
public class Student {
  private String name;
   private int age;
   
   public Student(){
	   
   }
   
   public Student(String name){
	   this.name = name;
   }
   
   public Student(int age){
	   this.age = age;
   }
   
   public Student(String name,int age){
	   this.age = age;
	   this.name = name;
   }
   
   public void show(){
   System.out.println(name+"------"+age);
   }
   /*
   public Student(){
    System.out.println("这是构造方法 ");
   }*/
}
