package com.itpractice7;
/*
 * �������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
 * ������int[] arr = {1,2,3};	
 * ��������[1, 2, 3]
 * 
 * ������
 * 		A:����һ��int���͵�����
 * 		B:д����ʵ�ְ������е�Ԫ�ذ���ָ���ĸ�ʽƴ�ӳ�һ���ַ���
 * 		C:���÷���
 * 		D:������
 */
public class StringTest {

	public static void main(String[] args) {
	  int[] arr = {1,2,3};
	  
	  String s = arrayTostring(arr);
	  System.out.println(s);
	  
		
	}
   public static String arrayTostring(int arr[]){
           String s ="";
           
           s += "[";
           for(int x=0; x<arr.length; x++){
        	   if(x==arr.length-1){
        		   s += arr[x];
        	   }else{
        		   s += arr[x];
        		   s += ", ";
        	   }
           }
                s += "]";
                return s;
   }
   
}