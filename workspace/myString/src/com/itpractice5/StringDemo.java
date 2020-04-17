package com.itpractice5;

import java.util.Scanner;

/*
 * String类的转换功能：
 * char[] toCharArray():把字符串转换为字符数组
 * String toLowerCase():把字符串转换为小写字符串
 * String toUpperCase():把字符串转换为大写字符串
 * 
 * 字符串的遍历：
 * 		A:length()加上charAt()
 * 		B:把字符串转换为字符数组，然后遍历数组
 */
public class StringDemo {

	public static void main(String[] args) {
       String s = "Hello   ";
       
       char[] chs = s.toCharArray();
       for(int x=0; x<chs.length; x++){
        System.out.println(chs[x]);
        
       
       }
       System.out.println("HelloWorld".toLowerCase());
       
       System.out.println("HelloWorld".toUpperCase());

	}

}
		