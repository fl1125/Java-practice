package com.practice3;

public class ArrayDemo {

	public static void main(String[] args) {
       int[] arr = {1,2,3};
       
//       System.out.println(arr[3]);
//       ArrayIndexOutOfBoundsException
//       ��������Խ���쳣
       
//    Ӧ�����ͣ��࣬�ӿڣ�����       �������ճ�����null���ǿ��Ը�ֵ���������͵�
       arr = null;
       System.out.println(arr[1]);
//       NullPointerException  
//       �����Ѿ�����ָ����ڴ�������ˣ�ȥ��ʹ��������ȥ����Ԫ��
	}

}
