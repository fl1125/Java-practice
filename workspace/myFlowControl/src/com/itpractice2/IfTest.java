package com.itpractice2;
//  ����¼���������ݣ���ȡ���������ݵĽϴ�ֵ
import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  //��ݼ������(ctrl+shift+o)
	  System.out.println("�������һ����");
	  int a = sc.nextInt();
	  System.out.println("������ڶ�����");
	  int b = sc.nextInt();
	  
	  if(a>b){
		  System.out.println("���������нϴ���ǣ�"+a);
	  }
	  else{
		  System.out.println("���������нϴ���ǣ�"+b);
	  }
	}

}