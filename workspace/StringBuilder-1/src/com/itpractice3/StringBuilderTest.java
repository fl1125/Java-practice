package com.itpractice3;
/*
 * StringBuilder��String���໥ת��
 * 
 * StringBuilder -- String
 * 		public String toString():ͨ��toString()�Ϳ���ʵ�ְ�StringBuilderת��String
 * 
 * String -- StringBuilder
 * 		StringBuilder(String str):ͨ�����췽���Ϳ���ʵ�ְ�Stringת��StringBuilder
 */
public class StringBuilderTest {

	public static void main(String[] args) {
     
     //		  public String toString() 
//		StringBuilder sb = new StringBuilder();
//		sb.append("hello").append("www");
//		String s = sb.toString();
//		System.out.println("s:"+s);

//		StringBuilder(String str)
	    String s = "hellowww";
		StringBuilder sb = new StringBuilder(s);
		System.out.println("sb:"+sb);
	}

}