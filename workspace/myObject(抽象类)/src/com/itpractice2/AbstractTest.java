package com.itpractice2;
/*
 *  基础班老师，就业办老师
 *  
 *  共性：
 *    属性  姓名，年龄，性别
 *    
 *    行为  讲课，唱歌
 * 
 */
public class AbstractTest {

	public static void main(String[] args) {
	   BasicTeacher bt = new BasicTeacher();
	   bt.name  = "jack";
	   bt.teach();
	   
	   JobTeacher jt = new JobTeacher();
	   jt.name = "black";
	   jt.teach();
			   
			   
	}

}

abstract class Teacher {
	String name;
	int age;
	String gender;
	
	public abstract void teach();
}
class BasicTeacher extends Teacher {

	@Override
	public void teach() {
	      System.out.println(name +"讲基础班课程");
		
	}
	
}
class JobTeacher extends Teacher{

	@Override
	public void teach() {
	  System.out.println(name +"讲提升课程");
	}
	
}
