package com.itpractice;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;

//Set<Map.Entry<K,V>> entrySet()  

public class MapDemo5 {

	public static void main(String[] args) {
	  
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("001", "a");
		map.put("002", "b");
		map.put("003", "c");
		
	     Set<Map.Entry<String, String>> entrys = map.entrySet();
	     
	     for (Map.Entry<String, String> entry :entrys){
	    	 String key = entry.getKey();
	    	 String value = entry.getValue();
	    	 System.out.println(key+value);
	     }

	}

}
