package com.itpractice4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * 需求： 读取键盘录入的数据，并输出到项目根目录下的a.txt文件中
 * 
 */
public class IntputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
	      
		InputStream is = System.in;
		Reader r = new InputStreamReader(is); 
		FileWriter fw = new FileWriter("a.txt");
		
		char[] chs = new char[1024];
		int len;
		while((len = r.read(chs)) != -1){
			fw.write(chs, 0, len);
			fw.flush(); 
		}
		
		fw.close();
		is.close();
		
		
	}

}
