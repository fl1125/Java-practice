package com.itpractice2;
/*
 * ���ӹ���  public StringBuilder append(��������)
 * ��ת����  public StringBuilder reverse()
 * 
 * 
 */
public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = 	new StringBuilder();
		
// public StringBuilder append(��������)
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