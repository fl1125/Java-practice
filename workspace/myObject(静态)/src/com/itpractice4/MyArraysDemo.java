package com.itpractice4;

public class MyArraysDemo {

	public static void main(String[] args) {
		int[] arr ={1,5,8};
	    int max = MyArrays.getMax(arr);
         System.out.println(max);
         
       int a = MyArrays.getIndex(arr, 8);
       System.out.println(a);
	}

}
