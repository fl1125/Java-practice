package com.itpractice7;

import java.util.Scanner;

/*
 * 字符串反转
 * 举例：键盘录入”abc”		
 * 输出结果：”cba”
 * 
 * 分析：
 * 		A:键盘录入一个字符串
 * 		B:写方法实现字符串的反转
 * 			a:把字符串倒着遍历，得到的每一个字符拼接成字符串。
 * 			b:把字符串转换为字符数组，然后对字符数组进行反转，最后在把字符数组转换为字符串
 * 		C:调用方法
 * 		D:输出结果
 */
public class StringTest2 {
//把字符串倒着遍历，得到的每一个字符拼接成字符串。
/*	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("请输入一个字符串");
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
//	把字符串转换为字符数组，然后对字符数组进行反转，最后在把字符数组转换为字符串
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("请输入一个字符串");
		 String s = sc.nextLine();
         

		
	}
	public static  String trunArray(String s){
//		 转化数组
		 char[] chs = s.toCharArray();
//   对字符数组进行反转      
		 for(int start=0, end=chs.length; start<=end;start++,end--){
			 char temp = chs[start];
			 chs[start] = chs[end];
			 chs[end ] = temp;
		 }
//		 最后把字符数组转化为字符串
		 String ss= new String(chs);
		 return ss;
	}
}
