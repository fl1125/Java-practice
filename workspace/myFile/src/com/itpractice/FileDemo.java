package com.itpractice;

import java.io.File;

/*
 * File:�ļ���Ŀ¼·�����ĳ����ʾ��ʽ��File ���ʵ���ǲ��ɱ��
 * 
 * ���췽����
 * 		File(File parent, String child) 
 * 		File(String pathname) 
 * 		File(String parent, String child) 
 * 
 * File�ĳ��ù��ܣ�
 * 		��������
 * 			boolean createNewFile()  
 * 			boolean mkdir()  
 * 			boolean mkdirs()  
 * 		ɾ������
 * 			boolean delete() 

 * 		��ȡ����
 * 			File getAbsoluteFile()  
 * 			String getAbsolutePath() 
 * 			String getName()  
 * 			String getParent()  
 * 			File getParentFile() 
 * 			String getPath()  
  			long lastModified() 
  			long length()  
 * 		�жϹ���
 * 			 boolean exists()  
 * 			 boolean isAbsolute()  
 * 			 boolean isDirectory() 
 			 boolean isFile()  
 			 boolean isHidden()  
 		�޸��ļ�����
 			boolean renameTo(File dest)  
 			 
 * 
 * 
 */
public class FileDemo {
	public static void main(String[] args) {
		//File(String pathname) ����ָ����·����ת����һ��File����
		//File f = new File("D:\\a\\b.txt");
		
		//File(String parent, String child) : ����ָ���ĸ�·�����ļ�·������File����
		//File f2 = new File("D:\\a","b.txt");
		
		//File(File parent, String child) :����ָ���ĸ�·��������ļ�·������File����
		//File parent = new File("D:\\a");
		//File f3 = new File(parent,"b.txt");
		
		File f4 = new File(new File("D:\\a"),"b.txt");
		
	}
}
