package com.itpractice5;

//  键盘录入两个数据，比较这两个数据是否相等
import java.util.Scanner;
public class OpeatorDemo2 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("请输入第一个数据");
	 int a = sc.nextInt();
	 System.out.println("请输入第二个数据");
	 int b = sc.nextInt();
//比较这两个数据是否相等；
	 boolean flag = (a==b)?true:false;
	 System.out.println("boolean:"+flag);

	}

}	
