package com.itpractice;
/*
 *   看求和方法的调用
 *       求和方法的调用 
 * 带有录入数据的如何看执行流程    
 * 
 * 
 * 想要看被调用的执行流程，那么被调用的方法也要加断点
 * 
 */

import java.util.Scanner;

public class DebugTest2 {

	public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     
     System.out.println("请输入第一个数");
     int a = sc.nextInt();
     System.out.println("请输入第二个数");
     int b = sc.nextInt();
     int c = sum(a,b);
     
     System.out.println("sum:"+c);

	}
     public static int sum(int a,int b){
    	 int c = a+b;
    	 return c;
     }
}
