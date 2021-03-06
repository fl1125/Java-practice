package com.itpractice;
/*
 * this 和super的区别
 *  this: 当前对象的引用
 *        调用子类的成员变量
 *        调用子类的成员方法
 *        在子类的构造方法调用子类其他方法
 *  super：子类对象的父类引用
 *        调用的父类的成员变量
 *        调用父类的成员方法
 *        在子类的构造方法第一行调用父类的构造方法 
 * 
 */
public class ExtendsDemo7 {

	public static void main(String[] args) {
    Zi0 z0 = new Zi0();
    z0.function();

	}
}
  class Die0{
	  int num = 10;
	  
	  public Die0(){
		  this(1);
		  System.out.println("我是父类无参构造");
	  }
	  
	  public Die0(int num){
		  System.out.println("我是父类有参构造");
	  }
	  
	  public void method(){
		  System.out.println("我是父类的方法");
	  }
   }
  class Zi0 extends Die0{
		int num = 30 ;
		
		public Zi0(){
			System.out.println("我是子类无参构造");
		}
		public Zi0(int num){
			System.out.println("我是子类有参构造");
		}
		public void method(){
			System.out.println("我是子类的方法");
		}
		public void function(){
//			this.num = 50;
//			System.out.println(num);
			this.method();
		}
	}

