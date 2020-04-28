package com.itpractice4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求：
 * 		把项目路径下的FileWriterDemo.java中的内容复制到项目路径下的Copy.java中
 * 
 * 数据源：
 * 		FileWriterDemo.java -- 读数据 -- FileReader -- 高效的读数据 -- BufferedReader
 * 目的地：
 * 		Copy.java -- 写数据 -- FileWriter -- 高效的写数据 -- BufferedWriter
*/ 
public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo.java"));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));
		
		char[] chs = new char[1024];
		int len;
		while((len=br.read(chs)) != -1){
			bw.write(chs, 0, len);
			
		}
		
			br.close();
			bw.close();
	}

}



