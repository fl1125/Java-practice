package com.itpractice;
/*
 * 继承： 多个类有共同的成员变量和成员方法，抽取到另一个类中（父类），再让多个类去继承这个类，我们的多个类就可以获取到父类中的成员了
 * extends
 * 
 */
public class ExtendsDemo {
     public static void main(String[] args) {
		DotA d = new DotA();
		d.start();
		
		
		LOL l = new LOL();
		l.start();
	}
}
class Game{
	String name;
	double version;
	String agent;
	
	public void start(){
		System.out.println("启动");
	}
	public void stop(){
		System.out.println("关闭");
	}

}
class DotA extends Game{
	}

class LOL extends Game{
	
}