package com.itpractice;

import java.text.Format;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.sun.beans.editors.IntegerEditor;

/*
 * 使用ashSet存储字符串并遍历  
 * 
 */
public class HashSetDemo {

	public static void main(String[] args) {
	  
//		HashSet<String> hs = new HashSet<String>();
//		
		Set<String> set = new HashSet<String>();

		set.add("java");
		set.add("hello");
		set.add("world");
       
		method(set);
        method2(set);
//	    增强for
        for(String s : set){
        	System.out.println(s);
        }
        
	}

	private static void method2(Set<String> set) {
		//	    迭代器
		         Iterator<String >it = set.iterator();
		         while(it.hasNext()){
		        	 String s= it.next();
		         }
	}

	private static void method(Set<String> set) {
		//		转数组遍历
		    Object[] objs = set.toArray();
		    for (int i = 0; i < objs.length; i++) {
				System.out.println(objs[i]);
			}
	}

}
