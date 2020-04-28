package com.itpractice4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedWriter:���ı�д���ַ����������������ַ����Ӷ��ṩ�����ַ���������ַ����ĸ�Чд�롣 
 * BufferedReader:���ַ��������ж�ȡ�ı�����������ַ����Ӷ�ʵ���ַ���������еĸ�Ч��ȡ��
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
