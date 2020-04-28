package com.itpractice5;

import java.util.Calendar;

import sun.util.resources.cldr.aa.CalendarData_aa_ER;

/*
 * Calendar：日历，提供了一些操作年月日时的方法
 * 
 * 获取
 * 修改
 * 添加
 * 
 * 
 */
public class CalendarDemo {

	public static void main(String[] args) {
	
		//static Calendar getInstance()  
		Calendar c = Calendar.getInstance();
		//int get(int field) // 返回给定日历字段的值
//         System.out.println(Calendar.YEAR); 

	        System.out.println(c.get(Calendar.YEAR));
	        System.out.println(c.get(Calendar.MONTH)+ 1) ;
	        System.out.println(c.get(Calendar.DAY_OF_MONTH));
	        
	}

}
