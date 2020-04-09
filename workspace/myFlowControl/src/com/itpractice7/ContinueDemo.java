package com.itpractice7;
/*
 * continue的使用场景：
 *    循环中；
 *    注意：离开使用场景是没有意义的
 *    
 * 作用： 结束一次循环，继续以下一次的循环
 */
public class ContinueDemo {

	public static void main(String[] args) {
		 for(int x=1;x<=10;x++){
		    	if(x==3){
		    		continue;
		    	}
		    	System.out.println("helloworld");
		    }

	}

}
