package com.itpractice;
/*
 * 类与类:继承关系，单一继承，多层继承
 * 类与接口：实现关系，多实现，
 * 接口与接口的关系：继承关系，多继承
 * 
 * 
 */
public class InterfaceDemo3 {

	public static void main(String[] args) {
	

	}

}
interface InterA extends InterB{
	public abstract void method();
}
interface InterB{
	public abstract void function();	
}
interface InterC extends InterA{
	
}
class Demo implements InterA{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void function() {
		// TODO Auto-generated method stub
		
	}
	
}