package com.itpractice;

import java.util.Scanner;

// ����¼���������ݣ������������е����ֵ


public class MethodTest3 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("�������һ����");
      int a = sc.nextInt();
      
      System.out.println("������ڶ�����");
      int b = sc.nextInt();
      
      System.out.println("�������������");
      int c = sc.nextInt();
      
      int maxnumber = getmax(a,b,c);
      System.out.println("maxnumber:"+maxnumber);
//	}
//   public static int getmax(int a, int b, int c){
//	   int temp = (a>b)?a:b;
//	   int max = (temp>c)?temp:c;
//	   return max;
//   }
         
	
	
	}
	public static int getmax(int a,int b,int c){
		if(a>b){
			if(a>c){
				return a;
			}else{
				return c;
			}
		}else {
			if(b>c){
				return b;
			}
			else{
				return c ;
			}
			}
		}
}   