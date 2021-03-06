package com.itpractice;
/*
 * boolean equals(Object obj)  
 * 		使用==来比较两个对象是否相等，则比较地址值是否相等
 */
public class ObjectDemo2 {

	public static void main(String[] args) {
	  Person0 p = new Person0("jack", 18);
	  Person0 p2 = new Person0("jack", 18);
	  
	  boolean flag  = p.equals(p2);
	  System.out.println(flag);
	}

}
//定义一个Person类
class Person0{
	String name;
	int age;
	
	public Person0(String name,int age){
		this.age = age;
		this.name = name;
		
				
	}
//	重写equals方法
	@Override
	public boolean equals(Object obj){
//		提高效率
		if(this == obj)
			return true;
		
		if(obj == null)
			return false;
		
//		提高健壮性
		if(getClass() != obj.getClass())
			return false;
		
//		向下转型
		Person0 other = (Person0) obj;
		
		if(age != other.age)
			return false;
		if(name == null){
			if(other.name != null)
				return false;
		}else if(!name.equals(other.name))
			return false;
		return true;
	}
	
}