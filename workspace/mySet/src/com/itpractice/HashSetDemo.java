package com.itpractice;

import java.text.Format;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.sun.beans.editors.IntegerEditor;

/*
 * ʹ��ashSet�洢�ַ���������  
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
//	    ��ǿfor
        for(String s : set){
        	System.out.println(s);
        }
        
	}

	private static void method2(Set<String> set) {
		//	    ������
		         Iterator<String >it = set.iterator();
		         while(it.hasNext()){
		        	 String s= it.next();
		         }
	}

	private static void method(Set<String> set) {
		//		ת�������
		    Object[] objs = set.toArray();
		    for (int i = 0; i < objs.length; i++) {
				System.out.println(objs[i]);
			}
	}

}
