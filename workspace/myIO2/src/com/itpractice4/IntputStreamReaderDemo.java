package com.itpractice4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * ���� ��ȡ����¼������ݣ����������Ŀ��Ŀ¼�µ�a.txt�ļ���
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
