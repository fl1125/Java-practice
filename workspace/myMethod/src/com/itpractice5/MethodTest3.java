package com.itpractice5;
/*
 *   写一个方法，用于对数组进行求和，并调用方法
 * 
 * 
 
 * 
 */


public class MethodTest3 {

	public static void main(String[] args) {
		int[] arr ={1,2,3,4};
		int sum = sum(arr);
		System.out.println("sum:"+sum);
	}

	public static int sum(int arr[]){
         int sum = 0;
		
		for(int x=0; x<arr.length; x++){
		 sum += arr[x];
		}
          return sum;
	}
}
