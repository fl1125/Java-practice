package com.itpractice3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
 * ����ʹ��TCPЭ�鷢�����ݣ��������ܵ�������ת��Ϊ��д����
 * 
 *  �ͻ��˷�������
 *  ����˽�������
 *  �����ת������
 *  ����˷�������
 *  �ͻ��˽�������
 * 
 */
public class ClientDemo {

	public static void main(String[] args) throws IOException, IOException {
	
//		�����ͻ���Socker����
		Socket s = new Socket(InetAddress.getByName("home"),10010);
//		��ȡ���������
		OutputStream os = s.getOutputStream();
//		��������
		os.write("TCP!!cccddd".getBytes());

//		��������
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len;
		len  =  is.read(bys);
		
		System.out.println(new String(bys,0,len));
		s.close();
		
	}
}