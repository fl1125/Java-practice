package com.itpractice4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


/*
 * UPDЭ���շ����ݵ�ע������
 * 
 */
public class SendDemo2 {

	public static void main(String[] args) throws IOException {
       
		
		DatagramSocket ds = new DatagramSocket();
		
		byte[] bys = "hello!!!!!".getBytes();
		DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("home"), 9999);
		
		ds.send(dp);
		ds.close();
		
	}

}
