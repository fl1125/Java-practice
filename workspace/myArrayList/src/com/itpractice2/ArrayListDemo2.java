package com.itpractice2;

import java.util.ArrayList;

import com.sun.xml.internal.fastinfoset.util.StringArray;

/*
 * 给定一个字符串数组：{"张三丰"，"宋远桥"，"张无忌"，"殷梨亭"，"张翠山"，"莫声谷"}，
 * 将数组中的元素添加到集合中，比把所有姓张的人员打印到控制台上。
 * 
 * 
 * 
 * 
 */
public class ArrayListDemo2 {

	public static void main(String[] args) {
//       定义字符串数组   
		String[] strArray = {"张三丰","宋远桥","张无忌","殷梨亭","张翠山","莫声谷"};
		
//		创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		
//		遍历字符串对象，获取到每一个字符
		for(int x=0; x<strArray.length; x++){
	        array.add(strArray[x]);	
		}    
//	        遍历集合
	        for(int c=0; c<array.size(); c++){
	        	String s = array.get(c);
	        	
	        	if(s.startsWith("张")){
	        		System.out.println(s);
	        	}
	        	
	        }
		
		
	}

}
