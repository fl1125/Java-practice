package com.itpractice6;
/*
 * do...while循环的语句格式
 *   do{
 *      循环体语句;
 *   }while(判断调件语句)；
 * 
 * 扩展格式：
 *     初始化语句
 *   do{
 *      循环体语句;
 *      控制条件语句;
 *   }while(判断调件语句)；
 * 
 *  
 */
public class DoWhileDemo {

	public static void main(String[] args) {
        int x = 1;
		do{
    	 System.out.println("HelloWorld");
    	 x++;
     } while(x <= 10);


	}

}
