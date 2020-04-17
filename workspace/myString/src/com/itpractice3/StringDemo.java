package com.itpractice3;
/*
 * Object:�����νṹ�еĸ��࣬���е��඼ֱ�ӻ��߼�ӵļ̳��Ը��ࡣ
 * ���һ����������ʽ������Object����ô�������ǾͿ��Դ�������������������
 * 
 * String����жϹ��ܣ�
 * boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ
 * boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
 * boolean startsWith(String str):�ж��ַ��������Ƿ���ָ����str��ͷ
 * boolean endsWith(String str):�ж��ַ��������Ƿ���ָ����str��β
 */
public class StringDemo {
    public static void main(String[] args) {
		
    	String s1 = "hello";
    	String s2 = "hello";
    	String s3 = "Hello";
    	
    	System.out.println(s1.equals(s2));
    	System.out.println(s2.endsWith(s3));
    	System.out.println("---------------");
    	
    	System.out.println(s1.equalsIgnoreCase(s2));
    	System.out.println(s1.equalsIgnoreCase(s3));
    	System.out.println("---------------");
    	
    	System.out.println(s1.startsWith("he"));
    	System.out.println(s1.startsWith("lo"));
    	System.out.println("---------------");
    	
    	System.out.println(s1.endsWith("lo"));
    	System.out.println(s1.endsWith("he"));
	}
}