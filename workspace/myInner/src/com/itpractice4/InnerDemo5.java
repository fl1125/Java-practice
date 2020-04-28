package com.itpractice4;
/*
 * 匿名内部类的应用场景：
 *    作为参数进行传递
 * 
 * 
 */
public class InnerDemo5 {

	public static void main(String[] args) {
//	
//		method(new Dog());
//		method(new Cat());
		
		
		
		method(new Animal() {
			
			@Override
			public void eat() {
				System.out.println("fishing");
			}
		});
	}
   public static void method(Animal a){
	   a.eat(); 
   }
}
