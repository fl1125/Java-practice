package com.itpractice2;

public class PhoneDemo {

	public static void main(String[] args) {
        
//   创建对象
		Phone p = new Phone();
		System.out.println("品牌："+p.brand);
		System.out.println("价格："+p.price );
		System.out.println("颜色"+p.color);
		
		p.brand="apple";
		p.color="black";
		p.price=4999;
		System.out.println("品牌："+p.brand);
		System.out.println("价格："+p.price );
		System.out.println("颜色"+p.color);

//		调用成员方法
		p.call("lll");
		p.sendMessage();
	}

}
