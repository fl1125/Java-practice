package com.itpractice4;

import java.util.Scanner;

/*
 * 统计一个字符串中大小写字符，小写字母字符，数字字符出现的次数
 * 
 * 
 */
public class StringTest {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("请输入一个字符串数据");
	   String s = sc.nextLine();
	   
//	   定义三个统计变量，初始化值都为0
	   int bigCount = 0;
	   int smallCount = 0;
	   int numberCount = 0;
	   
//	   遍历字符串，得到每一个字符
	    for(int x=0; x<s.length(); x++){
	    	char ch =s.charAt(x); 
	    	
//	    拿字符串判断
	    	if(ch>='A' && ch<='Z'){
	    		bigCount++;
	    	} else if(ch>='a' && ch<='z'){
	    		smallCount++;
	    	}else if(ch>='0' && ch<='9'){
	    		numberCount++;
	    	}
	    }
		  System.out.println("大写字母数："+bigCount);
		  System.out.println("小写字母数："+smallCount);
		  System.out.println("数字字符数："+numberCount);
	}

}
