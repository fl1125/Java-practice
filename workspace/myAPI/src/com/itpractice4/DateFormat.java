package com.itpractice4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * SimpleDateFormat
 *    格式化：
 *    Date -- String
 *    String format(Date date)
 *    解析： 
 *    String --Date
 *    Date parse(String sources)
 */
public class DateFormat {

	public static void main(String[] args) throws ParseException {
//        method();
		
//       method1();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
		Date d = new Date();
		String  s= sdf.format(d);
		System.out.println(s);

		Date dd = sdf.parse("2020年04月24日14:19:16");
		System.out.println(dd);
		

	}

	private static void method1() throws ParseException {
		//		使用指定的模式进行对象的构建
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
				Date d = new Date();
				String  s= sdf.format(d);
				System.out.println(s);
				
				Date dd = sdf.parse("2020年04月24日");
				System.out.println(dd);
	}

	private static void method() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat();
        
        Date date = new Date();
        
        String s =  sdf.format(date);
        System.out.println(s);
        
        Date d = sdf.parse("20-4-24 下午2:09");
        System.out.println(d);
	}

}
