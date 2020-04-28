package com.itpractice3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ����
 * 		����Ŀ·���µ�FileWriterDemo.java�е����ݸ��Ƶ���Ŀ·���µ�Copy.java��
 * 
 * ����Դ��
 * 		FileWriterDemo.java -- ������ -- FileReader
 * Ŀ�ĵأ�
 * 		Copy.java -- д���� -- FileWriter
 */
public class CopyFileDemo2 {
	public static void main(String[] args) throws IOException {
		//��������������
		FileReader fr  = new FileReader("FileWriterDemo.java");
		//�������������
		FileWriter fw = new FileWriter("Copy.java");
		
		//��д����
		char[] chs = new char[1024];
		int len;
		while((len=fr.read(chs))!=-1) {
			fw.write(chs, 0, len);
		}
		
		//�ͷ���Դ
		fw.close();
		fr.close();
	}
}