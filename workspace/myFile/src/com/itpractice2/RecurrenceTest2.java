package com.itpractice2;

import java.io.File;

public class RecurrenceTest2 {

	public static void main(String[] args) {
		File f = new File("C:\\Java-practice\\workspace\\myFile\\c");
		method(f);

	}

	
	
	public static void method(File file){
		if(file.isDirectory()){
//			ɾ���Լ����е����ļ�����Ŀ¼
			
//			��ȡ���е����ļ�����Ŀ¼
			File[] files =  file.listFiles();
			for (File f : files) {
				if(f.isFile()){
					System.out.println(f.getName());
					f.delete();
				}else if(f.isDirectory()){
					method(f);
				}
				
			}
//			ɾ���Լ�
			file.getName();
			file.delete();
		}
	}
}