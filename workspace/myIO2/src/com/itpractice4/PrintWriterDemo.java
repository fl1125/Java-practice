package com.itpractice4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ��ӡ����
 *    PrintStream
 *    PrintWriter
 *    
 * 
 * ֻ�������������
 */
public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("b.txt");
		
		pw.write("aaa");
		pw.write("bbb");
		pw.write("ccc");
		
		pw.close();
		
	}

}