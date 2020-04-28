package com.itpractice4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * ��ȡ��Ŀ��Ŀ¼�µ�SystemInOutDemo.java���������������
 * 
 */
public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
//		method();
		 BufferedReader br = new BufferedReader(new FileReader("SystemInOutDemo.java"));
		
//		 OutputStream os = System.out;
		  Writer w = new OutputStreamWriter(System.out); 
		  BufferedWriter bw = new BufferedWriter(w);
		  
		  
		   String line;
		   while((line = br.readLine()) != null){
			   bw.write(line);
			   bw.newLine();
			   
		   }
		   
		  
			w.close();
			br.close();

	}

	private static void method() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("SystemInOutDemo.java"));
		
		OutputStream os = System.out;
		
		String line;
		while ((line= br.readLine()) != null) {
	       os.write(line.getBytes());
	       os.write("\r\n".getBytes());
			
		}
		os.close();
		br.close();
	}

}