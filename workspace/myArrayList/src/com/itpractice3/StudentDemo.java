package com.itpractice3;

import java.util.ArrayList;
import java.util.Scanner;



/*
 * 创建一个集合，存储学生对象，学生对象来自于键盘录入，最后，遍历集合。
 * 
 */
public class StudentDemo {
	public static void main(String[] args) {

//		创建集合
		ArrayList<Student> array = new ArrayList<Student>();
		
          
//  调用方法， 遍历集合
        addStudent(array);
        addStudent(array);
        addStudent(array);
			
        for(int x=0; x<array.size();x++){
        	Student s = array.get(x);
        	System.out.println(s.getName()+"----"+s.getAge());
        }
		
	}
       public static void addStudent(ArrayList<Student> array){
//   		键盘录入对象,创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
   		Scanner sc = new Scanner(System.in);
           System.out.println("请输入学生姓名");
           String name = sc.nextLine();
           
           System.out.println("请输入学生年龄");
           String age = sc.nextLine();
           
           Student s = new Student();
           s.setAge(name);
           s.setAge(age);

//           把学生对象作为元素存储到集合中
             array.add(s);
    	   
       }
}
