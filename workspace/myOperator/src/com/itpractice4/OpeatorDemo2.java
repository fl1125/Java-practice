package com.itpractice4;
/*
 * &&
 * ||
 * &&��&������&&�ж�·��Ч�������Ϊfalse���ұ߲�ִ�С�
 *           &���������ʲô���ֲ�����ִ��
 */
public class OpeatorDemo2 {

	public static void main(String[] args) {
	    int a = 3;
	    int b = 4;
        int c = 5;
//		&&(��false��flase)
		    System.out.println((a>b) && (a>c));
		    System.out.println((a<b) && (a>c));
		    System.out.println((a>b) &&(a<c));
		    System.out.println((a<b) && (a<c));
		    System.out.println("------------------"); 
		    
	// ||(��true��true)
		    System.out.println((a>b) || (a>c));
		    System.out.println((a<b) || (a>c));
		    System.out.println((a>b) || (a<c));
		    System.out.println((a<b) || (a<c));
		    System.out.println("------------------");
		    
		    int x = 10;
		    int y = 20;
		    System.out.println((x++ > 10) && (y++ > 20));
		    System.out.println("x:"+x);
		    System.out.println("y"+y);		 

	}

}