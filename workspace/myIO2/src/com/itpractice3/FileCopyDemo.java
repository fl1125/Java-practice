package com.itpractice3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream("IODemo.java");
		
		FileOutputStream fos = new FileOutputStream("C:\\Java-practice\\workspace\\myFile\\IODemo.java");
	    	
		int len;
		byte[] bys = new byte[1024];
		while((len = fis.read(bys)) != -1){
			fos.write(bys,0,len);
		}
		
		fis.close();
		fos.close();
		
	}

}
