package com.itpractice;

import java.io.File;

/*
 * 	String[] list() 
 	File[] listFiles() 
 	static File[] listRoots() 
 */
public class FileDemo4 {

	public static void main(String[] args) {
	
//		method();
		 

	}

	private static void method() {
		File f = new File("c");

		//String[] list() : ���ص�ǰ·�������е��ļ����ļ�������
		//ע�⣺ֻ��ָ���ļ��е�File����ſ��Ե��ø÷���
		String[] files = f.list();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}

}