package com.itpractice6;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;

public class PropertiesDemo {

	public static void main(String[] args) {
//		���������б����
		Properties prop = new Properties();
		
//		���ӳ���ϵ
		prop.put("001", "zhang");
		prop.put("002", "li");
		prop.put("003", "wang");
//		���������б�
//		��ȡ����key.ͨ��key��ȡvalue
	/*    Set<Object> keys = prop.keySet();
		for (Object key : keys) {
			Object value = prop.get(key);
			System.out.println(key+"="+value);
	
		}*/
		
		Set<java.util.Map.Entry<Object, Object>> entries = prop.entrySet();
		for(java.util.Map.Entry<Object, Object> entry :entries ){
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+"="+value);
		}

	}

}
