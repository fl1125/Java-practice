package com.itpractice3;

import java.util.ArrayList;
import java.util.Collections;


/*
 * Collections��
 * �����⣺Collection��Collections��ʲô����
 * 		Collection�Ǽ�����ϵ����㣬�����˼�����ϵ�Ĺ���
 * 		Collections��һ�������࣬�����������ڲ���Collection
 * 
 * ģ�⶷��������
 * 
 */
public class CollectionsDemo {

	public static void main(String[] args) {
	     
		String[] arr = {"����","����","����","÷��"};
		String[] arr2 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		ArrayList<String> box = new ArrayList<String>();
		
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr2.length; j++) {
			box.add(arr[i] + arr2[j]);
		}
	}
             box.add("����");
             box.add("С��");
    
             Collections.shuffle(box);
//	System.out.println(box);
  	         ArrayList<String>  a = new ArrayList<String>();
  	         ArrayList<String>  b = new ArrayList<String>();
  	         ArrayList<String>  c = new ArrayList<String>();
	         
            for (int i = 0; i < box.size()-3; i++) {
            	
            	if(i % 3 == 0){
            		a.add(box.get(i));
            	}else if(i % 3 == 1){
            		b.add(box.get(i));
            	}else if(i % 3 == 2){
            		c.add(box.get(i));
            	}
				
			}	
            System.out.println("a:"+a);
            System.out.println("b:"+b);
            System.out.println("c:"+c);
            
            System.out.println("����");
            for (int i = box.size()-3; i < box.size(); i++) {
				System.out.println(box.get(i));
			}
	}

}