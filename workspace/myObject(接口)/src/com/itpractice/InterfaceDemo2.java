package com.itpractice;
/*
 *  接口的成员特点：
 *     只能有抽象方法 
 *     只能有常量
 *     默认使用abstract&public修饰方法
 *     默认使用abstract&public修饰方法
 *     默认使用public static final来修饰成员变量
 *     
 *     建议手动给上默认修饰符
 *     
 * 注意：接口不能创建对象（不能实例化）
 *     类与接口的关系是实现关系，一个类实现一个接口必须实现它所有方法
 */
public class InterfaceDemo2 {

	public static void main(String[] args) {

	}

}
interface Animal{
	public final int num = 10;
	
	public abstract void eat();
	
}
class Cat implements Animal {
	@Override
	public void eat() {
		
		
	}
}