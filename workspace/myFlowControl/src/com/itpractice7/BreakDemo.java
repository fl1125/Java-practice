package com.itpractice7;
/*
 * break的使用场景：
 *    switch语句中；
 *    循环中；
 *    注意：离开使用场景是没有意义的
 *    
 * 
 * 
 */
public class BreakDemo {

	public static void main(String[] args) {
	    for(int x=1;x<=10;x++){
	    	if(x>3){
	    		break;
	    	}
	    	System.out.println("helloworld");
	    }

	}

}
