package com.itpractice4;

import java.util.Scanner;

/*
 * ͳ��һ���ַ����д�Сд�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���
 * 
 * 
 */
public class StringTest {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("������һ���ַ�������");
	   String s = sc.nextLine();
	   
//	   ��������ͳ�Ʊ�������ʼ��ֵ��Ϊ0
	   int bigCount = 0;
	   int smallCount = 0;
	   int numberCount = 0;
	   
//	   �����ַ������õ�ÿһ���ַ�
	    for(int x=0; x<s.length(); x++){
	    	char ch =s.charAt(x); 
	    	
//	    ���ַ����ж�
	    	if(ch>='A' && ch<='Z'){
	    		bigCount++;
	    	} else if(ch>='a' && ch<='z'){
	    		smallCount++;
	    	}else if(ch>='0' && ch<='9'){
	    		numberCount++;
	    	}
	    }
		  System.out.println("��д��ĸ����"+bigCount);
		  System.out.println("Сд��ĸ����"+smallCount);
		  System.out.println("�����ַ�����"+numberCount);
	}

}