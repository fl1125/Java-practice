package com.itpractice5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 *  ģ��ͻ���¼
 *  
 * 
 * 
 */
public class ClientTest {

	public static void main(String[] args) throws IOException, IOException {
//		�����ͻ���Socket����
//		Socket s = new Socket(InetAddress.getByName("home" ),9999);
        Socket s  = new Socket("home", 9999);
        
//	            ��ȡ�û���������
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("�������û�����"); 
        String username = br.readLine();
        System.out.println("���������룺");
        String password = br.readLine();

 //		��ȡ���������
//      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
          
//		д������
        out.println(username);
        out.println(password);
		
//		��ȡ����������
        BufferedReader serverBr = new BufferedReader(new InputStreamReader(s.getInputStream()));
        
//		��ȡ���������ص�����
        String result = serverBr.readLine();
        System.out.println(result);
//		�ͷ���Դ
        s.close();
	}

}
