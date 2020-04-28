package com.itpractice6;

import java.util.LinkedList;

/*
 * List�ĳ������ࣺ
 * 		ArrayList
 * 			�ײ�������ṹ����ѯ�죬��ɾ��
 * 		LinkedList
 * 			�ײ�ṹ��������ѯ������ɾ��
 * 
 * ���ѡ��ʹ�ò�ͬ�ļ��ϣ�
 * 		�����ѯ�࣬��ɾ�٣���ʹ��ArrayList
 * 		�����ѯ�٣���ɾ�࣬��ʹ��LinkedList
 * 		����㲻֪��ʹ��ʲô����ʹ��ArrayList
 * 
 * LinkedList�����й��ܣ�
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
