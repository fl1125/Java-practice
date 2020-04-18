package com.itpractice;

import java.util.ArrayList;

/*
 * 获取元素  public E get(int index):返回指定索引处的元素
 *  
 * 集合元素   public int size()：返回集合中的个数
 * 
 * 删除元素   public boolean remove(Object o):删除指定的元素，返回删除是否成功
 *        public E remove(int index):删除指定索引处的元素，返回被删除的元素
 * 
 * 修改元素  public E set(int index,E element): 修改指定索引处的元素，返回被修改的元素
 * 
 * 
 */
public class ArratListDemo2 {

	public static void main(String[] args) {
		
//		创建集合对象
		  ArrayList<String> array = new ArrayList<String>();

//		  添加元素
		  array.add("hello");
		  array.add("world");
		  array.add("java");
		  System.out.println("array:"+array);
		  System.out.println("--------");
		  
//		  获取元素
//		  System.out.println(array.get(1));;
//		  System.out.println("--------");
//		  
////		集合元素
//		  System.out.println(array.size());
//		  System.out.println("--------");
//		  
////		 删除元素
//		  System.out.println(array.remove("hello"));
//		  System.out.println("array:"+array);
//		  System.out.println("--------");
//		  
//		  System.out.println(array.remove(0));
//		  System.out.println("array:"+array);
//		  System.out.println("--------");
		  
//		  修改元素
		  System.out.println(array.set(1, "go"));
		  System.out.println("array:"+array);
	}

}
