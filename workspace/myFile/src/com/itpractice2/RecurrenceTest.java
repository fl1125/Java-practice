package com.itpractice2;

import java.io.File;

/*
 * 输出指定目录下所有的java文件名（包含子目录）
 * 
 */
public class RecurrenceTest {

	public static void main(String[] args) {
		  File f = new File("src");
		  method2(f);
	}

/*//	输出指定目录下的所有java文件（不包括子目录）
	public static void method(File file){
		   if(file.isDirectory()){
			     File[] files = file.listFiles();
			     for (File f : files) {
					if(f.isFile()){
						if(f.getName().endsWith(".java")){
							System.out.println(f.getName());
						}
					}
		         }
			}
		      
		}*/
	
//	输出指定目录下的所有java文件（包括子目录）
	  public static void method2(File file){
		   if(file.isDirectory()){
			     File[] files = file.listFiles();
			     for (File f : files) {
					if(f.isFile()){
						if(f.getName().endsWith(".java")){
							System.out.println(f.getName());
						}
					}
					else{
//						如果是一个目录
						method2(f);
					}
		         } 
			}
		     
		}
}
