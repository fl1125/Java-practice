package com.itpractice;

import java.io.FileWriter;
import java.io.IOException;

/*
 * void write(String str):дһ���ַ�������
 * void write(String str,int index,int len):дһ���ַ����е�һ��������
 * void write(int ch):дһ���ַ�����,����дint���͵ĺô��Ǽȿ���дchar���͵����ݣ�Ҳ����дchar��Ӧ��int���͵�ֵ��'a',97
 * void write(char[] chs):дһ���ַ���������
 * void write(char[] chs,int index,int len):дһ���ַ������һ��������
 */
public class FlieWriterDemo3 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("a.txt");

//		void write(String str):дһ���ַ�������
//		fw.write("abce");   
//		fw.close();
		
//		 void write(String str,int index,int len):дһ���ַ����е�һ��������
//		fw.write("sssdddd", 0, 5);
//		fw.close();
		
//		void write(int ch):дһ���ַ�����,����дint���͵ĺô��Ǽȿ���дchar���͵����ݣ�Ҳ����дchar��Ӧ��int����
	    fw.write("a");
	    fw.write(97);
	    fw.close();
	    
	    char[] chs = {'a','x','b'};
	    fw.write(chs);
	}

}
