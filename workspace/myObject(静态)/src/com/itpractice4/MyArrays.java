package com.itpractice4;

public class MyArrays {
	private MyArrays(){}
	
//	返回数组中的最大元素
	public static int getMax(int[] arr){
		int max = 0;
		for(int x=0;x<arr.length;x++){
			if(arr[x] >max){
				max = arr[x];
			}
		}
		 return max;
	}

//	返回数组中指定参数的索引
	
	public static int getIndex(int[] arr,int a){
		for(int x=0; x<arr.length;x++){
			if(arr[x] == a){
				return x;
			}
		}
        return -1;
	}
	
	
}
