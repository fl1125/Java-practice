package com.itpractice5;

import java.util.Scanner;

/*
 * ����¼��һ���ַ������Ѹ��ַ���������ĸת�ɴ�д������ΪСд��
 * 
 */
public class StringTest {

	public static void main(String[] args) {
	  
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String s = sc.nextLine();

//   ��ȡ����ĸ		
		String s1 = s.substring(0,1);
		
//	 ��ȡ��������ĸ������ַ���
		String s2 = s.substring(1);

//		ת��ָ����ʽ
		String s3 = s1.toUpperCase()+s2.toLowerCase();
		System.out.println(s3);
	}

}