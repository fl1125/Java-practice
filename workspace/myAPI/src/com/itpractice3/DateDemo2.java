package com.itpractice3;



import java.util.Date;

/*
 * Date�ĳ����÷���
		����ֵ --- Date
			����
			����ֵ��void������long
			void setTime(long time)  
			Date(long date)
		Date --- ����ֵ
			��ȡ
			����long���޲���
			long getTime()  
 */
public class DateDemo2 {
	public static void main(String[] args) {
		Date d = new Date();//Ĭ�ϵ�ǰϵͳʱ��
		//d.setTime(1000 * 60 * 60 * 24 * 2);
		System.out.println(d.toLocaleString());
		System.out.println(d.getTime());//172800000
		
		
		d.setTime(172800000L);
		System.out.println(d.toLocaleString());
	}
}
