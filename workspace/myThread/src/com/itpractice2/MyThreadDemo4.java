package com.itpractice2;
/*
 * ���߳�ʵ�ַ�ʽ2�������̵߳���һ�ַ���������ʵ�� Runnable �ӿڵ��ࡣ����Ȼ��ʵ�� run ������Ȼ����Է�������ʵ�����ڴ��� Thread ʱ��Ϊһ�����������ݲ�����
 *
 *	Thread(Runnable target) 
 *	static Thread currentThread() :���ص�ǰ�̶߳���
 *
 *
 *	��Ȼ���˼̳�ThreadΪ�λ�Ҫ������ʵ��Runnable?
 */
public class MyThreadDemo4 {
	
	public static void main(String[] args) {
		//�����߳�ʵ��
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.setName("����");
		//�����߳�
		t.start();
		
		//�����߳�ʵ��
		MyThread mt2 = new MyThread();
		Thread t2 = new Thread(mt2);
		t2.setName("����");
		//�����߳�
		t2.start();
	
	}

}
