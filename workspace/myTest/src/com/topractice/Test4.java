package com.topractice;
/*
 * 定义一个int类型的一维数组，内容分为{171,72,19,16,118,51,210,7,18}
 *   求出该数组满足要求的元素和：求和元素的个位数和十位数不能包含7，并且只能为偶数
 *   
 * 
 * 
 * 
 * 
 * 
 */
public class Test4 {

	public static void main(String[] args) {
	   int[] arr={171,72,19,16,118,51,210,7,18};	
	   int sum = 0;
	   for(int x=0; x<arr.length; x++){
			  int ge = arr[x]%10;
			  int qian = arr[x]/10%10;
			 
			  if((ge != 7) && (qian != 7) && (arr[x]%2 == 0)){
				 
				  sum += arr[x];
				  
			  }
		}
		System.out.println("sum:"+sum);   
	}
	

}
