package test;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) throws IOException {
	//   ���������Socket����
		ServerSocket ss = new ServerSocket(90);
//			����
		Socket s = ss.accept();
		
//		��ȡ����������
		InputStream is = s.getInputStream();
//		��ȡ����
		byte[] bys = new byte[1024];
		int len;
		len =is.read(bys);
		System.out.println(new String(bys,0,len));
		System.out.println(len);
	}

}