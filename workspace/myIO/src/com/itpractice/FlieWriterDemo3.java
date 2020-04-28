package com.itpractice;

import java.io.FileWriter;
import java.io.IOException;

/*
 * void write(String str):写一个字符串数据
 * void write(String str,int index,int len):写一个字符串中的一部分数据
 * void write(int ch):写一个字符数据,这里写int类型的好处是既可以写char类型的数据，也可以写char对应的int类型的值。'a',97
 * void write(char[] chs):写一个字符数组数据
 * void write(char[] chs,int index,int len):写一个字符数组的一部分数据
 */
public class FlieWriterDemo3 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("a.txt");

//		void write(String str):写一个字符串数据
//		fw.write("abce");   
//		fw.close();
		
//		 void write(String str,int index,int len):写一个字符串中的一部分数据
//		fw.write("sssdddd", 0, 5);
//		fw.close();
		
//		void write(int ch):写一个字符数据,这里写int类型的好处是既可以写char类型的数据，也可以写char对应的int类型
	    fw.write("a");
	    fw.write(97);
	    fw.close();
	    
	    char[] chs = {'a','x','b'};
	    fw.write(chs);
	}

}
