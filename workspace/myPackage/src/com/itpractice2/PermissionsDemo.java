package com.itpractice2;
/*
 * Ȩ�����η���
 * public  ��ǰ�࣬��ͬ���µĲ�ͬ��,��ͬ���µ���
 * default ��ǰ�࣬    ��ͬ���µĲ�ͬ��
 * private  ��ǰ��  
 * protected  ��ǰ�� ��  ��ͬ���µĲ�ͬ��
 * 
 * default : ��ǰ����ʹ��
 * protected ��������ʹ��
 */
public class PermissionsDemo {

	public void publicMethod(){
		System.out.println("publicMethod");
	}
	
	 void defaultMethod(){
		System.out.println("defaultMethod");
	}

	private void privateMethod(){
		System.out.println("privateMethod");
	}

	protected void protectedMethod(){
		System.out.println("protectedMethod");
	}
	
   public static void main(String[] args) {
	PermissionsDemo pd = new PermissionsDemo();
	pd.publicMethod();
	pd.defaultMethod();
	pd.privateMethod();
	pd.protectedMethod();
	   
}
}