package com.itpractice;

/*
 * ������ĳ�Ա�ص㣺
 * 		��Ա����
 * 			�����г�Ա����
 * 			�����г���
 * 		��Ա����
 * 			�����г��󷽷�
 * 			�����зǳ��󷽷�
 * 		���췽��
 * 			�����й��췽���ģ���Ҫ�Գ�����ĳ�Ա�������г�ʼ��
 * 
 * final:�����ࡢ��Ա��������Ա����
 */
public class AbstractDemo3 {
	public static void main(String[] args) {
		Dog22 d = new Dog22();
		d.barking();
	}
}

abstract class Animal22 {
	String name = "����Ȯ";
	final int num = 10;
	
	public Animal22() {
		System.out.println("���ǳ�����Ĺ��췽��");
	}
	
	public abstract void eat();
	
	public void run() {}
}

class Dog22 extends Animal22 {
	public void barking() {
		System.out.println(name);
		System.out.println(num);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}
