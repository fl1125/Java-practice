package com.itpractice3;

import java.util.Scanner;

/*
 *  ���ַ�����ת 
 * 
 */
public class StringBuilderTest2 {

	public static void main(String[] args) {
	  
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String s = sc.nextLine();
	
		String result = reverse(s);
		System.out.println("result:"+result);
	}
	
      public static String reverse(String s){
    	  StringBuilder sb = new StringBuilder(s);
    	  sb.reverse();
    	  String result = sb.toString();
    	  return result;
    	  
      }
}