package com.itpractice4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 打印流特有功能
 *    自动换行
 *    自动刷新
 * 
 */
public class PrintWriterDemo2 {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter("d.txt"),true);
				
			pw.println("sss");
			pw.println("ddd");
			pw.println("ddc");
			pw.println("ddb");
		         
            pw.close();
//		method();
	}

	private static void method() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("c.txt");
		
		pw.println("sss");
		pw.println("ddd");
		
		
		pw.close();
	}

}
