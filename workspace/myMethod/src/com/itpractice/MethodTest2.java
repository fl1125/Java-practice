package com.itpractice;

import java.util.Scanner;

//键盘录入两个数据，比较两个数据是否相等

public class MethodTest2 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("plase give two numbers!");
       int a = sc.nextInt();
       int b = sc.nextInt();
       
       boolean result = equral(a,b);
       
       System.out.println(result);
	}
    public static boolean equral(int a,int b){
    	if(a==b){
    		return true;
    	}else{
		    return false ; 
    	}
    } 
}
