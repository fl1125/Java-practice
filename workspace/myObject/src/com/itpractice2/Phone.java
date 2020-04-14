package com.itpractice2;

public class Phone {
//	定义变量
   String brand;
   int price;
   String color;

//   定义成员方法
	public void  call(String name){
      System.out.println("给"+name+"打电话");	
	}
    
	
	public void sendMessage(){
		System.out.println("群发短信");
	}
}
