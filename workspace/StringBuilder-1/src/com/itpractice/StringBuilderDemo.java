package com.itpractice;
/*
 *  StringBuilder:��һ���ɱ���ַ������ַ�����������
 *    String��StringBuilder������
 *       String�������ǹ̶���
 *       StringBuilder�������ǿɱ��
 * 
 * ��Ա������
 *     public int capacity()�����ص�ǰ����
 *     public int length():���س���(�ַ���)
 */
public class StringBuilderDemo {
        public static void main(String[] args) {
			StringBuilder sb = new StringBuilder();
			System.out.println("sb:"+sb);
			System.out.println("sb.capacity()"+sb.capacity());
			System.out.println("sb.length()"+sb.length());
		}
}
