package com.itpractice4;
/*
 * �����ڲ����Ӧ�ó�����
 *    ��Ϊ�������д���
 * 
 * 
 */
public class InnerDemo5 {

	public static void main(String[] args) {
//	
//		method(new Dog());
//		method(new Cat());
		
		
		
		method(new Animal() {
			
			@Override
			public void eat() {
				System.out.println("fishing");
			}
		});
	}
   public static void method(Animal a){
	   a.eat(); 
   }
}
