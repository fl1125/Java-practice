package com.itpractice;

import java.util.Scanner;

//public String nextLine() 获取键盘录入的字符对象

public class ScannerDemo {
  public static void main(String[] args) {
	
	  Scanner sc  = new Scanner(System.in);
	  
	  System.out.println("请输入一个字符串数据");
      String s = sc.nextLine();
      System.out.println(s);
} 
}
