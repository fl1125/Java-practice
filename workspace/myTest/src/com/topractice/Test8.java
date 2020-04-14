package com.topractice;

import java.util.Scanner;

/*
 * 键盘录入数据，要求数据是四位的整数，先需要对数据记性加密，加密规则如下；
 * 每位数字加上5，然后除以10的余数代替该数字；
 * 再讲第一位和第四位交换，第二位和第三位交换，
 * 最后把加密后的数据输出到控制台
 * 
 * 
 * 
 * 
 * 
 */
public class Test8 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("请输入一个四位数");
 	  int number  = sc.nextInt();
 	  
 	  int[] arr = new int[4];
      
 	  arr[0] = number/10/10/10%10;
 	  arr[1] = number/10/10%10;
 	  arr[2] = number/10%10;
 	  arr[3] = number%10;
 	  
 	  for(int x=0; x<arr.length;x++){
 		  arr[x] += 5;
 		  arr[x] %= 10;
 	  }
 	   int temp = arr[0];
 	   arr[0] = arr[3];
 	   arr[3] = temp;
 	   
 	   temp = arr[1];
 	   arr[1] = arr[2];
 	   arr[2] = temp;
 	   
 	   for(int x=0; x<arr.length;x++){
 		   System.out.print(arr[x]);
 	   }
	}
   
}

