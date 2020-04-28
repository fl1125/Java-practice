package com.itpractice;
/*
 * 继承中成员方法的特点
 *   方法的重写：在子父类中，子类的方法和父类的完全一样，子类重写了父类的方法（覆盖），当子类重写了父类的方法时，使用子类对象调用的就是重写过后子类的方法
 *   方法的重载：在一个类中，有多个重名的方法，但是其参数不一样(参数的个数，参数的类型，参数的顺序)。和返回值无关
 */
public class ExtendsDemo4 {

	public static void main(String[] args) {
	  Kid1 k1 = new Kid1();
	  k1.eat();

	}
}
  class Dad1{
	  public void eat(){
		  System.out.println("喝酒");
		  System.out.println("睡觉"); 
	  }
  }
   class Kid1 extends Dad1{
	   public void eat(){
		   System.out.println("好好吃饭");
	   }
   }