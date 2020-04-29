package com.itpractice2;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * 使用UDP协议接受数据
 * 
 */
public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
//	创建接收端Socket对象
		DatagramSocket ds = new DatagramSocket(8888);
		
//		接受数据
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys,bys.length);
		System.out.println(1);
		ds.receive(dp);
		System.out.println(2);
//		解析数据
		InetAddress address = dp.getAddress();//获取发送端的IP对象
		byte[] data = dp.getData();//获取接受到的数据，也可以直接使用创建包对象时的数组
		int length = dp.getLength();//获取具体收到数据的长度
		
//		输出数据
          System.out.println("sender--"+address.getHostAddress());
          System.out.println(new String(data,0,length));
//		释放资源
		ds.close();
	}

}
