package com.itpractice2;
/*
 * 添加功能  public StringBuilder append(任意类型)
 * 反转功能  public StringBuilder reverse()
 * 
 * 
 */
public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = 	new StringBuilder();
		
// public StringBuilder append(任意类型)
	sb.append("hello");
	sb.append("world");
	sb.append(100);
	sb.append(true);
	
//	sb.append("ss").append("sd").append(44).append(true);
	System.out.println(sb);

// public StringBuilder reverse()
        sb.reverse();
        System.out.println(sb);
	}

}
