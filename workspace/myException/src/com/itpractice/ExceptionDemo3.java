package com.itpractice;
/*
 * 	��δ�������쳣��
 * 		����ʹ�ö��try...catch���
 * 		ʹ��һ��try�Ͷ��catch
 * 
 * ���catch֮���˳��
 * 			���catch֮��������Ӹ���
 * 			ƽ��֮��û��˳���ϵ
 * 			������Ӹ��࣬�����쳣������ں���
 * 			
 * 	
 */
public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		try{
			String s = null;
			System.out.println(s.length());
			
			int[] arr = new int[5];
			System.out.println(arr[8]);
			
			System.out.println(2/0);
		}catch(NullPointerException e){
			System.out.println("���ֿ�ָ����");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("��������Խ��");
		}catch (Exception e) {
			System.out.println("�����쳣��");
		} 

		
/*		try{
			int[] arr = new int[5];
			System.out.println(arr[8]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("��������Խ��");
		}
		*/
	}

}