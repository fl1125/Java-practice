package test;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) throws IOException {
	//   创建服务端Socket对象
		ServerSocket ss = new ServerSocket(90);
//			监听
		Socket s = ss.accept();
		
//		获取输入流对象
		InputStream is = s.getInputStream();
//		获取数据
		byte[] bys = new byte[1024];
		int len;
		len =is.read(bys);
		System.out.println(new String(bys,0,len));
		System.out.println(len);
	}

}
