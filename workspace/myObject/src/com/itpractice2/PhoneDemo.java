package com.itpractice2;

public class PhoneDemo {

	public static void main(String[] args) {
        
//   ��������
		Phone p = new Phone();
		System.out.println("Ʒ�ƣ�"+p.brand);
		System.out.println("�۸�"+p.price );
		System.out.println("��ɫ"+p.color);
		
		p.brand="apple";
		p.color="black";
		p.price=4999;
		System.out.println("Ʒ�ƣ�"+p.brand);
		System.out.println("�۸�"+p.price );
		System.out.println("��ɫ"+p.color);

//		���ó�Ա����
		p.call("lll");
		p.sendMessage();
	}

}