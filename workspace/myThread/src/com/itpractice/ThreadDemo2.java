package com.itpractice;
/*
 * ���̵߳�ʵ�ַ�ʽ��
 * 		��ʽ1��һ�ַ����ǽ�������Ϊ Thread �����ࡣ������Ӧ��д Thread ��� run ���������������Է��䲢�����������ʵ��
 * 
 * Thread
 * 		String getName()      ���ظ��̵߳����ơ� 
 * 		void   setName(String name) �ı��߳����ƣ�ʹ֮����� name ��ͬ��
 * 
 * 
 * CPUִ�г���������
 */
public class ThreadDemo2 {

	public static void main(String[] args) {
   
		
//		�����߳�ʵ��
		MyThread mt = new MyThread();
//		�޸��߳�����
		mt.setName("s"); 
//		�����߳�
		mt.start();
		
		
		MyThread mt2 = new MyThread();
		mt2.setName("b");
		mt2.start();
		
		
		 
	}

}