package com.itTest;

public class Phone {
	private String brand;
	private int price;
	
	public Phone(){
		
	}
	
	public Phone(String brand,int price){
		this.brand = brand;
		this.price = price;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
		
	}

	public void setPrice(int price){
		this.price = price;
	}
	
	public String getBrand(){
		return brand;
	}
	public int getPrice(){
		return price;
	}
}
