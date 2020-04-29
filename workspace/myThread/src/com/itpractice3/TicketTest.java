package com.itpractice3;
/*
 * 模拟火车站售票
 *		
 *		分析：
 *				首相需要有火车票的总数量，每售出一张则数量减一
 *				当火车票的数量小于1的时候，停止售票
 *				使用多线程模拟多个窗口进行售票
 *				当火车票全部售完，火车站也一样敞开大门欢迎我们
 *
 *		static void sleep(long millis) : 让当前线程睡一会
 *
 * 问题出现的原因：
 * 		要有多个线程
 * 		要有被多个线程所共享的数据
 * 		多个线程并发的访问共享的数据
 * 
 * 在火车上上厕所
 * 张三来了，一看门是绿的，他就进去了，把门锁上了，门就变红了
 * 李四来了，一看门市红色的，他就只能憋着
 * 张三用完了厕所，把锁打开了，门就变成了绿色
 * 李四一看门变绿了，他就进去了，把门锁上，门就变红了
 * 王五来了，一看们是红色的，他也只能憋着
 * 李四用完测试了，把锁打开了，肚子又不舒服了，扭头回去了，又把门锁上了，
 * 
 * synchronized:同步（锁），可以修饰代码块和方法，被修饰的代码块和方法一旦被某个线程访问，则直接锁住，其他的线程将无法访问
 * 
 * 同步代码块：
 * 			synchronized(锁对象){
 * 
 * 			}
 * 
 * 注意：锁对象需要被所有的线程所共享
 * 
 * 
 * 同步：安全性高，效率低
 * 非同步：效率高，但是安全性低
 * 
 */
public class TicketTest {

	public static void main(String[] args) {
//		创建线程对象
		TicketThread tt = new TicketThread();
		
		Thread t  = new Thread(tt);
		t.setName("窗口1");
		Thread t2 = new Thread(tt);
		t2.setName("窗口2");
		Thread t3 = new Thread(tt);
		t3.setName("窗口3");
		
		t.start();
		t2.start();
		t3.start();
	}

}
