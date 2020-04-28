package com.itpractice;

import java.io.FileWriter;
import java.io.IOException;

/*
 *  如何实现数据的换行
 *  windows:\r\n
 *  linux:\n
 *  mac:\r
 *  
 *  如何实现数据的追加写入
 *  FileWriter(String filename, boolean append)
 *  
 * 
 * 
 */
public class FileWriterDemo4 {

	public static void main(String[] args) throws IOException {
//		FileWriter fw = new  FileWriter("c.txt" );
		
//	表示追加写入，默认是false	
		FileWriter fw = new  FileWriter("c.txt",true);
		
		 for(int x=0; x<10; x++){
			 fw.write("hello"+x);
			 fw.write("\r\n");
		 }
	     fw.close();
	}
	

}
