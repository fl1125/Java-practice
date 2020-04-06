package com.itpractice4;
/*
 * 逻辑运算符：用于连接关系表达式
 *  &，|，^,!
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
//	&(有false则flase)
	    System.out.println((a>b) & (a>c));
	    System.out.println((a<b) & (a>c));
	    System.out.println((a>b) & (a<c));
	    System.out.println((a<b) & (a<c));
	    System.out.println("------------------"); 
	    
// |(有true则true)
	    System.out.println((a>b) | (a>c));
	    System.out.println((a<b) | (a>c));
	    System.out.println((a>b) | (a<c));
	    System.out.println((a<b) | (a<c));
	    System.out.println("------------------");
	    
// ^(相同则false ,不同则true)
	    System.out.println((a>b) ^ (a>c));
	    System.out.println((a<b) ^ (a>c));
	    System.out.println((a>b) ^ (a<c));
	    System.out.println((a<b) ^ (a<c));
	    System.out.println("------------------");
	    
//	 !(true则false，false则true)   
	    System.out.println((a>b));
	    System.out.println(!(a>b));
	    System.out.println(!!(a>b));
	    System.out.println("------------------");
	    
	}

}
