package com.itpractice;

import java.io.File;
import java.io.IOException;

/*
 *	�жϹ���
 * 		boolean exists()  
 * 		boolean isAbsolute()  
 * 		boolean isDirectory() 
 		boolean isFile()  
 		boolean isHidden() 
 */
public class FileDemo3 {
	public static void main(String[] args) throws IOException {
		//method();
		//method2();
		//method3();
		
		method4();
		
		
		
	}

	private static void method4() {
		File f = new File("d:\\a\\b.txt");
		//boolean isHidden() :�ж�File����ָ���·���Ƿ����������ԣ�����������򷵻�true�����򷵻�false
		
		System.out.println(f.isHidden());
	}

	private static void method3() {
		File f = new File("a.txt");
		File f2 = new File("b");
		//boolean isDirectory() ���ж�File����ָ���·���Ƿ����ļ��У�������򷵻�true�����򷵻�false
		//boolean isFile()  : �ж�File����ָ���·���Ƿ����ļ���������򷵻�true�����򷵻�false
		
		//System.out.println(f.isDirectory());
		//System.out.println(f2.isDirectory());
		
		System.out.println(f.isFile());
		System.out.println(f2.isFile());
	}

	private static void method2() {
		//File f = new File("a.txt");
		File f2 = new File("d:\\a\b.txt");
		
		//boolean isAbsolute() :�ж�File����ָ���·���Ƿ��Ǿ���·��������Ǿ���·���򷵻�true�����򷵻�false
		System.out.println(f2.isAbsolute());
	}

	private static void method() {
		File f = new File("a.txt");
		//f.createNewFile();
		
		//boolean exists() : �ж��ļ������ļ����Ƿ���ڣ���������򷵻�true�����򷵻�false
		System.out.println(f.exists());
	}
}
