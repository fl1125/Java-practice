package com.itpractice2;
/* 
 * String ������ַ�����
 * String(String original) ��ʼ��һ���´����� String ����ʹ���ʾһ���������ͬ���ַ����У����仰˵���´������ַ����Ǹò����ַ����ĸ�����
 * String(char[] value) ����һ���µ� String��ʹ���ʾ�ַ���������е�ǰ�������ַ����С�
 *String(char[] value, int offset, int count) 
 */
public class StringDemo {
  public static void main(String[] args) {
	  
//	 ����1 
	String s1 = new String("HELLO");
	System.out.println("s1:"+s1);

//	����2
	char[] chs = {'H','e','l','l','o'};
	String s2 = new String(chs);
	System.out.println("s2:"+s2);
	
//	����3
//	String s3 = new String(chs,0,chs.length);
	String s3 = new String(chs,1,3);
    System.out.println("s3:"+s3);
	
//  ��ʽ4
   String s4  = "Hello";
   System.out.println("s4:"+s4);
	
	
}
}
