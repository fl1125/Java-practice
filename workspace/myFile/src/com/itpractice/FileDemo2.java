package com.itpractice;

import java.io.File;
import java.io.IOException;

/*
 * 	��������
 * 		boolean createNewFile()  
 * 		boolean mkdir()  
 * 		boolean mkdirs()  
 * 	ɾ������
 * 		boolean delete() 
 * 
 *  ����·�����̶����ɸı��·�������̷���ͷ
 *  ���·�������ĳ��������������̷���ͷ
 *  		��eclipse�����·�����Ӧ��ǰ��Ŀ�ĸ�Ŀ¼
 *  
 *  
 *  ע�⣺ɾ��һ���ļ��У�����ļ������治�����������ļ����ļ���

 */
public class FileDemo2 {

	public static void main(String[] args) throws IOException {
	
//		File f = new File("d:\\java-pratice\\a.txt");//����·��
		File f2 = new File("a.txt");//���·��
		
//		System.out.println(f2.createNewFile());
//		
        File f3 = new File("b");
//        System.out.println(f3.mkdir());
        
        File f4 = new File("c\\d\\e");
        System.out.println(f4.mkdirs());
        
        System.out.println();
        
        System.out.println(f2.delete());
        
        System.out.println(f3.delete());
        
        System.out.println(f4.delete());
	}
	
}
