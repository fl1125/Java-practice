package com.itpractice;
/*
 * Java中继承的特点：
 *    Java语言只支持单一继承，只能继承一个父类
 *    Java语言支持多层继承
 * 
 * 
 */
public class ExtendsDemo2 {

	public static void main(String[] args) {
	   dota2 d = new dota2();
	   d.update();
	   d.start();
	}

}
 class Game1{
	 public void start(){
		 System.out.println("启动");
	 }
 }
class PCGame extends Game1{
	public void update(){
		System.out.println("PCGame更新了");
	}
}
class MoblieGame extends Game1{
	public void update(){
		System.out.println("MoblieGame");
		
	}
}

class dota2 extends PCGame{
}
