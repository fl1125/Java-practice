package com.topractice;

import java.util.Scanner;

/*
 *   键盘录入5个int类型的数据存储数组arr中
 *   定义方法将arr数组中的内容反转
 *   定义方法对反转后的数组进行遍历
 * 
 * 
 * 
 * 
 * 
 */
public class Test6 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//    定义数组
        int[] arr= new int[5];
        
          for(int x=0; x<arr.length; x++){
    	    System.out.println("请输入"+(x+1)+"个数据");
            int a = sc.nextInt();
           	arr[x] = a;
        } 
          printArray(arr);
	      reverse(arr);
          printArray(arr);
    
	}
//	遍历数组
	 public static void printArray(int[] arr){
		 System.out.print("[");
		 for(int x=0; x<arr.length;x++){
		    if(x==arr.length-1){
		    	System.out.println(arr[x]+"]");
		    }else{
		    	System.out.print(arr[x]+", ");
		    }
		 }
	 }
	
//	反转数组
    public static void reverse(int[] arr){
  	  for(int start=0, end=arr.length-1; start<=end; start++,end--){
  		  int temp = arr[start];
  		  arr[start] = arr[end];
  		  arr[end] = temp;
  	  }
    }


}
