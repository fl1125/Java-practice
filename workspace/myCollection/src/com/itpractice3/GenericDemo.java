package com.itpractice3;
/*
 * ʹ�ü��ϴ洢�Զ�����󲢱���
 * ���ڼ��Ͽ��Դ洢�������͵Ķ��󣬵����Ǵ洢�˲�ͬ���͵Ķ��󣬾��п�����ת����ʱ���������ת���쳣��
 * ����javaΪ�˽��������⣬�������ṩ��һ�ֻ��ƣ���������
 * 
 * ���ͣ���һ�ֹ㷺�����ͣ�����ȷ�������͵Ĺ�����ǰ���˱���ʱ�ڣ������������ص�
 * ���ͺô���
 * 			����������ת��������
 * 			���Լ��ٻ�ɫ������
 * 			���Լ����Ǵ������д
 * 
 * ʲôʱ�����ʹ�÷��ͣ�
 * 		��API�������ǿ���<E>���Ϳ���ʹ�÷�����
 * 			
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {

	public static void main(String[] args) {
//  �������϶���
		Collection<Student> c = new ArrayList<Student>();
//  ����Ԫ�ض���
		Student s = new Student("jack",12);
		Student s2 = new Student("jacke",14);
//	����Ԫ�ض���
		c.add(s);
		c.add(s2);
		
//	�������϶���
		Iterator<Student> it =  c.iterator();
        while(it.hasNext()){
        	
	}

}
}

class Student{
	String name;
	int age;
	
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
}