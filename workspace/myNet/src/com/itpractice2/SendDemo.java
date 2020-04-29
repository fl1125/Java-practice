package com.itpractice2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * 使用UDP协议发送数据
 *    创建发送端Socket对象
 *    创建数据并打包
 *    发送数据
 *    释放资源
 * 
 * DatagramSocket():创建Socket对象并随机分端口号
 * DatagramSocket(int port):创建Socket对象并指定端口号
 * 
 */
public class SendDemo {

	public static void main(String[] args) throws IOException {
//		   创建发送端Socket对象
        DatagramSocket ds = new DatagramSocket();		  
//		      创建数据并打包
        /*
         * DatagramPacket:此类表示数据表
         * 数据byte[]
         * 设备的地址 IP 
         * 进程的地址 端口号
         */
        String s = "hello!!";
        byte[] bys = s.getBytes();
        int length = bys.length;
        
//		DatagramPacket
        InetAddress address =InetAddress.getByName("home");
        int port = 8888;
        DatagramPacket dp = new DatagramPacket(bys, length, address, port);
        
        
		ds.send(dp);
//		       释放资源
		ds.close();
		
	}

}
