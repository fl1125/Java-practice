package com.itpractice;
/*
 * flush():ˢ�»�����
 *
 * close():��ˢ�»�������Ȼ��֪ͨϵͳ�ͷ���Դ
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
