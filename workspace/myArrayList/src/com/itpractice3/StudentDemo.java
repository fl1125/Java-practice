package com.itpractice3;

import java.util.ArrayList;
import java.util.Scanner;



/*
 * ����һ�����ϣ��洢ѧ������ѧ�����������ڼ���¼�룬��󣬱������ϡ�
 * 
 */
public class StudentDemo {
	public static void main(String[] args) {

//		��������
		ArrayList<Student> array = new ArrayList<Student>();
		
          
//  ���÷����� ��������
        addStudent(array);
        addStudent(array);
        addStudent(array);
			
        for(int x=0; x<array.size();x++){
        	Student s = array.get(x);
        	System.out.println(s.getName()+"----"+s.getAge());
        }
		
	}
       public static void addStudent(ArrayList<Student> array){
//   		����¼�����,����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
   		Scanner sc = new Scanner(System.in);
           System.out.println("������ѧ������");
           String name = sc.nextLine();
           
           System.out.println("������ѧ������");
           String age = sc.nextLine();
           
           Student s = new Student();
           s.setAge(name);
           s.setAge(age);

//           ��ѧ��������ΪԪ�ش洢��������
             array.add(s);
    	   
       }
}