package com.itpractice;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 	Collection 	
 * 			boolean add(E e)  
 * 			void clear()  
 * 			boolean contains(Object o)  
 * 			boolean isEmpty() 
 * 			boolean remove(Object o) 
 * 			int size() 
 * 			Object[] toArray()  
 
 
 * 
 * 
 * Iterator<E> iterator()  
 
 * 		
 */
public class CollectionDemo2 {

	public static void main(String[] args) {
		
		Collection c= new ArrayList();//��̬������ָ���������
		
//				boolean add(E e) 
		System.out.println(c.add("s"));
		System.out.println(c);
		
		
//		void clear()
//		c.clear();
//		System.out.println(c);

//		 boolean contains(Object o)
	    System.out.println(c.contains("s"));
//	    boolean isEmpty()
	    System.out.println(c.isEmpty());
//	    boolean remove(Object o) 
	    System.out.println(c.remove("s"));
	    System.out.println(c);
//	    	int size() 
	    System.out.println(c.size());
	    
//	    	Object[] toArray()
	    System.out.println(c.add("ss"));
	    System.out.println(c.add("sd"));
	    System.out.println(c.add("sb"));
	    	Object[] obj = c.toArray();
	    	for (int i = 0; i < obj.length; i++) {
				System.out.println(obj[i]);
			}
	    
		
	}
}