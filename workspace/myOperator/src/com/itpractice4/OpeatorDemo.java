package com.itpractice4;
/*
 * �߼���������������ӹ�ϵ����ʽ
 *  &��|��^,!
 *  &&,||
 *  
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class OpeatorDemo {

	public static void main(String[] args) {
	    int a = 3;
	    int b = 4;
	    int c = 5;
//	&(��false��flase)
	    System.out.println((a>b) & (a>c));
	    System.out.println((a<b) & (a>c));
	    System.out.println((a>b) & (a<c));
	    System.out.println((a<b) & (a<c));
	    System.out.println("------------------"); 
	    
// |(��true��true)
	    System.out.println((a>b) | (a>c));
	    System.out.println((a<b) | (a>c));
	    System.out.println((a>b) | (a<c));
	    System.out.println((a<b) | (a<c));
	    System.out.println("------------------");
	    
// ^(��ͬ��false ,��ͬ��true)
	    System.out.println((a>b) ^ (a>c));
	    System.out.println((a<b) ^ (a>c));
	    System.out.println((a>b) ^ (a<c));
	    System.out.println((a<b) ^ (a<c));
	    System.out.println("------------------");
	    
//	 !(true��false��false��true)   
	    System.out.println((a>b));
	    System.out.println(!(a>b));
	    System.out.println(!!(a>b));
	    System.out.println("------------------");
	    
	}

}