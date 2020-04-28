package com.itpractice;
/*
 *  成员内部的修饰符：
 *     我们可以使用权限修饰符修饰成团内部类，但是如果使用私有来修饰，则在其他类中无法访问
 *     我们可以使用static修饰成员内部类，这样就不用创建外部类了 
 * 
 * 
 * 
 */
import com.itpractice.Outer.Inner;

public class InnerDemo2 {

	public static void main(String[] args) {
	Outer2.Inner2 i = new Outer2.Inner2();
	i.function();
	
	Outer2.Inner2.function();

	}

}


class Outer2{
    public void method(){
    	 Inner2 i = new Inner2();
    }	
    
    static class Inner2{
      
    	 public static void function(){
	         System.out.println("function");
	   
      }
    } 
}


