package com.itpractice3;

import java.util.Scanner;

/*
 * 
 * 模拟登陆，给三次机会，并提示还有几次机会
 * 
 * 
 */
public class StringTest {

	public static void main(String[] args) {
		String username = "jack";
	    String password = "jack123";
	       
		
//	    给三次机会，用for循坏实现
	    for(int x= 0; x<3; x++){
	   Scanner sc  = new Scanner(System.in);
       System.out.println("请输入用户名！");
       String name = sc.nextLine();
       
       System.out.println("请输入密码！ ");
       String pin = sc.nextLine();
       
       if(name.equalsIgnoreCase(username) && pin.equalsIgnoreCase(password)){
          System.out.println("登陆成功");
          break;
       }else{
    	   {
        	   if((2-x) == 0){
        		   System.out.println("输入错误超过三次，账号锁定");
        	   }else{
    	   System.out.println("你输入的用户名或者密码有误"+"(你还有"+(2-x)+"次机会)");
        	   }
        }
        	   
	    }
	}
 }
}
