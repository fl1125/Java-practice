package com.itpractice;
/*
 * �̳��г�Ա�������ص�
 *   ��������д�����Ӹ����У�����ķ����͸������ȫһ����������д�˸���ķ��������ǣ�����������д�˸���ķ���ʱ��ʹ�����������õľ�����д��������ķ���
 *   ���������أ���һ�����У��ж�������ķ����������������һ��(�����ĸ��������������ͣ�������˳��)���ͷ���ֵ�޹�
 */
public class ExtendsDemo4 {

	public static void main(String[] args) {
	  Kid1 k1 = new Kid1();
	  k1.eat();

	}
}
  class Dad1{
	  public void eat(){
		  System.out.println("�Ⱦ�");
		  System.out.println("˯��"); 
	  }
  }
   class Kid1 extends Dad1{
	   public void eat(){
		   System.out.println("�úóԷ�");
	   }
   }