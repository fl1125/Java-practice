package com.itpractice3;

import java.util.Scanner;

/*
 * 
 * ģ���½�������λ��ᣬ����ʾ���м��λ���
 * 
 * 
 */
public class StringTest {

	public static void main(String[] args) {
		String username = "jack";
	    String password = "jack123";
	       
		
//	    �����λ��ᣬ��forѭ��ʵ��
	    for(int x= 0; x<3; x++){
	   Scanner sc  = new Scanner(System.in);
       System.out.println("�������û�����");
       String name = sc.nextLine();
       
       System.out.println("���������룡 ");
       String pin = sc.nextLine();
       
       if(name.equalsIgnoreCase(username) && pin.equalsIgnoreCase(password)){
          System.out.println("��½�ɹ�");
          break;
       }else{
    	   {
        	   if((2-x) == 0){
        		   System.out.println("������󳬹����Σ��˺�����");
        	   }else{
    	   System.out.println("��������û���������������"+"(�㻹��"+(2-x)+"�λ���)");
        	   }
        }
        	   
	    }
	}
 }
}