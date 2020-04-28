package com.itpractice4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ����
 * 		����Ŀ·���µ�FileWriterDemo.java�е����ݸ��Ƶ���Ŀ·���µ�Copy.java��
 * 
 * ����Դ��
 * 		FileWriterDemo.java -- ������ -- FileReader -- ��Ч�Ķ����� -- BufferedReader
 * Ŀ�ĵأ�
 * 		Copy.java -- д���� -- FileWriter -- ��Ч��д���� -- BufferedWriter
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



