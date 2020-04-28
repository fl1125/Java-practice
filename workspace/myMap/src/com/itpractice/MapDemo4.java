package com.itpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 	Map的第一种遍历方式：
 * 			首先召集所有的丈夫
 * 			遍历所有的丈夫
 * 			获取每一个丈夫
 * 			让每一个丈夫去找他自己的媳妇
 */
public class MapDemo4 {
   public static void main(String[] args) {
	
	   Map<String, String> map = new HashMap<String, String>();
	   
	   map.put("001", "wang");
	   map.put("002", "ji");
	   map.put("003", "lo");
	   
	   
	   Set<String>  keys = map.keySet();
	   for(String key : keys){
		   String value = map.get(key);
		   System.out.println("key:"+key+"  "+"value:"+value);
	   }
	   
}
}
