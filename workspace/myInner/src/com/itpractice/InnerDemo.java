package com.itpractice;
/*
 * 
 * n
 */
public class InnerDemo {

	public static void main(String[] args) {
	  Outer.Inner i = new Outer().new Inner();
	  i.function();

	}

}

class Outer{
	private int num = 10;
	
	public void method(){
		Inner i = new Inner();
		i.function();
	}
	
	class Inner{
		public void function(){
			System.out.println("function");
			System.out.println(num);
		}
	}
}