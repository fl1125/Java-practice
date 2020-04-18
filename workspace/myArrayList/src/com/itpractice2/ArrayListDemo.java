package com.itpractice2;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	   ArrayList<String> array = new ArrayList<String>();
	   
	   array.add("jack");
	   array.add("mike");
	   array.add("jakey");
	   array.add("Bob");
	   
	   for(int x=0; x<array.size(); x++){
		   String s = array.get(x);
		   System.out.println(s);
	   }

	}

}
