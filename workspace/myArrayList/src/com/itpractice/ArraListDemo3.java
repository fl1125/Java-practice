package com.itpractice;

import java.util.ArrayList;

/*
 * 
 * ArratList集合的遍历
 * 
 */
public class ArraListDemo3 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("hello");
		array.add("world");
		array.add("java");
		
//		获取元素
		for(int x=0;x<3;x++){
		System.out.println(array.get(x));
		}
//		如何知道集合中元素的个数  
		for(int x=0; x<array.size();x++){
			System.out.println(array.get(x));
		}
//      最标准的用法
		for(int x=0; x<array.size();x++){
		   String s = array.get(x);
		   System.out.println(x);
		}
	}

}
