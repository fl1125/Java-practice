package com.itpractice3;

import java.util.Scanner;

/* 
   比较两个数据是否相等，参数类型分别是两个byte类型，两个short类型，两个int类型，两个long类型，并在main方法中测试


*/
    public class MethodTest {
 
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

     
//    System.out.println(getequal(10,30));
      System.out.println(getequal((byte)10,(byte)30));
      System.out.println(getequal(10L,30L));  
	
	}
   public static boolean getequal(byte a, byte b){
/*	   if(a==b){
		return true;   
	   }else{
        return false;  
        }  
	   
   }*/
	   System.out.println("byte");
       return a == b;
   }
   
   public static boolean getequal(short a, short b){

	   System.out.println("short");
	   return a == b;
	      }
   
   public static boolean getequal(int a, int b){
	   System.out.println("int");		  
       return a == b;
     }
   
   public static boolean getequal(long a, long b){
	   System.out.println("long");
       return a == b;
     }
}
