package com.itpractice;
/*
 * ���ϵ���ϵ�ṹ��
 *    ���ڲ�ͬ�����ݽṹ(���ݵ���֯���洢��ʽ������JavaΪ�����ṩ�˲�ͬ�ļ���)
 *    �������ڲ�ͬ�ļ������ǵĹ��ܶ������ƣ����ϵ�������ȡ�������Գ�ȡ����������Ǽ�����ϵ�����γɵ�ԭ��
 * 
 * 
 * 
 */
import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		
	ArrayList al = new ArrayList();
	al.add("hello");
	al.add("world");
	al.add("java");
	
	for (int i = 0; i < al.size(); i++) {
		System.out.println(al.get(i));
	}
	}

}
