package com.itpractice2;
 /*
  * ��ֵ�������
  *    �����ĸ�ֵ�������=
  *    ��չ�ĸ�ֵ�������+=��-=��*=��/=,.....
  * 
  * 
  * 
  * 
  * 
  */
public class OperatorDemo {

	public static void main(String[] args) {
	int a = 10;  

//	+=�Ĳ���(��+=����ߺ��ұߵ�������+��Ȼ������ֵ�����)
	a += 20;
	System.out.println("a��"+a);

//	ע�⣺��չ�ĸ�ֵ�������������ǿ������ת��
//	��һ������a,a+=10,�൱��a=(a����������)(a+10)
	short s = 1;
	s += 1; 
	System.out.println(s);

	}
	

}
