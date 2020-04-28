package com.itpractice;
/*
 * boolean equals(Object obj)  
 * 		ʹ��==���Ƚ����������Ƿ���ȣ���Ƚϵ�ֵַ�Ƿ����
 */
public class ObjectDemo2 {

	public static void main(String[] args) {
	  Person0 p = new Person0("jack", 18);
	  Person0 p2 = new Person0("jack", 18);
	  
	  boolean flag  = p.equals(p2);
	  System.out.println(flag);
	}

}
//����һ��Person��
class Person0{
	String name;
	int age;
	
	public Person0(String name,int age){
		this.age = age;
		this.name = name;
		
				
	}
//	��дequals����
	@Override
	public boolean equals(Object obj){
//		���Ч��
		if(this == obj)
			return true;
		
		if(obj == null)
			return false;
		
//		��߽�׳��
		if(getClass() != obj.getClass())
			return false;
		
//		����ת��
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