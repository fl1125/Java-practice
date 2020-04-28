package com.itpractice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
	
		HashMap<Student, String> hm = new HashMap<Student,String>();
 
		Student s = new Student("j",22);
		Student s2 = new Student("l",23);
		
		hm.put(s, "001");
		hm.put(s2, "002");
		
		Set<Student> keys = hm.keySet();
		for(Student key : keys){
			String value = hm.get(key);
			System.out.println(key + value);
		}
		
		Set<Map.Entry<Student, String>> entrys =  hm.entrySet();
		for( Entry<Student,String> entry : entrys){
              Student key = entry.getKey();
              String value = entry.getValue();
  			System.out.println(key + value);
		}
	}

}
