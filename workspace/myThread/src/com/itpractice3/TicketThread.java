package com.itpractice3;
/*
 * ͬ������:ʹ�ùؼ���synchronized���εķ�����һ����һ���̷߳��ʣ�����������ȫ����ס�������߳����޷�����
 * 
 * synchronized
 * ע�⣺
 * 		�Ǿ�̬ͬ����������������this
 * 		��̬��ͬ���������������ǵ�ǰ����ֽ������
 */
public class TicketThread implements Runnable {
     int tickets = 100;
	 Object obj = new Object();
	@Override
	public void run() {
//		���ۻ�Ʊ
		
		while(true){
			 synchronized (obj) {
				 try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if(tickets>0){
						System.out.println(Thread.currentThread().getName() + ":"+tickets--);
						
					}
			}
		
		}
	}

}
