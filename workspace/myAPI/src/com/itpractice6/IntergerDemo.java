package com.itpractice6;
/*
 * �����ж�һ�����Ƿ����int���͵ķ�Χ
 * ���ڻ�����������ֻ����һЩ�򵥵Ĳ��������㣬����JavaΪ���Ƿ�װ�˻����������ͣ�Ϊÿ�ֻ������������ṩ�˰�װ��
 * ��װ����Ƿ�װ�˻����������͵��࣬Ϊ�����ṩ�˸��ิ�ӵķ�����һЩ����
 * 
 * byte		Byte
 * short	Short
 * char		Character
 * int		Integer
 * long		Long
 * float	Float
 * double	Double
 * boolean	Boolean
 * 
 * Integer:
 * 		String --- int
 * 			��ʽ1��int intValue()
 * 			��ʽ2�� static int parseInt(String s) 
 * 		int --- String
 * 			��ʽ1�� + ""
 * 			��ʽ2��String toString()
 * 
 * ���췽����
 * 		Integer(int value) 
 * 		Integer(String s) 

 
 */
public class IntergerDemo {

	public static void main(String[] args) {
//		Integer i = new Integer("10");
//		System.out.println(i);
//		
//		int a = i.intValue();
//		System.out.println(a + 10);
		
		int b = Integer.parseInt("23");
		System.out.println(b + 2);
	}

}