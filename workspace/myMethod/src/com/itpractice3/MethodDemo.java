package com.itpractice3;
/*�������أ���ͬһ�����У������˷�������ͬ�������
      �������ص��ص㣺��������ͬ���������б���ͬ���뷵��ֵ�޹�
                �����б���ͬ��
                       �����ĸ�����ͬ
		������Ӧ���������Ͳ�ͬ	

*/
    public class MethodDemo {

	public static void main(String[] args) {
	  int a = 10;
	  int b = 20;

	 int result = sum(a,b);
	 System.out.println("result:"+result);
	 
	 int c = 30;
	 
	 int value = sum(a,b,c);
	 System.out.println("value:"+value);
/*	 int value = sum2(a,b,c);
	 System.out.println("value:"+value);
*/	}
//���������ݵĺ�
/*	public static int sum2(int a,int b,int c){
		return a+b+c;
	}
*/	
	public static int sum(int a,int b,int c){
		return a+b+c;
	}
	
//	���������ݵĺ�
   public static int sum(int a,int b){
//	   int c = a + b;
	   return a + b;
   }
}