package com.itpractice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class ServerTest {

	public static void main(String[] args) throws IOException {
//   	���������Socket����
		ServerSocket ss = new ServerSocket(9999);
//		����
		Socket s =  ss.accept();
//		��ȡ����������
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
//		��ȡ�û���������
		String username = br.readLine();
		String password = br.readLine();
//		�ж��û����������Ƿ���ȷ
		boolean flag = false;
	/*	if("home".equals(username) && "123456".equals(password)){
			flag = true;
		}*/
		List<User> users = UserDB.getUsers();
		User user = new User(username,password);
		if(users.contains(user)){
			flag = true;
		}
		
//		��ȡ���������
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
//		�����ж���Ϣ
		if(flag){
			out.println("��¼�ɹ�");
		}else{
			out.println("��¼ʧ��");
		}
//		�ͷ���Դ
		s.close();
	}

}