package com.itpractice3;


import java.util.Date;

/*
 * Date: ��ʾ�ض���˲�䣬��ȷ�����룬������ͨ���������趨�Լ�����ʾ��ʱ�䣬���Ա�ʾ�����ʱ��
 * System.currentTimeMillis():���ص��ǵ�ǰϵͳʱ�䣬1970-1-1����ĺ�����
 * 
 * ���췽����
 * 		Date() ����������һ����ʾ��ǰϵͳʱ���Date����
		Date(long date) ������"ָ��ʱ��"����Date����
 
 */
public class DateDemo {
	public static void main(String[] args) {
		//Date()
		//Date d = new Date();
		//System.out.println(d);//Thu Aug 26 14:17:28 CST 2049
		//System.out.println(d.toLocaleString());
		
		//Date(long date) 
		Date d2 = new Date(1000 * 60 * 60 * 24);//ʱ�� ��ʱ��
		System.out.println(d2.toLocaleString());

	}
}
