package com.itpractice7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �������
 *    ASCII
 *    
 *    GB2312---GBK
 *    Unicode ���е��ַ���ռ2���ֽ�
 *    utf-8  ���ȿɱ�����
 *    
 *    ANSI�����ر����
 *    java�е��ַ�����Ĭ��ʹ�õ���ANSI
 *    
 */
public class EncoderDemo {

	public static void main(String[] args) throws IOException {
	    String s = "һ����";
	    byte[] bys = s.getBytes("UTF-8");  
	    
	    FileOutputStream fos = new FileOutputStream("a.txt");
	    fos.write(bys);
	    fos.close();
	    		
		
		
	}

}