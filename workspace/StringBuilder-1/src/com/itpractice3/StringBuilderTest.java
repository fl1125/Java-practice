package com.itpractice3;
/*
 * StringBuilder和String的相互转换
 * 
 * StringBuilder -- String
 * 		public String toString():通过toString()就可以实现把StringBuilder转成String
 * 
 * String -- StringBuilder
 * 		StringBuilder(String str):通过构造方法就可以实现把String转成StringBuilder
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
