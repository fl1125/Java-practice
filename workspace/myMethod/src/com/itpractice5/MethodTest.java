package com.itpractice5;
/*
    把遍历数组改进为方法实现，并调用方法
 
*/
public class MethodTest {

	public static void main(String[] args) {
		int[] arr={11,22,33,44,55};
		printArray(arr);
		
		
        /*for(int x=0; x<arr.length; x++){
        	System.out.println(arr[x]);
        }*/
	}
    /*public static void printArray(int[] arr){
    	for(int x=0; x<arr.length; x++){
        	System.out.println(arr[x]);
        }
  
    }*/
	public static void printArray(int[] arr){
         System.out.print("["); 
		for(int x=0; x<arr.length; x++){
			if(x==arr.length-1){
				System.out.println(arr[x]+"]");
			}else{
				System.out.print(arr[x]+", ");
			}
			
        }
  
    }
}
