package com.itpractice2;

import java.io.File;

public class RecurrenceTest2 {

	public static void main(String[] args) {
		File f = new File("C:\\Java-practice\\workspace\\myFile\\c");
		method(f);

	}

	
	
	public static void method(File file){
		if(file.isDirectory()){
//			删除自己所有的子文件和子目录
			
//			获取所有的子文件和子目录
			File[] files =  file.listFiles();
			for (File f : files) {
				if(f.isFile()){
					System.out.println(f.getName());
					f.delete();
				}else if(f.isDirectory()){
					method(f);
				}
				
			}
//			删除自己
			file.getName();
			file.delete();
		}
	}
}
