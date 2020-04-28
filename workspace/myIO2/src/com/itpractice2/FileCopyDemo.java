package com.itpractice2;

/*
 * �ֱ�ʹ���ַ������ֽ�������ͼƬ
 * 
 * �������ļ�ֻ��ʹ���ֽ������и��ƣ�ʹ��windows�Դ����±��򿪶������ģ�
 * �ı��ļ��ĸ��Ƽ���ʹ���ַ�����Ҳ����ʹ���ֽ���
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
