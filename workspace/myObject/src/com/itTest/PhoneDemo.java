package com.itTest;

public class PhoneDemo {

	public static void main(String[] args) {
        Phone p = new Phone();
        p.setBrand("apple");
        p.setPrice(99999);
        System.out.println(p.getBrand()+"---"+p.getPrice());
		
		Phone p2= new Phone("apple", 99999);
		System.out.println(p2.getBrand()+"---"+p2.getPrice());
     

	}

}
