package com.itpractice7;

import java.util.Scanner;

/*
 * �ַ�����ת
 * ����������¼�롱abc��		
 * ����������cba��
 * 
 * ������
 * 		A:����¼��һ���ַ���
 * 		B:д����ʵ���ַ����ķ�ת
 * 			a:���ַ������ű������õ���ÿһ���ַ�ƴ�ӳ��ַ�����
 * 			b:���ַ���ת��Ϊ�ַ����飬Ȼ����ַ�������з�ת������ڰ��ַ�����ת��Ϊ�ַ���
 * 		C:���÷���
 * 		D:������
 */
public class StringTest2 {
//���ַ������ű������õ���ÿһ���ַ�ƴ�ӳ��ַ�����
/*	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("������һ���ַ���");
		 String s = sc.nextLine();

		 String result = trunArray(s);
		 System.out.println(result);
	}
   
	public static String trunArray(String s){
	   String ss ="";
	   
	   for(int x=s.length()-1; x>=0; x--){
		 ss +=  s.charAt(x);
	   }
	   return ss;
   }*/
//	���ַ���ת��Ϊ�ַ����飬Ȼ����ַ�������з�ת������ڰ��ַ�����ת��Ϊ�ַ���
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("������һ���ַ���");
		 String s = sc.nextLine();
         

		
	}
	public static  String trunArray(String s){
//		 ת������
		 char[] chs = s.toCharArray();
//   ���ַ�������з�ת      
		 for(int start=0, end=chs.length; start<=end;start++,end--){
			 char temp = chs[start];
			 chs[start] = chs[end];
			 chs[end ] = temp;
		 }
//		 �����ַ�����ת��Ϊ�ַ���
		 String ss= new String(chs);
		 return ss;
	}
}