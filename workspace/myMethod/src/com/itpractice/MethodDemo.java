package com.itpractice;
/*  
 *  ��������ʵ��������ض����ܵĴ����
 *    �����ʽ��
 *       ���η� ����ֵ���� ������(�������� ������1��������2...){
 *           �����壻
 *           return ����ֵ�� }
 *     ���η���public static
 *     ����ֵ���ͣ������޶�����ֵ����������
 *     �����������ڷ������ǵ��÷���������
 *     �������ͣ������޶����÷����Ǵ������ݵ�����
 *     �������� ���ڽ��ܵ��÷����Ǵ������ݵ�����
 *     �����壺��ɹ��ܵĴ���
 *     retrun:�������������Ұѷ���ֵ����������
 */
public class MethodDemo {

	public static void main(String[] args) {
//	   �����ĵ���
//��������            sum(10,20);
//�������  	System.out.println(sum(10,20)); 
//��ֵ����
		int result = sum(10,20);
		System.out.println(result);
	}
     public static int sum(int a, int b){
    	  int c = a + b;
    	  return c;
      } 
}