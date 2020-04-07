package com.itpractice;
// 键盘录入三个数据，并获取这三个数据中的最大值

import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {
		
//		获取三个数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();	
		System.out.println("请输入第三个数据：");
		int c = sc.nextInt();

//		比较三个数据的大小
		int temp = (a>b)?a:b;
		int max = (temp>c)?temp:c;
		System.out.println("max:"+max);
		

	}

}
