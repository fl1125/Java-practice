package com.itpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 	Map�ĵ�һ�ֱ�����ʽ��
 * 			�����ټ����е��ɷ�
 * 			�������е��ɷ�
 * 			��ȡÿһ���ɷ�
 * 			��ÿһ���ɷ�ȥ�����Լ���ϱ��
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
