package com.itpractice;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ѧ������ϵͳ������
 *   ����ѧ����
 *   ѧ������ϵͳ��������Ĵ���
 *   ѧ������ϵͳ�Ĳ鿴����ѧ���Ĵ���
 *   ѧ������ϵͳ������ѧ���Ĵ���
 *   ѧ������ϵͳ��ɾ��ѧ������
 *   ѧ������ϵͳ���޸�ѧ������
 * 
 */
public class StudentManegerTest {

	public static void main(String[] args) {

//		�������϶������ڴ洢ѧ������
		ArrayList<Student> array = new ArrayList<Student>();
		
//		Ϊ���ó���ѭ�� ʹ��while(true)
		while(true){
		System.out.println("--------��ӭ����ѧ��ϵͳ--------");
		System.out.println("1�鿴����ѧ��");
		System.out.println("2����ѧ��");
		System.out.println("3ɾ��ѧ��");
		System.out.println("4�޸�ѧ��");
		System.out.println("5�˳�");
		System.out.println("���������ѡ��");
		
//		���̴���¼�����
		Scanner sc = new Scanner(System.in);
		String choiceString = sc.nextLine();
		
//		��switch���ʵ��ѡ��
		switch(choiceString){

//		�鿴����ѧ��
		case "1":
			findALLStudent(array);
			break;
		//			����ѧ��
		case "2":
		   addStudent(array);
			break;
			
//			ɾ��ѧ��
		case "3":
			deleteStudent(array);
			break;
	
//			�޸�ѧ��
		case "4":
			updateStudent(array);
			break;
	
//		�˳�
		case "5":
		
			
		default:
			System.out.println("лл���ʹ��");
			System.exit(0);  //JVM�˳�
		break;		
        	}
		
    	}
    }
//	����ѧ��
	public static void addStudent(ArrayList<Student> array){
//	   ��������¼����� 
		Scanner sc = new Scanner(System.in);
		String id ;
		while(true){
			System.out.println("������ѧ��ѧ�ţ�");
			id = sc.nextLine();
	//	�ж�ѧ���Ƿ�ռ��
	//		������
			boolean flag = false;
			for(int x=0; x<array.size(); x++){
				Student s = array.get(x);
	//		��ȡ��ѧ����ѧ�źͼ���¼���ѧ�Ž��бȽ�
				if(s.getId().equals(id)){
					flag = true;
					break;
				}
			} 
			  if(flag){
				   System.out.println("�������ѧ���Ѿ���ռ�ã�����������");
			  }else{
			       break; 	  
			  }
		}
		System.out.println("������ѧ��������");
		String name = sc.nextLine();
		System.out.println("������ѧ�����䣺");
		String age = sc.nextLine();
		System.out.println("������ѧ����ַ��");
		String address  = sc.nextLine();
		

//		����ѧ������
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
        
//		��ѧ��������ΪԪ�����ӵ�����
		array.add(s);
		
//		������ʾ
		System.out.println("���ӳɹ�");
	}
	
//	ɾ��ѧ��
	public static void deleteStudent(ArrayList<Student> array){
//����ѧ����ɾ��ѧ������Ϊѧ����Ψһ��
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫɾ����ѧ��ѧ��");
		String id = sc.nextLine();
		
//		��������
		int index = -1; 
		for(int x=0; x<array.size(); x++ ){
			Student s = array.get(x);
			
			if(s.getId().equals(id)){
				index = x;
				
				break;
				
				
			}
			
		}
		if(index == -1){
			System.out.println("��Ҫɾ����ѧ����Ϣ������");
		}else{
			array.remove(index);
			System.out.println("ɾ��ѧ���ɹ�");
		}
		
	}	

//	�޸�ѧ��
	  public static void updateStudent(ArrayList<Student> array){
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("��������Ҫ�޸�ѧ����ѧ��");
		  
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
				  System.out.println("��Ҫɾ����ѧ����Ϣ������");
			  }else{
				  
					   System.out.println("������ѧ��������");
					   String name = sc.nextLine();
					   System.out.println("������ѧ��������");
					   String age = sc.nextLine();
					   System.out.println("������ѧ���µ�ַ");
					   String address = sc.nextLine();
					   
					   Student s = new Student();
					   s.setId(id);
					   s.setName(name);
					   s.setAge(age);
					   s.setAddress(address);
					   
//					   �޸ļ����е�ѧ������
					   array.set(index, s);
					   System.out.println("�޸�ѧ���ɹ�");
			  }
		  }
	  
//	�鿴����ѧ��
	  public static void findALLStudent(ArrayList<Student> array){

//		  �����жϸü������Ƿ��з������ݣ����û�У����Ǹ�����ʾ�����ø÷������ټ���ִ����ȥ
		  if(array.size() == 0){
			  System.out.println("Ŀǰû��ѧ����Ϣ�ɹ���ѯ�����ȥ��������");
			  return;
		  }
		  
//		   \t����һ��TAB����λ��
		   System.out.println("ѧ��\t����\t����\t��ס��");
		   for(int x=0; x<array.size(); x++){
		    	Student s = array.get(x);
		    	System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());;
		    }
	  }

}