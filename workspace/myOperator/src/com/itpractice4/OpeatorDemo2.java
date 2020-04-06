package com.itpractice4;
/*
 * &&
 * ||
 * &&和&的区别：&&有短路的效果，左边为false，右边不执行。
 *           &左边无论是什么，又不都会执行
 */
public class OpeatorDemo2 {

	public static void main(String[] args) {
	    int a = 3;
	    int b = 4;
        int c = 5;
//		&&(有false则flase)
		    System.out.println((a>b) && (a>c));
		    System.out.println((a<b) && (a>c));
		    System.out.println((a>b) &&(a<c));
		    System.out.println((a<b) && (a<c));
		    System.out.println("------------------"); 
		    
	// ||(有true则true)
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
