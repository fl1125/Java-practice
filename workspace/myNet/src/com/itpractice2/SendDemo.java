package com.itpractice2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * ʹ��UDPЭ�鷢������
 *    �������Ͷ�Socket����
 *    �������ݲ����
 *    ��������
 *    �ͷ���Դ
 * 
 * DatagramSocket():����Socket��������ֶ˿ں�
 * DatagramSocket(int port):����Socket����ָ���˿ں�
 * 
 */
public class SendDemo {

	public static void main(String[] args) throws IOException {
//		   �������Ͷ�Socket����
        DatagramSocket ds = new DatagramSocket();		  
//		      �������ݲ����
        /*
         * DatagramPacket:�����ʾ���ݱ�
         * ����byte[]
         * �豸�ĵ�ַ IP 
         * ���̵ĵ�ַ �˿ں�
         */
        String s = "hello!!";
        byte[] bys = s.getBytes();
        int length = bys.length;
        
//		DatagramPacket
        InetAddress address =InetAddress.getByName("home");
        int port = 8888;
        DatagramPacket dp = new DatagramPacket(bys, length, address, port);
        
        
		ds.send(dp);
//		       �ͷ���Դ
		ds.close();
		
	}

}
