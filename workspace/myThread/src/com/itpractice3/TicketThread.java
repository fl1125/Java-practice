package com.itpractice3;
/*
 * 同步方法:使用关键字synchronized修饰的方法，一旦被一个线程访问，则整个方法全部锁住，其他线程则无法访问
 * 
 * synchronized
 * 注意：
 * 		非静态同步方法的锁对象是this
 * 		静态的同步方法的锁对象是当前类的字节码对象
 */
public class TicketThread implements Runnable {
     int tickets = 100;
	 Object obj = new Object();
	@Override
	public void run() {
//		出售火车票
		
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
