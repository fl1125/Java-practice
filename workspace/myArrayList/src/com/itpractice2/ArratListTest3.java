package com.itpractice2;

import java.util.ArrayList;

/*
 *   �洢�Զ�����󲢱���
 * 
 * 
 */
public class ArratListTest3 {

	public static void main(String[] args) {
	       
//		�������϶���
		   ArrayList<Student> array = new ArrayList<Student>();
	         
//		   ����ѧ������
	         Student s1 = new Student("����ϼ",28);
	         Student s2 = new Student("��",55);
	         Student s3 = new Student("��",45);
	         Student s4 = new Student("��",15);
	         
//	         ��ѧ��������ΪԪ�����ӵ�������
	      array.add(s1);
	      array.add(s2);
	      array.add(s3);
	      array.add(s4);
	      
//	      ��������
	      for(int x=0; x<array.size();x++){
	    	   Student s = array.get(x);
	    	   System.out.println(s.getName()+s.getAge());
	      }
	}

}