package com.itpractice;
/*
 *   ����ͷ����ĵ���
 *       ��ͷ����ĵ��� 
 * ����¼�����ݵ���ο�ִ������    
 * 
 * 
 * ��Ҫ�������õ�ִ�����̣���ô�����õķ���ҲҪ�Ӷϵ�
 * 
 */

import java.util.Scanner;

public class DebugTest2 {

	public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     
     System.out.println("�������һ����");
     int a = sc.nextInt();
     System.out.println("������ڶ�����");
     int b = sc.nextInt();
     int c = sum(a,b);
     
     System.out.println("sum:"+c);

	}
     public static int sum(int a,int b){
    	 int c = a+b;
    	 return c;
     }
}