package com.itpractice2;
/*
 * System:����һЩ���õ����ֶκͷ����������ܱ�ʵ����
 * static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)  
 * static long currentTimeMillis()  
 * static void exit(int status) 
   static void gc()  
 * 
 */
public class SystemDemo {
	public static void main(String[] args) {
		//method();
		//method2();
		//method3();
		
		//static void gc()  
		//Demo d = new Demo();
		new Demo();
		System.gc();
	}

	private static void method3() {
		//static void exit(int status) :��ֹ�����
		
		for (int i = 0; i < 100000; i++) {
			System.out.println(i);
			if(i == 100) {
				System.exit(0);
			}
		}
	}

	private static void method2() {
		/*
		 *  static long currentTimeMillis() :�Ժ���ֵ���ص�ǰϵͳʱ��
		 *  ��������ʱ�������ʱ�䣬�����1970-1-1 00:00:00 �� 0
		 *  1970-1-1 00:00:01 : 1000
		 *  1970-1-1 00:01:00: 1000 * 60
		 *  1970-1-1 01:00:00: 1000 * 60 * 60
		 *  1000���� = 1��
		 *  
		 */
		//System.out.println(System.currentTimeMillis());
		
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	private static void method() {
		/*
		 * static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)  
		 * ��������
		 * ����1��Դ����
		 * ����2��Դ�������ʼ����λ��
		 * ����3��Ŀ������
		 * ����4��Ŀ���������ʼ����λ��
		 * ����5��ָ�����ܵ�Ԫ�ظ���
		 */
		int[] src = {1,2,3,4,5};
		int[] dest = new int[5];
		System.arraycopy(src, 2, dest, 4, 3);
		
		for (int i = 0; i < dest.length; i++) {
			System.out.print(dest[i]);
		}
	}
}

class Demo {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("�ұ�������");
	}
}
