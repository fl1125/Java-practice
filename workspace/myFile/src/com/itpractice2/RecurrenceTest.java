package com.itpractice2;

import java.io.File;

/*
 * ���ָ��Ŀ¼�����е�java�ļ�����������Ŀ¼��
 * 
 */
public class RecurrenceTest {

	public static void main(String[] args) {
		  File f = new File("src");
		  method2(f);
	}

/*//	���ָ��Ŀ¼�µ�����java�ļ�����������Ŀ¼��
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
	
//	���ָ��Ŀ¼�µ�����java�ļ���������Ŀ¼��
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
//						�����һ��Ŀ¼
						method2(f);
					}
		         } 
			}
		     
		}
}
