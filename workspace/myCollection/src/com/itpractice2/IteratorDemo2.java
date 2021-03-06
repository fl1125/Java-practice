package com.itpractice2;
/*
 * 需求：判断集合中是否包含元素java，如果有则添加元素android
 * Exception in thread "main" java.util.ConcurrentModificationException:并发修改异常
 * 迭代器是依赖于集合的，相当于集合的一个副本，当迭代器在操作的时候，如果发现和集合不一样，则抛出异常
 * 
 * 解决方案:
 * 		你就别使用迭代器
 * 		在使用迭代器进行遍历的时候使用迭代器来进行修改
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo2 {
       public static void main(String[] args) {
	
           List c = new ArrayList();
           c.add("java");
           c.add("hello");
           c.add("world");
           
        ListIterator lit = c.listIterator();
        while(lit.hasNext()){
        	String s= (String)lit.next();
        	if(s.equals("java")){
        	lit.add("android");
        	}
        }
        
        System.out.println(c);
//    	   method();
}

	private static void method() {
		Collection c = new ArrayList();
           c.add("java");
           c.add("hello");
           c.add("world");
           
          if(c.contains("java")){
        	  c.add("android");
        	  
          }
          System.out.println(c);
	}     
	

}
