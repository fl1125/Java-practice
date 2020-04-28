package com.itpractice;
/*
 * Java语言的继承是单一的，一个父类只能有一个父类
 * Java语言给我们提供了一种机制，用于处理继承单一的局限性的，接口
 * 
 * 接口：接口是一个比抽象类还抽象的类，接口里所有的方法全是抽象方法,接口和类的关系是实现，implements
 * 
 * interface	
 * 格式： 
 *   interface 接口名{
 *   }
 */


public class InterfaceDemo {
	public static void main(String[] args) {
		BillGates  gates = new BillGates();
		gates.code();
		 
	}
	}

class Porgrammer{
	public void code(){
		System.out.println("coding");
	}
}

class BillGates extends Porgrammer{
	
}