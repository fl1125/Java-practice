package com.itpractice5;

import java.util.Scanner;

/*
 * String���ת�����ܣ�
 * char[] toCharArray():���ַ���ת��Ϊ�ַ�����
 * String toLowerCase():���ַ���ת��ΪСд�ַ���
 * String toUpperCase():���ַ���ת��Ϊ��д�ַ���
 * 
 * �ַ����ı�����
 * 		A:length()����charAt()
 * 		B:���ַ���ת��Ϊ�ַ����飬Ȼ���������
 */
public class StringDemo {

	public static void main(String[] args) {
       String s = "Hello   ";
       
       char[] chs = s.toCharArray();
       for(int x=0; x<chs.length; x++){
        System.out.println(chs[x]);
        
       
       }
       System.out.println("HelloWorld".toLowerCase());
       
       System.out.println("HelloWorld".toUpperCase());

	}

}
		