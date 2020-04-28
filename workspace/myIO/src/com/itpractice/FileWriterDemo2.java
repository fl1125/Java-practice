package com.itpractice;
/*
 * flush():刷新缓存区
 *
 * close():先刷新缓存区，然后通知系统释放资源
 * 
 */
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("b.txt");
	    
		 fw.write("sss");
		 fw.flush();
		 fw.write("ddd");
		 fw.flush();
		 
		 fw.close();
	}

}
