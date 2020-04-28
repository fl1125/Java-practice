package com.itpractice2;

/*
 * 分别使用字符流和字节流复制图片
 * 
 * 二进制文件只能使用字节流进行复制（使用windows自带记事本打开读不懂的）
 * 文本文件的复制即可使用字符流，也可以使用字节流
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class FileCopyDemo {

	public static void main(String[] args) throws IOException {
	   
		FileInputStream  fis = new FileInputStream("22.PNG");
		
		FileOutputStream fos = new FileOutputStream("C:\\Java-practice\\workspace\\myFile\\22.PNG");
		
		int len ;
		byte[] bys = new byte[1024];
		while((len = fis.read(bys)) != -1){	
			fos.write(bys, 0, len);
		}
		
		
		fis.close();
		fos.close();
		
//		method();
	}

	private static void method() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("22.PNG");
 		
        FileWriter fw = new FileWriter("C:\\Java-practice\\workspace\\myFile\\22.PNG");
	
	    int len;
	    char[] chs = new char[1024];
	    while((len = fr.read(chs)) != -1){
	    	fw.write(chs,0,len);
	    	fw.flush();
	    	
            	    	
	    }
        
	    fr.close();
	    fw.close();
	}

}
