package com.topractice;
/*
 * ����¼��һ���·ݣ�������·����Ӧ�ļ���
 *     һ�����ļ�
 *     3,4,5 ����
 *     6,7,8 �ļ�
 *     9,10,11 �＾
 *     12,1,2 ����
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ���·�");
		
		int a = sc.nextInt();
/*		if(a>=3 && a<=5){
			System.out.println("����");
		}else if(a>=6 && a<=8){
			System.out.println("�ļ�");
			
		}else if(a>=9 && a<=11){
			System.out.println("�＾");
		} else if(a==12 ){
			System.out.println("����");
			
		}
		 else if(a==1 ){
			System.out.println("����");}	
	 	else if(a==2 ){
	   		System.out.println("����");
		}
	      else{
		  System.out.println("��������·ݴ���");
		}*/
// ��if��ʵ��
		if(a == 3 || a==4 || a==5){
			System.out.println("����");
		}else if(a==6 ||a ==7 || a==8){
			System.out.println("�ļ�");
		}else if(a==9 || a==10 || a==11){
			System.out.println("�＾");
		}else if(a==12 || a==1 || a==2 ){
			System.out.println("����");			
		}else{
		    System.out.println("��������·ݴ���");
		}
//  ��switch���ʵ��
		switch (a){
		case 3:
		case 4:
		case 5:
			  System.out.println("����");
	    	break;
		case 6:
		case 7:
		case 8:
		      System.out.println("�ļ�");
		   	break;
		case 9:
		case 10:
		case 11:
			  System.out.println("�＾");
			break;
		case 12:
		case 1:
		case 2:
			  System.out.println("����");
			break;
		default:
		     System.out.println("��������·ݴ���");
			
		} 
	}
	

}
