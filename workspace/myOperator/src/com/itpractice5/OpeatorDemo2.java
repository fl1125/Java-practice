package com.itpractice5;

//  ����¼���������ݣ��Ƚ������������Ƿ����
import java.util.Scanner;
public class OpeatorDemo2 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("�������һ������");
	 int a = sc.nextInt();
	 System.out.println("������ڶ�������");
	 int b = sc.nextInt();
//�Ƚ������������Ƿ���ȣ�
	 boolean flag = (a==b)?true:false;
	 System.out.println("boolean:"+flag);

	}

}	
