package com.itpractice2;

//需求：写一个方法，在控制台输出10次HelloWorld案例
// 如果一个方法没有明确的返回值类型，也不能把返回值的类型空出来，应该写void标志改方法无返回值类型。
//  void修饰的方法调用：
//  printHelloWorld(); (只能单独调用)  
 
public class MethodDemo {

	public static void main(String[] args) {
      	   

 }
	public static void printHelloWorld(){
		for(int x=0;x<10;x++){
			System.out.println("HelloWorld");
		}
	}
}