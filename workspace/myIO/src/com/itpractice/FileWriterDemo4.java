package com.itpractice;

import java.io.FileWriter;
import java.io.IOException;

/*
 *  ���ʵ�����ݵĻ���
 *  windows:\r\n
 *  linux:\n
 *  mac:\r
 *  
 *  ���ʵ�����ݵ�׷��д��
 *  FileWriter(String filename, boolean append)
 *  
 * 
 * 
 */
public class FileWriterDemo4 {

	public static void main(String[] args) throws IOException {
//		FileWriter fw = new  FileWriter("c.txt" );
		
//	��ʾ׷��д�룬Ĭ����false	
		FileWriter fw = new  FileWriter("c.txt",true);
		
		 for(int x=0; x<10; x++){
			 fw.write("hello"+x);
			 fw.write("\r\n");
		 }
	     fw.close();
	}
	

}
