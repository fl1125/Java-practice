package com.itpractice;

import java.io.FileWriter;
import java.io.IOException;

/*
 * �쳣�ķ��ࣺ
		����ʱ���쳣:RuntimeException�������������ʱ���쳣���ڱ���ʱ�ڿ�������ѡ�������߲�����
		����ʱ���쳣:��Exception�����࣬��RuntimeExcpetion�����࣬�ڱ���ʱ�ڱ��봦��
 
 */
public class ExceptionDemo6 {
	public static void main(String[] args) {
		//System.out.println(2 / 0);
		
		//String s = null;
		//System.out.println(s.length());
		
		try {
			FileWriter fw = new FileWriter("a.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}