package com.itpractice;
/*
 * 键盘录入两个数据，并对这两个数据求和，输出其结果
 * 
 * 
 */
import java.util.Scanner;
public class ScannerDemo2 {

	public static void main(String[] args) {
	  System.out.println("请输入第一个数据");
	  Scanner sc = new Scanner(System.in);
	  int a = sc.nextInt();
	  
	  System.out.println("请输入第二个数据");
//	  Scanner rc = new Scanner(System.in);
	  int b = sc.nextInt();
	 
	  
	  System.out.println("这两个数的和是："+(a+b));
	  
	  
	

	}

}
