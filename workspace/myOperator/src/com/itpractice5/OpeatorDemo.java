package com.itpractice5;
/*
 * 三元运算符： 关系表达式？表达式1：表达式2
 * 
 * 试行流程： 
 *    1.计算关系表达式的值，看true还是false
 *    2.如果是true，表达式1就是结果
 *      如果是false，表达式2就是结果
 * 
 * 
 * 
 * 
 */
public class OpeatorDemo {

	public static void main(String[] args) {
	   int a = 10;
	   int b = 20;
	   
	   int c = (a>b)?a:b;
	   System.out.println("c:"+c);

	}

}
