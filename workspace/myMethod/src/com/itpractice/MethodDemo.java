package com.itpractice;
/*  
 *  方法：其实就是完成特定功能的代码块
 *    定义格式：
 *       修饰符 返回值类型 方法名(参数类型 参数名1，参数名2...){
 *           方法体；
 *           return 返回值； }
 *     修饰符：public static
 *     返回值类型：用于限定返回值的数据类型
 *     方法名：用于方便我们调用方法的名字
 *     参数类型：用于限定调用方法是传入数据的类型
 *     参数名： 用于接受调用方法是传入数据的类型
 *     方法体：完成功能的代码
 *     retrun:结束方法，并且把返回值带给调用者
 */
public class MethodDemo {

	public static void main(String[] args) {
//	   方法的调用
//单独调用            sum(10,20);
//输入调用  	System.out.println(sum(10,20)); 
//赋值调用
		int result = sum(10,20);
		System.out.println(result);
	}
     public static int sum(int a, int b){
    	  int c = a + b;
    	  return c;
      } 
}
