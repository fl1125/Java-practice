package com.itpractice2;

/*
 * �ֲ��ڲ���
 * 		�ڷ����ڣ����˷���֮����޷�ʹ��
 * 		
 * 
 */
public class InnerDemo3 {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}

class Outer {
	public void method() {
		int num = 10;
		
		class Inner {
			public void function() {
				System.out.println("function");
			}
		}
		
		Inner i = new Inner();
		i.function();
		
	}
	
	public void test() {
		//Inner i = new Inner();
		//System.out.println(num);
	}
}

