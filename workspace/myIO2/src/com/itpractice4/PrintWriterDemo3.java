package com.itpractice4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ʹ�ô�ӡ�������ı��ļ�
 *   ����Դ   SystemInOutDemo.java  BufferedReader
 *   Ŀ�ĵ�  "C:\\Java-practice\\workspace\\myFile\\IODemo.java" PrintWriter
 * 
 */
public class PrintWriterDemo3 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new FileReader("SystemInOutDemo.java"));
		
		PrintWriter pw = new PrintWriter(new FileWriter("C:\\Java-practice\\workspace\\myFile\\IODemo.java"),true);
		
		String line; 
		while((line = br.readLine()) != null){
			pw.println(line);
			
		}
		
		br.close();
		pw.close();
		
	}

}