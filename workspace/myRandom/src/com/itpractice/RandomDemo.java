package com.itpractice;
/*
 * random�����ڲ����������
 * 
 * ʹ�ò��裺
 *    ������	import java.util.Random;
 *    �������� Random r = new Random();
 *    ��ȡ�������int number = r.nextInt(10);
 *            ��ȡ���ݷ�Χ��[0,10) 
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

	//	��ȡ1-100֮����������
	int i = r.nextInt(100)+1;
	System.out.println("i:"+i);
	}

}
