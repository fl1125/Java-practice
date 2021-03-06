package com.itpractice;
/*
 * 继承中成员变量的特点
 *     子类只能获取父类非私有成员
 *     子父类中成员变量的名字不一样直接获取父类的成员变量
 *     子父类中的成员变量名字是一样的获取的是子类的成员变量	 
 *      
 *     就近原则： 谁进我就用谁
 *            
 *     super()：可以获取父类的成员变量和成员方法，用法和this是相似的。
 *             如果没有局部变量，有子类的成员变量就使用子类的成员变量
 *             如果没有局部变量和子类的成员变量，有父类变量就使用父类的成员变量
 *             如果都没有，就出错了
 *             
 */            
public class ExtendsDemo3 {

	public static void main(String[] args) {
		Kid k = new Kid();
		k.show();
	}

}

class Dad{
	 String name = "jack";
}
class Kid extends Dad {
	 String name = "black";
	 
	 public void show(){
		String name = "dd";
		System.out.println(name);
	 	System.out.println(super.name);
	 	System.out.println(this.name);
	}
}