package com.itpratice;

/*
 *	
 * 	��̬�е�����ת�ͺ�����ת��:
 * 
 *  ��������֮���ת��
 *  	����ת��
 *  		��С����(������ת���ɸ�����)
 *  	����ת��
 *  		�ɴ�С
 *  �����������͵�ת��
 *  	�Զ�����ת��
 *  		��С����
 *  		byte short char --- int --- long --- float --- double
 *  	ǿ������ת��
 *  		�ɴ�С
 *  		
 * 	
 * 
 */
public class PoymorphicDemo3 {
	public static void main(String[] args) {
		Animal2 a = new Dog();//����ת��
		//a.eat();
		
		Dog d = (Dog)a;//����ת��
		d.swim();
		
	}
}

class Animal2 {
	public void eat() {
		System.out.println("�Զ���");
	}
}


class Dog extends Animal2 {
	public void eat() {
		System.out.println("�й�ͷ");
	}
	
	public void swim() {
		System.out.println("����");
	}
}