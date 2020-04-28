//package com.itpractice;
///*
// * 需求：往文件中写数据
// *    写数据--输出流--FileWriter
// *    
// * FileWriter:
// *    FileWriter(String fileName):传递一个文件名称
// * 输出流写数据的步骤：
// *     创建输出流对象
// *     调用输出流对象的写数据的方法
// *     释放资源
// *     
// * 
// * 
// */
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class FileWriterDemo {
//
//	public static void main(String[] args) throws IOException {
//////		创建输出流对象
////		FileWriter fw = new FileWriter("C:\\Java-practice\\workspace\\a.txt"); 
////		/*
////		 * 创建输出流对象做了那些事情
////		 *    调用系统资源创建了一个文件
////		 *    创建输出流对象
////		 *    把输出流对象指向文件
////		 *    
////		 */
//////		调用输出流对象的写数据的方法  写一个字符串数据
////		fw.write("helloIO");
//////		数据没有直接写到文件，其实是写到了内存缓存区
////		fw.flush();
//////		释放资源
////		fw.close();
////
////	}
////
////}
