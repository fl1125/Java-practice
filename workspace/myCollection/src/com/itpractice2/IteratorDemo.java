package com.itpractice2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ���ϵı�����ʽ��
 * 		1.toArray(),���԰Ѽ���ת�������飬Ȼ��������鼴��
 * 		2.iterator(),���Է���һ���������������ǿ���ͨ����������������������
 * 
 * Iterator���������ڱ�������
 * 	E next()  :������һ��Ԫ��
 *  boolean hasNext()  ���ж��Ƿ���Ԫ�ؿ��Ի�ȡ
 * 
 *  ע�⣺Exception in thread "main" java.util.NoSuchElementException
 *  	ʹ��next������ȡ��һ��Ԫ�أ����û��Ԫ�ؿ��Ի�ȡ�������NoSuchElementException
	
 */
public class IteratorDemo {

	public static void main(String[] args) {
		
//		method();
					
			Collection c = new ArrayList();
					
			    c.add("s");
				c.add("b");
				c.add("bb");
          
				Iterator it = c.iterator();
//				System.out.println(it.next());
//				System.out.println(it.next());
//				System.out.println(it.next());
//				System.out.println(it.hasNext());
	      
			while(it.hasNext()){
				System.out.println(it.next());
			}	
	}

	private static void method() {
		Collection c = new ArrayList();
		
		c.add("s");
		c.add("b");
		c.add("bb");
		
		Object[] o = c.toArray();
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}
	}

}