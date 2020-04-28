package com.itpractice2;

import java.io.FileReader;
import java.io.IOException;

/*
 * 输入流读数据的步骤：
 * 		A:创建输入流对象
 * 		B:调用输入流对象的读数据方法
 * 		C:释放资源
 */

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
	      
//		FileReader fr = new FileReader("fr2.txt");
		FileReader fr = new FileReader("FileWriterDemo.java");
		
//		一次读取一个字符数组的数据
//		char[] chs = new char[5];
//
////		第一次读取
//		int len = fr.read(chs);
//		System.out.println("len:"+len);
//		System.out.println(new String(chs,0,len));
////		System.out.println(new String(chs));
//		
////		第二次读取
//		len = fr.read(chs);
//		System.out.println("len:"+len);
//		System.out.println(new String(chs,0,len));
////		System.out.println(new String(chs));
//
////		第三次读取
//		len = fr.read(chs);
//		System.out.println("len:"+len);
//		System.out.println(new String(chs,0,len));

//		用循环改进
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
