package com.itpractice5;

import java.util.Calendar;

import sun.util.resources.cldr.aa.CalendarData_aa_ER;

/*
 * Calendar���������ṩ��һЩ����������ʱ�ķ���
 * 
 * ��ȡ
 * �޸�
 * ����
 * 
 * 
 */
public class CalendarDemo {

	public static void main(String[] args) {
	
		//static Calendar getInstance()  
		Calendar c = Calendar.getInstance();
		//int get(int field) // ���ظ��������ֶε�ֵ
//         System.out.println(Calendar.YEAR); 

	        System.out.println(c.get(Calendar.YEAR));
	        System.out.println(c.get(Calendar.MONTH)+ 1) ;
	        System.out.println(c.get(Calendar.DAY_OF_MONTH));
	        
	}

}