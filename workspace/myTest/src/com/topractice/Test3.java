package com.topractice;

/*
 *     ��һ�����ӣ��ӳ��������������ÿ�¶���һ�����ӣ�С���ӳ����������º�ÿ����������һ�����ӡ�
 *     �������Ӷ��������ʵڶ�ʮ���º����Ӷ���Ϊ����?
 * 
 * 
 * 
 */



public class Test3 {

	public static void main(String[] args) {
       int[] arr = new int[20];
       
       arr[0]=1;
       arr[1]=1;
       for(int x=2; x<arr.length; x++){
           arr[x] = arr[x-1] + arr[x-2];      
       }
         System.out.println("�ڶ�ʮ���µ����Ӷ����ǣ�"+arr[19]);
	}

}