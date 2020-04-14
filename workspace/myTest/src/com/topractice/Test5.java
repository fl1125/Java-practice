 package com.topractice;

import java.util.Scanner;

/*
 *   需求：在编程竞赛中，有6个评委为参赛的选手打分，分数0-100的整数分。
 *        选手的最后为：去掉一个最高分和一个最低分后的4个评委平均值。
 *        请写代码。(不考虑小数部分)
 * 
 * 
 * 
 * 
 */
public class Test5 {

	public static void main(String[] args) {
	
		int arr[] = new int[6];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请六位裁判依次输入成绩(0-100分)");
		for(int x=0 ; x<arr.length; x++){
			int score = sc.nextInt();
			arr[x] = score;
			
			
		}
		
		int max = getmax(arr);
		int min = getmin(arr);
		int sum = getsum(arr);
		int average =0 ;
		average = (sum - max - min)/arr.length -2;
		System.out.println("该选手的平均分是："+average);
	}
       public static int getsum(int arr[]){
    	   int sum = 0 ;
    	   for(int x = 0; x<arr.length; x++){
    		   sum += arr[x];
    	   }
    	
    	   return sum;
       } 	
       
       
       public static int getmax(int arr[]){
           int max = arr[0];  
    	   for(int x=1; x<arr.length;x++)
              if(arr[x] > max){
            	  max = arr[x];
              }
    	   return max;
       }
    	   public static int getmin(int arr[]){
               int min = arr[0];  
        	   for(int x=1; x<arr.length;x++)
                  if(arr[x] < min){
                	  min = arr[x];
                  }
        	   return min;
       }
       
      
       

}
