package com.itpractice;

import java.util.ArrayList;

/*
 * 
 * ArratList���ϵı���
 * 
 */
public class ArraListDemo3 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("hello");
		array.add("world");
		array.add("java");
		
//		��ȡԪ��
		for(int x=0;x<3;x++){
		System.out.println(array.get(x));
		}
//		���֪��������Ԫ�صĸ���  
		for(int x=0; x<array.size();x++){
			System.out.println(array.get(x));
		}
//      ���׼���÷�
		for(int x=0; x<array.size();x++){
		   String s = array.get(x);
		   System.out.println(x);
		}
	}

}