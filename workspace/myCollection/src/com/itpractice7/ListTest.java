package com.itpractice7;

import java.util.ArrayList;
import java.util.List;

/*
 * ����һ������������ָ���б���ָ��Ԫ�ص�����λ��
 * 
 * �ж�Ԫ���Ƿ����
 */
public class ListTest {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
//		int index = getIndex(list, "java");
//		System.out.println(index);
//		
		boolean flag = contains(list, "php");
		System.out.println(flag);
		
		System.out.println(list.contains("java"));
		
	}
	
     public static int getIndex(List list,Object other){
    	 for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			
			if(obj.equals(other)){
				return i;
			}
		}
    	 return -1;
     }
    
     public static boolean contains(List list,Object other){
    	  int index = getIndex(list, other);
    	  if(index >= 0){
    		  return true;
    	  }else {
    		  return false;
    	  }
    	  
      }
}