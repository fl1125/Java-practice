package com.topractice;

/*
 *  ��ӡ5λ���е����л�����
 *       12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ
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