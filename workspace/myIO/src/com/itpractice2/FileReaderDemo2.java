package com.itpractice2;

import java.io.FileReader;
import java.io.IOException;

/*
 * �����������ݵĲ��裺
 * 		A:��������������
 * 		B:��������������Ķ����ݷ���
 * 		C:�ͷ���Դ
 */

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
	      
//		FileReader fr = new FileReader("fr2.txt");
		FileReader fr = new FileReader("FileWriterDemo.java");
		
//		һ�ζ�ȡһ���ַ����������
//		char[] chs = new char[5];
//
////		��һ�ζ�ȡ
//		int len = fr.read(chs);
//		System.out.println("len:"+len);
//		System.out.println(new String(chs,0,len));
////		System.out.println(new String(chs));
//		
////		�ڶ��ζ�ȡ
//		len = fr.read(chs);
//		System.out.println("len:"+len);
//		System.out.println(new String(chs,0,len));
////		System.out.println(new String(chs));
//
////		�����ζ�ȡ
//		len = fr.read(chs);
//		System.out.println("len:"+len);
//		System.out.println(new String(chs,0,len));

//		��ѭ���Ľ�
//		len = fr.read(chs);
//		System.out.println("len:"+len);
//		
		char[] chs = new char[1024];
       int len;
       while((len=fr.read(chs)) != -1){
    	   System.out.print(new String(chs,0,len));
       }
       fr.close();
	}

}
