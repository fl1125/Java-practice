package com.itpractice;
/*
 * ��������û�����ֵĶ���
 *   Ӧ�ó���:������֮����һ�ε�ʱ�����ʹ����������
 *         ���Ե����������д��ݣ������޷��ڴ���֮ǰ������������
 * 
 */
public class AnonymousObjectDemo {

	public static void main(String[] args) {
//      Student s  = new Student();
//      s.study();
       
		new Student().study();
//  ���������� û�б������õĶ���
	}

}
class Student{
	String name;
	int age;
	
	public void study(){
		System.out.println("good");
	}
}