package com.itpractice;

import java.util.HashMap;
import java.util.Map;

/*
 * 	Map�ĳ��ù��ܣ�
 * 		ӳ�书�ܣ�
 * 			 	V put(K key, V value) 
 * 		��ȡ���ܣ�
 * 				V get(Object key) 
 * 				int size() 
 * 		�жϹ��ܣ�
 * 				boolean containsKey(Object key) 
 				boolean containsValue(Object value) 
 				boolean isEmpty() 
 
 * 		ɾ�����ܣ�
 * 				void clear()  
 * 				V remove(Object key)  
 * 
 * 		�������ܣ�
 * 				Set<Map.Entry<K,V>> entrySet() 
 * 
 * 
 * 			Set<K> keySet()  
 * 			Collection<V> values()  
 
 */
public class MapDemo2 {
     public static void main(String[] args) {
		
    	 Map<String, String> map = new HashMap<String, String>();
    	 
    	 System.out.println(map.put("001", "zhangsan"));
    	 System.out.println(map);
    	 System.out.println(map.put("002", "zhang"));
    	 System.out.println(map);
    	 
    	 System.out.println(map.containsKey("001"));
    	 System.out.println(map.containsValue("zhang"));
//    	 map.clear();
    	 System.out.println(map.isEmpty());
//    	 System.out.println(map.remove("001"));
    	 System.out.println(map.size());
    	 System.out.println(map.get("001"));
     }
}