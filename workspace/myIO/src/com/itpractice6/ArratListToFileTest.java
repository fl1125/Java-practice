package com.itpractice6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ��ArrayList�����е��ַ����洢���ı��ļ�
 * ÿһ���ַ���Ԫ����Ϊ�ļ��е�һ������
 * 
 * 
 * 
 */
public class ArratListToFileTest {

	public static void main(String[] args) throws IOException {
//	            ��������Ԫ��
		ArrayList<String> array  = new ArrayList<String>(); 
//		������������ַ���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
//		��������������Զ���
		BufferedWriter bw = new BufferedWriter(new FileWriter("array.txt"));
//		�������ϣ��õ�ÿһ���ַ���Ԫ�أ�Ȼ��Ѹ��ַ���Ԫ����Ϊ����д���ļ�
		for(int x=0; x<array.size();x++){
			String s = array.get(x);
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
//		�ͷ���Դ
		bw.close();
		
	}

}
