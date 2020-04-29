package com.itpractice3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
 * 需求：使用TCP协议发送数据，并将接受到的数据转换为大写返回
 * 
 *  客户端发出数据
 *  服务端接收数据
 *  服务端转换数据
 *  服务端发送数据
 *  客户端接受数据
 * 
 */
public class ClientDemo {

	public static void main(String[] args) throws IOException, IOException {
	
//		创建客户端Socker对象
		Socket s = new Socket(InetAddress.getByName("home"),10010);
//		获取输出流对象
		OutputStream os = s.getOutputStream();
//		发出数据
		os.write("TCP!!cccddd".getBytes());

//		接收数据
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len;
		len  =  is.read(bys);
		
		System.out.println(new String(bys,0,len));
		s.close();
		
	}
}
