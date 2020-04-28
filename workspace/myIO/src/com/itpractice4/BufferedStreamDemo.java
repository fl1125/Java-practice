package com.itpractice4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedWriter:将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 
 * BufferedReader:从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
 */
public class BufferedStreamDemo {

	public static void main(String[] args) throws IOException {
	
//		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		
//		bw.write("hello");
//		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("bw.txt"));
       /* int ch;
        while((ch=br.read()) != -1){
        	System.out.print((char)ch);
        }*/
		char[] chs = new char[1024];
		int len;
		while((len=br.read(chs)) != -1){
			System.out.print(new String(chs,0,len));
			
		}
        br.close();
	}

}
