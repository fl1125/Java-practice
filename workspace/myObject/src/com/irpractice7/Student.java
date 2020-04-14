package com.irpractice7;

public class Student {
    private int age;
    private String name;
    
    public void setName(String name){
    	this.name = name;
    	
    }
    public String getName(){
    	return name;
    }
    
    public void setAge(int age){
    	if(age<0 || age>200){
    		System.out.println("你输入的年龄有误");
    	}else{ 
    	this.age = age;
    	}
    }
    public int getAge(){
    	return age;
    }

}
