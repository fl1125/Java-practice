package com.itpractice2;

// 写一个方法，传递一个整数(大于1)，在控制台打印1到该数据的值

public class MthodTest {

	public static void main(String[] args) {
		getvalue(3);

	}
    public static void getvalue(int n){
    	for(int x=1; x<=n; x++){
    		System.out.println(x);
    	}
    	
    }
}
