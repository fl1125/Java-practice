package com.topractice;

/*
 *  打印5位数中的所有回文数
 *       12321是回文数，个位和万位相同，十位和千位相同
 * 
 * 
 * 
 */
public class Test2 {

	public static void main(String[] args) {
		for(int x=10000; x<=99999;x++){
            int ge = x%10;
            int shi = x/10%10;
            int wan = x/10/10/10/10%10;
            int qian = x/10/10/10%10;
            if((ge==wan) && (shi== qian)){
            	System.out.println(x);
            }
		}

	}

}
