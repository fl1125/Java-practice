package com.itpractice;
/*
 * Java���Եļ̳��ǵ�һ�ģ�һ������ֻ����һ������
 * Java���Ը������ṩ��һ�ֻ��ƣ����ڴ���̳е�һ�ľ����Եģ��ӿ�
 * 
 * �ӿڣ��ӿ���һ���ȳ����໹������࣬�ӿ������еķ���ȫ�ǳ��󷽷�,�ӿں���Ĺ�ϵ��ʵ�֣�implements
 * 
 * interface	
 * ��ʽ�� 
 *   interface �ӿ���{
 *   }
 */


public class InterfaceDemo {
	public static void main(String[] args) {
		BillGates  gates = new BillGates();
		gates.code();
		 
	}
	}

class Porgrammer{
	public void code(){
		System.out.println("coding");
	}
}

class BillGates extends Porgrammer{
	
}