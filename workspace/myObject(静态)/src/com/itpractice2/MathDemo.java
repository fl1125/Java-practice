package com.itpractice2;

public class MathDemo {

	public static void main(String[] args) {
//	Math：包含了一些基本的数学运算方法
//		static double PI
		System.out.println(Math.PI);
//   static double abs(double a):返回绝对值
		System.out.println(Math.abs(15));
		System.out.println(Math.abs(-10));
//		static double ceil(double a)
		System.out.println(Math.ceil(1.6));
		System.out.println(Math.ceil(1.2));
//		static double floor(double a)
		System.out.println(Math.floor(1.6));
		System.out.println(Math.floor(1.2));
//		static double pow(double a, double b):返回第一个参数的第二个参数次幂
		System.out.println(Math.pow(2, 3));
	}

}
