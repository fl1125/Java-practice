package com.itpractice3;

import java.util.Scanner;

/*
 *   �ж�һ���ַ����Ƿ��ǶԳ��ַ���
 *   ����"abc"���ǶԳ��ַ�����"aba","abba","aaa"�ǶԳ��ַ���
 * 
 * 
 * 
 */
public class StringBuilderTest3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String s = sc.nextLine();
		
		boolean result = Symmetry(s);
		System.out.println("result:"+result);
		
	}
     public static boolean Symmetry(String s){
    	 StringBuilder sb = new StringBuilder(s);
    	 sb.reverse();
    	 String result = sb.toString();
    	 
    	return result.equals(s);
    	 
     }
}
