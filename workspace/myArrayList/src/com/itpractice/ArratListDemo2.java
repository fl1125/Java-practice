package com.itpractice;

import java.util.ArrayList;

/*
 * ��ȡԪ��  public E get(int index):����ָ����������Ԫ��
 *  
 * ����Ԫ��   public int size()�����ؼ����еĸ���
 * 
 * ɾ��Ԫ��   public boolean remove(Object o):ɾ��ָ����Ԫ�أ�����ɾ���Ƿ�ɹ�
 *        public E remove(int index):ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
 * 
 * �޸�Ԫ��  public E set(int index,E element): �޸�ָ����������Ԫ�أ����ر��޸ĵ�Ԫ��
 * 
 * 
 */
public class ArratListDemo2 {

	public static void main(String[] args) {
		
//		�������϶���
		  ArrayList<String> array = new ArrayList<String>();

//		  ����Ԫ��
		  array.add("hello");
		  array.add("world");
		  array.add("java");
		  System.out.println("array:"+array);
		  System.out.println("--------");
		  
//		  ��ȡԪ��
//		  System.out.println(array.get(1));;
//		  System.out.println("--------");
//		  
////		����Ԫ��
//		  System.out.println(array.size());
//		  System.out.println("--------");
//		  
////		 ɾ��Ԫ��
//		  System.out.println(array.remove("hello"));
//		  System.out.println("array:"+array);
//		  System.out.println("--------");
//		  
//		  System.out.println(array.remove(0));
//		  System.out.println("array:"+array);
//		  System.out.println("--------");
		  
//		  �޸�Ԫ��
		  System.out.println(array.set(1, "go"));
		  System.out.println("array:"+array);
	}

}