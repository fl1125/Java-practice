package com.topractice;

/*
 *     有一对兔子，从出生后第三个月期每月都生一对兔子，小兔子长到第三个月后每三个月又生一对兔子。
 *     假如兔子都不死，问第二十个月后兔子对数为对数?
 * 
 * 
 * 
 */



public class Test3 {

	public static void main(String[] args) {
       int[] arr = new int[20];
       
       arr[0]=1;
       arr[1]=1;
       for(int x=2; x<arr.length; x++){
           arr[x] = arr[x-1] + arr[x-2];      
       }
         System.out.println("第二十个月的兔子对数是："+arr[19]);
	}

}
