package com.itpractice;

import java.util.Scanner;

//����¼���������ݣ��Ƚ����������Ƿ����

public class MethodTest2 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("plase give two numbers!");
       int a = sc.nextInt();
       int b = sc.nextInt();
       
       boolean result = equral(a,b);
       
       System.out.println(result);
	}
    public static boolean equral(int a,int b){
    	if(a==b){
    		return true;
    	}else{
		    return false ; 
    	}
    } 
}