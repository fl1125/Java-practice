package com.itpractice;

import java.util.Scanner;

//键盘录入两个数据，返回两个数中的较大值

public class MethodTest {

	public static void main(String[] args){
	   System.out.println("plase give two numbers!");
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
		
       int result = max(a,b);
       
       System.out.println(result);
	}
    
	
	public static int max(int a,int b){
		
		
		if(a>b){
			return a ;
		}else{
			return b;
		}
		
		
	}
}
