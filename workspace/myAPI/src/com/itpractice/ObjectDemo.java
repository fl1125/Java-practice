package com.itpractice;
/*
 * boolean equals(Object obj)
 * 
 * 
 * 
 */
public class ObjectDemo {
  public static void main(String[] args) {
	 Person p = new Person("jack", 1);
	 Person p2 = new Person("jack", 1);
	 
	 boolean flag = p.equals(p2); 
	 System.out.println(flag);
}
  
}
class Person{
	String name;
	int age;
	
	public Person (String name, int age){
		this.name = name;
		this.age = age;
	}
	 @Override
	   public boolean equals(Object o){
		return true;
		   
	   }
}

  