package com.itpractice5;

import java.util.Scanner;

/*
 * 键盘录入一个字符串，把该字符串的首字母转成大写，其余为小写。
 * 
 */
public class StringTest {

	public static void main(String[] args) {
	  
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String s = sc.nextLine();

//   截取首字母		
		String s1 = s.substring(0,1);
		
//	 截取除了首字母以外的字符串
		String s2 = s.substring(1);

//		转化指定格式
		String s3 = s1.toUpperCase()+s2.toLowerCase();
		System.out.println(s3);
	}

}
