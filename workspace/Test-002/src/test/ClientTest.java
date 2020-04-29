package test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 *    启动一个tcp端口监听90端口，然后再启动一个连接这个端口把文件传过去。
                监听程序收到文件后，计算文件大小，并在控制台输出
 */
public class ClientTest {

	public static void main(String[] args) throws IOException, IOException {
//		创建客户端Socker对象
		Socket s = new Socket(InetAddress.getByName("home"),90);
//		获取输出流对象
		OutputStream os = s.getOutputStream();
//		发出数据
		os.write("TCP".getBytes());
		
		s.close();


	}

}
 