package com.itpractice4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * SimpleDateFormat
 *    ��ʽ����
 *    Date -- String
 *    String format(Date date)
 *    ������ 
 *    String --Date
 *    Date parse(String sources)
 */
public class DateFormat {

	public static void main(String[] args) throws ParseException {
//        method();
		
//       method1();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��HH:mm:ss");
		Date d = new Date();
		String  s= sdf.format(d);
		System.out.println(s);

		Date dd = sdf.parse("2020��04��24��14:19:16");
		System.out.println(dd);
		

	}

	private static void method1() throws ParseException {
		//		ʹ��ָ����ģʽ���ж���Ĺ���
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
				Date d = new Date();
				String  s= sdf.format(d);
				System.out.println(s);
				
				Date dd = sdf.parse("2020��04��24��");
				System.out.println(dd);
	}

	private static void method() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat();
        
        Date date = new Date();
        
        String s =  sdf.format(date);
        System.out.println(s);
        
        Date d = sdf.parse("20-4-24 ����2:09");
        System.out.println(d);
	}

}