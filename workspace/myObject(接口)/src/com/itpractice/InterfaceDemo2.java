package com.itpractice;
/*
 *  �ӿڵĳ�Ա�ص㣺
 *     ֻ���г��󷽷� 
 *     ֻ���г���
 *     Ĭ��ʹ��abstract&public���η���
 *     Ĭ��ʹ��abstract&public���η���
 *     Ĭ��ʹ��public static final�����γ�Ա����
 *     
 *     �����ֶ�����Ĭ�����η�
 *     
 * ע�⣺�ӿڲ��ܴ������󣨲���ʵ������
 *     ����ӿڵĹ�ϵ��ʵ�ֹ�ϵ��һ����ʵ��һ���ӿڱ���ʵ�������з���
 */
public class InterfaceDemo2 {

	public static void main(String[] args) {

	}

}
interface Animal{
	public final int num = 10;
	
	public abstract void eat();
	
}
class Cat implements Animal {
	@Override
	public void eat() {
		
		
	}
}