package com.itpractice2;


import java.io.FileReader;
import java.io.IOException;

/*
 * ���󣺴��ļ��ж����ݲ���ʾ������̨
 * 		������--������--FileReader
 * 
 * FileReader:
 * 		FileReader(String fileName):�����ļ�����
 * 
 * ���������ļ��Ĳ��裺
 * 		A:��������������
 * 		B:��������������Ķ����ݷ���
 * 		C:�ͷ���Դ
 * 
 * java.io.FileNotFoundException: fr.txt (ϵͳ�Ҳ���ָ�����ļ���)
 */
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//��������������
//		FileReader fr = new FileReader("fr.txt");
		FileReader fr = new FileReader("FileWriterDemo.java");
		
		//��������������Ķ����ݷ���
		//int read():һ�ζ�ȡһ���ַ�
		
		/*
		//��һ�ζ�����
		int ch = fr.read();
		System.out.println(ch);
		System.out.println((char)ch);
		
		//�ڶ��ζ�����
		ch = fr.read();
		System.out.println(ch);
		System.out.println((char)ch);
		
		//�����ζ�����
		ch = fr.read();
		System.out.println(ch);
		System.out.println((char)ch);
		
		//����ʱ�����Ƿ��ִ�����ظ��Ⱥܸߣ�����ѭ���Ľ������ǲ�֪��ѭ���Ľ���������ʲô
		ch = fr.read();
		System.out.println(ch);
		
		ch = fr.read();
		System.out.println(ch);
		//ͨ�����ԣ�����֪���������ȡ���ݵķ���ֵ��-1��ʱ�򣬾�˵��û�������ˣ���Ҳ������ѭ���Ľ�������
		*/
		
		int ch;
		//1:fr.read()
		//2:ch=fr.read()
		//3:ch != -1
		while((ch=fr.read())!=-1) {
			//System.out.println(ch);
			
			System.out.print((char)ch);
		}
		
		//�ͷ���Դ
		fr.close();
	}
}