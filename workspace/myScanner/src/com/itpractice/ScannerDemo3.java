package com.itpractice;
// ����¼���������ݣ�����ȡ�����������е����ֵ

import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {
		
//		��ȡ��������
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();
		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();	
		System.out.println("��������������ݣ�");
		int c = sc.nextInt();

//		�Ƚ��������ݵĴ�С
		int temp = (a>b)?a:b;
		int max = (temp>c)?temp:c;
		System.out.println("max:"+max);
		

	}

}