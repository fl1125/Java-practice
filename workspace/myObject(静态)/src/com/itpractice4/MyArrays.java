package com.itpractice4;

public class MyArrays {
	private MyArrays(){}
	
//	���������е����Ԫ��
	public static int getMax(int[] arr){
		int max = 0;
		for(int x=0;x<arr.length;x++){
			if(arr[x] >max){
				max = arr[x];
			}
		}
		 return max;
	}

//	����������ָ������������
	
	public static int getIndex(int[] arr,int a){
		for(int x=0; x<arr.length;x++){
			if(arr[x] == a){
				return x;
			}
		}
        return -1;
	}
	
	
}
