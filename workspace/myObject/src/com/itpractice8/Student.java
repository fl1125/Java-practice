package com.itpractice8;
/*
 * ���췽����
 *    ����������ݽ��г�ʼ��
 * ��ʽ�� 
 *    ��������������ͬ
 *    û�з���ֵ���ͣ���void������д
 *    û�о���ķ���ֵ
 * 
 * ��Ա������ֵ��
 *   setXxx()����
 *   ���ι��췽��
 * 
 * 
 */
public class Student {
  private String name;
   private int age;
   
   public Student(){
	   
   }
   
   public Student(String name){
	   this.name = name;
   }
   
   public Student(int age){
	   this.age = age;
   }
   
   public Student(String name,int age){
	   this.age = age;
	   this.name = name;
   }
   
   public void show(){
   System.out.println(name+"------"+age);
   }
   /*
   public Student(){
    System.out.println("���ǹ��췽�� ");
   }*/
}
