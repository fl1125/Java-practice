package com.itpractice6;
/*
 * ȥ���ַ������˿ո�	
 *		String trim()
 * ����ָ�����ŷָ��ַ���	
 *		String[] split(String str)
 */
public class StringDemo {

	public static void main(String[] args) {
		//�����ַ�������
		String s1 = "helloworld";
		String s2 = "  helloworld  ";
		String s3 = "  hello  world  ";
		System.out.println("---"+s1+"---");
		System.out.println("---"+s1.trim()+"---");
		System.out.println("---"+s2+"---");
		System.out.println("---"+s2.trim()+"---");
		System.out.println("---"+s3+"---");
		System.out.println("---"+s3.trim()+"---");
		
		
//String[] split(String str)
//�����ַ�������
		String s4 = "aa,bb,cc";
		String[] strAarry = s4.split(",");
		for(int x =0; x<strAarry.length; x++){
			System.out.println(strAarry[x]);
		}
	}

}
