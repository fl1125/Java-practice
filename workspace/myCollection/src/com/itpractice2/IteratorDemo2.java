package com.itpractice2;
/*
 * �����жϼ������Ƿ����Ԫ��java�������������Ԫ��android
 * Exception in thread "main" java.util.ConcurrentModificationException:�����޸��쳣
 * �������������ڼ��ϵģ��൱�ڼ��ϵ�һ�����������������ڲ�����ʱ��������ֺͼ��ϲ�һ�������׳��쳣
 * 
 * �������:
 * 		��ͱ�ʹ�õ�����
 * 		��ʹ�õ��������б�����ʱ��ʹ�õ������������޸�
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo2 {
       public static void main(String[] args) {
	
           List c = new ArrayList();
           c.add("java");
           c.add("hello");
           c.add("world");
           
        ListIterator lit = c.listIterator();
        while(lit.hasNext()){
        	String s= (String)lit.next();
        	if(s.equals("java")){
        	lit.add("android");
        	}
        }
        
        System.out.println(c);
//    	   method();
}

	private static void method() {
		Collection c = new ArrayList();
           c.add("java");
           c.add("hello");
           c.add("world");
           
          if(c.contains("java")){
        	  c.add("android");
        	  
          }
          System.out.println(c);
	}     
	

}