package com.itpractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Set<K> keySet()
 * Collection<v> values()
 * 
 * 
 */
public class MapDemo3 {

	public static void main(String[] args) {
     Map<String, String> map = new HashMap<String,String>();
     
     map.put("001", "zhang");
     map.put("002", "li");
     map.put("003", "liu");
     
//      method(map);
     
     Collection<String> values = map.values();
     for(String value : values){
    	 System.out.println(value);
     }
	}

	private static void method(Map<String, String> map) {
		Set<String> keys =  map.keySet();
		     for(String key : keys){
		    	 System.out.println(key);
		    	 
		     }
	}

}
