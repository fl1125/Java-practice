package com.itpractice3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
//   创建服务端Socket对象
		ServerSocket ss = new ServerSocket(10010);
		
//		监听
		Socket s = ss.accept();
//		获取输入流对象
		InputStream is = s.getInputStream();
//		获取数据
		byte[] bys = new byte[1024];
		int len;
		len =is.read(bys);
		String str = new String(bys,0,len);
		
		System.out.println(str);
		
//		转换数据
	       String upperStr= str.toUpperCase();
//	       获取输出流对象
	       OutputStream os = s.getOutputStream();
	       os.write(upperStr.getBytes());
	       
	       s.close();
		
	}

}
