package com.itpractice2;
//  键盘录入两个数据，获取这两个数据的较大值
import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  //快捷键导入包(ctrl+shift+o)
	  System.out.println("请输入第一个数");
	  int a = sc.nextInt();
	  System.out.println("请输入第二个数");
	  int b = sc.nextInt();
	  
	  if(a>b){
		  System.out.println("这两个数中较大的是："+a);
	  }
	  else{
		  System.out.println("这两个数中较大的是："+b);
	  }
	}

}
