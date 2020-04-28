package com.itpractice;

import java.io.FileWriter;

public class ExceptionDemo2 {
	public static void main(String[] args) throws Exception {
		//method();
		
		function();
		
	}
	
	public static void function() throws Exception {
		FileWriter fw = new FileWriter("a.txt");
	}

	private static void method() {
		try {
			System.out.println(1);
			//System.out.println(2 / 0);
			System.out.println(2);
		} catch(ArithmeticException ae) {
			System.out.println("除数不能为0");
		}
		
		System.out.println(3);
	}

}
