package com.itpractice7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 编码表：
 *    ASCII
 *    
 *    GB2312---GBK
 *    Unicode 所有的字符都占2个字节
 *    utf-8  长度可变的码表
 *    
 *    ANSI：本地编码表
 *    java中的字符编码默认使用的是ANSI
 *    
 */
public class EncoderDemo {

	public static void main(String[] args) throws IOException {
	    String s = "一二三";
	    byte[] bys = s.getBytes("UTF-8");  
	    
	    FileOutputStream fos = new FileOutputStream("a.txt");
	    fos.write(bys);
	    fos.close();
	    		
		
		
	}

}
