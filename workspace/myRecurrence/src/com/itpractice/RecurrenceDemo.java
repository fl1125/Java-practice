package com.itpractice;
/*
 * 需求：求5的阶乘
 * 
 */
public class RecurrenceDemo {

	public static void main(String[] args) {
	    int result = jc(5);
	    System.out.println(result);

	}

	
	public static int jc(int n){
		if(n == 1){
			return 1;
		}
		else{
			return n*jc(n-1);
		}
	}
}
