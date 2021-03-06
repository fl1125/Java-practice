package com.itpractice2;
/* 
 * String 类代表字符串。
 * String(String original) 初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列；换句话说，新创建的字符串是该参数字符串的副本。
 * String(char[] value) 分配一个新的 String，使其表示字符数组参数中当前包含的字符序列。
 *String(char[] value, int offset, int count) 
 */
public class StringDemo {
  public static void main(String[] args) {
	  
//	 方法1 
	String s1 = new String("HELLO");
	System.out.println("s1:"+s1);

//	方法2
	char[] chs = {'H','e','l','l','o'};
	String s2 = new String(chs);
	System.out.println("s2:"+s2);
	
//	方法3
//	String s3 = new String(chs,0,chs.length);
	String s3 = new String(chs,1,3);
    System.out.println("s3:"+s3);
	
//  方式4
   String s4  = "Hello";
   System.out.println("s4:"+s4);
	
	
}
}
