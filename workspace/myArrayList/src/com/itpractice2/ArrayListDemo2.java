package com.itpractice2;

import java.util.ArrayList;

import com.sun.xml.internal.fastinfoset.util.StringArray;

/*
 * ����һ���ַ������飺{"������"��"��Զ��"��"���޼�"��"����ͤ"��"�Ŵ�ɽ"��"Ī����"}��
 * �������е�Ԫ�����ӵ������У��Ȱ��������ŵ���Ա��ӡ������̨�ϡ�
 * 
 * 
 * 
 * 
 */
public class ArrayListDemo2 {

	public static void main(String[] args) {
//       �����ַ�������   
		String[] strArray = {"������","��Զ��","���޼�","����ͤ","�Ŵ�ɽ","Ī����"};
		
//		�������϶���
		ArrayList<String> array = new ArrayList<String>();
		
//		�����ַ������󣬻�ȡ��ÿһ���ַ�
		for(int x=0; x<strArray.length; x++){
	        array.add(strArray[x]);	
		}    
//	        ��������
	        for(int c=0; c<array.size(); c++){
	        	String s = array.get(c);
	        	
	        	if(s.startsWith("��")){
	        		System.out.println(s);
	        	}
	        	
	        }
		
		
	}

}