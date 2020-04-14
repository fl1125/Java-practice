package com.topractice;

import java.util.Scanner;

/*
 *  数组元素查找(查找指定元素第一次在数组中出先的索引)
 *  给定数组int[] arr = {5,7,3,2,5};
 *  要查询的元素通过键盘录入的方式确定
 *  定义一个查找数组元素第一此出现位置的方法(要查找的元素就是键盘录入的数据)
 *    
 * 
 * 
 * 
 * 
 */
public class Test7 {

	public static void main(String[] args) {
	    int[] arr = {5,7,3,2,5};
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("请输入要查找的元素");
	    int number = sc.nextInt();
	    
		int Location = getLocation(arr, number);
		System.out.println("Location:"+Location);
	    
	}
	public static int getLocation(int arr[],int value){
		for(int x=0; x<arr.length; x++){
			if(arr[x] == value){
				return x;
			}
		}
		   return -1;
	   }
}
