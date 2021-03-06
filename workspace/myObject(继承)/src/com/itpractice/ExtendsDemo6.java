package com.itpractice;
/*
 * 继承中构造方法的执行顺序
 *    在有子父类继承关系的类中，创建子类的对对象，调用子类的构造方法时，
 *    若果子类构造方法的第一行代码没有调用父类的构造方法，则会默认的调用父类的无参构造。
 *   可以使用super()在子类构造方法的第一行中调用父类的构造方法
 */
public class ExtendsDemo6 {

	public static void main(String[] args) {
//	  Die d= new Die();
	   Zi z = new Zi();
	}

}

class Die{
	 public Die(){
		 System.out.println("我是父类无参构造");
	 }
	 public Die(int num){
		 System.out.println("我是父类有参构造");
	 }
}
class Zi extends Die{
	public Zi(){
//		super(1);
		this(1);
		System.out.println("我是子类无参构造");
	}
	public Zi(int num){
		System.out.println("我是子类有参构造");
	}
}