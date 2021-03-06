package com.itpractice;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 学生管理系统的主类
 *   定义学生类
 *   学生管理系统的主界面的代码
 *   学生管理系统的查看所有学生的代码
 *   学生管理系统的添加学生的代码
 *   学生管理系统的删除学生代码
 *   学生管理系统的修改学生代码
 * 
 */
public class StudentManegerTest {

	public static void main(String[] args) {

//		创建集合对象，用于存储学生数据
		ArrayList<Student> array = new ArrayList<Student>();
		
//		为了让程序循环 使用while(true)
		while(true){
		System.out.println("--------欢迎来到学生系统--------");
		System.out.println("1查看所有学生");
		System.out.println("2添加学生");
		System.out.println("3删除学生");
		System.out.println("4修改学生");
		System.out.println("5退出");
		System.out.println("请输入你的选择");
		
//		键盘创建录入对象
		Scanner sc = new Scanner(System.in);
		String choiceString = sc.nextLine();
		
//		用switch语句实现选择
		switch(choiceString){

//		查看所有学生
		case "1":
			findALLStudent(array);
			break;
		//			添加学生
		case "2":
		   addStudent(array);
			break;
			
//			删除学生
		case "3":
			deleteStudent(array);
			break;
	
//			修改学生
		case "4":
			updateStudent(array);
			break;
	
//		退出
		case "5":
		
			
		default:
			System.out.println("谢谢你的使用");
			System.exit(0);  //JVM退出
		break;		
        	}
		
    	}
    }
//	添加学生
	public static void addStudent(ArrayList<Student> array){
//	   创建键盘录入对象 
		Scanner sc = new Scanner(System.in);
		String id ;
		while(true){
			System.out.println("请输入学生学号：");
			id = sc.nextLine();
	//	判断学号是否被占用
	//		定义标记
			boolean flag = false;
			for(int x=0; x<array.size(); x++){
				Student s = array.get(x);
	//		获取该学生的学号和键盘录入的学号进行比较
				if(s.getId().equals(id)){
					flag = true;
					break;
				}
			} 
			  if(flag){
				   System.out.println("你输入的学号已经被占用，请重新输入");
			  }else{
			       break; 	  
			  }
		}
		System.out.println("请输入学生姓名：");
		String name = sc.nextLine();
		System.out.println("请输入学生年龄：");
		String age = sc.nextLine();
		System.out.println("请输入学生地址：");
		String address  = sc.nextLine();
		

//		创建学生对象
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
        
//		把学生对象作为元素添加到集合
		array.add(s);
		
//		给出提示
		System.out.println("添加成功");
	}
	
//	删除学生
	public static void deleteStudent(ArrayList<Student> array){
//根据学号来删除学生，因为学号是唯一的
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要删除的学生学号");
		String id = sc.nextLine();
		
//		遍历集合
		int index = -1; 
		for(int x=0; x<array.size(); x++ ){
			Student s = array.get(x);
			
			if(s.getId().equals(id)){
				index = x;
				
				break;
				
				
			}
			
		}
		if(index == -1){
			System.out.println("你要删除的学生信息不存在");
		}else{
			array.remove(index);
			System.out.println("删除学生成功");
		}
		
	}	

//	修改学生
	  public static void updateStudent(ArrayList<Student> array){
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("请输入你要修改学生的学号");
		  
		  String id = sc.nextLine();
		   int index = -1;
		  for(int x=0; x<array.size(); x++){
			  Student s = array.get(x);
			  if(s.getId().equals(id)){
					index = x;
					
					break;
		   }
		   }
			  if(index == -1){
				  System.out.println("你要删除的学生信息不存在");
			  }else{
				  
					   System.out.println("请输入学生新姓名");
					   String name = sc.nextLine();
					   System.out.println("请输入学生新年龄");
					   String age = sc.nextLine();
					   System.out.println("请输入学生新地址");
					   String address = sc.nextLine();
					   
					   Student s = new Student();
					   s.setId(id);
					   s.setName(name);
					   s.setAge(age);
					   s.setAddress(address);
					   
//					   修改集合中的学生对象
					   array.set(index, s);
					   System.out.println("修改学生成功");
			  }
		  }
	  
//	查看所有学生
	  public static void findALLStudent(ArrayList<Student> array){

//		  首先判断该集合中是否有方法数据，如果没有，就是给出提示，并让该方法不再继续执行下去
		  if(array.size() == 0){
			  System.out.println("目前没有学生信息可供查询，请回去继续操作");
			  return;
		  }
		  
//		   \t就是一个TAB键的位置
		   System.out.println("学号\t姓名\t年龄\t居住地");
		   for(int x=0; x<array.size(); x++){
		    	Student s = array.get(x);
		    	System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());;
		    }
	  }

}
