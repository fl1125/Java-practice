package com.itpractice2;

import java.util.ArrayList;

/*
 *   存储自定义对象并遍历
 * 
 * 
 */
public class ArratListTest3 {

	public static void main(String[] args) {
	       
//		创建集合对象
		   ArrayList<Student> array = new ArrayList<Student>();
	         
//		   创建学生对象
	         Student s1 = new Student("林青霞",28);
	         Student s2 = new Student("张",55);
	         Student s3 = new Student("李",45);
	         Student s4 = new Student("王",15);
	         
//	         把学生对象作为元素添加到集合中
	      array.add(s1);
	      array.add(s2);
	      array.add(s3);
	      array.add(s4);
	      
//	      遍历集合
	      for(int x=0; x<array.size();x++){
	    	   Student s = array.get(x);
	    	   System.out.println(s.getName()+s.getAge());
	      }
	}

}
