package com.itpractice;

import java.util.Scanner;

// 键盘录入三个数据，返回三个数中的最大值


public class MethodTest3 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("请输入第一个数");
      int a = sc.nextInt();
      
      System.out.println("请输入第二个数");
      int b = sc.nextInt();
      
      System.out.println("请输入第三个数");
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
