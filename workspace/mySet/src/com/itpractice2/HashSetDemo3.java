package com.itpractice2;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
     
		HashSet<Person> hs = new HashSet<Person>();
		
		Person p = new Person("a", 2);
		Person p2 = new Person("a", 2);
		Person p3 = new Person("b", 3);

		hs.add(p);
		hs.add(p2);
		hs.add(p3);
		
		for(Person person : hs){
			System.out.println(person);
			
		}
		
		
		

	}

}
