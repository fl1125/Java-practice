package com.itpractice;
/*
 * random：用于产生随机数；
 * 
 * 使用步骤：
 *    导包：	import java.util.Random;
 *    创建对象： Random r = new Random();
 *    获取随机数：int number = r.nextInt(10);
 *            获取数据范围：[0,10) 
 * 
 * 
 * 
 */
import java.util.Random;
public class RandomDemo {

	public static void main(String[] args) {
	Random r = new Random();
	int number = r.nextInt(100);
	System.out.println(number);

	//	获取1-100之间的随机数；
	int i = r.nextInt(100)+1;
	System.out.println("i:"+i);
	}

}
