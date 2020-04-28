package com.itpractice6;

import java.util.LinkedList;

/*
 * List的常用子类：
 * 		ArrayList
 * 			底层是数组结构，查询快，增删慢
 * 		LinkedList
 * 			底层结构是链表，查询慢，增删快
 * 
 * 如何选择使用不同的集合？
 * 		如果查询多，增删少，则使用ArrayList
 * 		如果查询少，增删多，则使用LinkedList
 * 		如果你不知道使用什么，则使用ArrayList
 * 
 * LinkedList的特有功能：
 * 			void addFirst(E e)  
 * 			void addLast(E e) 
 			E getFirst()  
 			E getLast()  
 			E removeFirst() 
 			E removeLast() 
 * 				
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("hello");
		list.add("world");
		list.add("java");

		list.addFirst("sql");
		list.addLast("001");
		list.getFirst();
		list.getLast();
	
		System.out.println(list);
	}

}
