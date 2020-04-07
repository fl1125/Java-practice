package com.itpractice;
/*
 * 
 *  使用JKD提供的Scanner实现键盘录入数据
 *    1.导包
 *      import java.util.Scanner
 *      在一个类顺序中：package>import>class
 *     
 *   2.创建键盘录入对象
 *     Scanner sc = new Scanner(System.in);
 *   
 *   3.接受数据
 *    int i = sc.nextInt();
 * 
 */
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数据");
		int i = sc.nextInt();
		System.out.println();
	
		

	}

}
