package com.itpractice3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
//   ���������Socket����
		ServerSocket ss = new ServerSocket(10010);
		
//		����
		Socket s = ss.accept();
//		��ȡ����������
		InputStream is = s.getInputStream();
//		��ȡ����
		byte[] bys = new byte[1024];
		int len;
		len =is.read(bys);
		String str = new String(bys,0,len);
		
		System.out.println(str);
		
//		ת������
	       String upperStr= str.toUpperCase();
//	       ��ȡ���������
	       OutputStream os = s.getOutputStream();
	       os.write(upperStr.getBytes());
	       
	       s.close();
		
	}

}