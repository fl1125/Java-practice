package com.topractice;

import java.util.Scanner;

/*
 *   ����¼��5��int���͵����ݴ洢����arr��
 *   ���巽����arr�����е����ݷ�ת
 *   ���巽���Է�ת���������б���
 * 
 * 
 * 
 * 
 * 
 */
public class Test6 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//    ��������
        int[] arr= new int[5];
        
          for(int x=0; x<arr.length; x++){
    	    System.out.println("������"+(x+1)+"������");
            int a = sc.nextInt();
           	arr[x] = a;
        } 
          printArray(arr);
	      reverse(arr);
          printArray(arr);
    
	}
//	��������
	 public static void printArray(int[] arr){
		 System.out.print("[");
		 for(int x=0; x<arr.length;x++){
		    if(x==arr.length-1){
		    	System.out.println(arr[x]+"]");
		    }else{
		    	System.out.print(arr[x]+", ");
		    }
		 }
	 }
	
//	��ת����
    public static void reverse(int[] arr){
  	  for(int start=0, end=arr.length-1; start<=end; start++,end--){
  		  int temp = arr[start];
  		  arr[start] = arr[end];
  		  arr[end] = temp;
  	  }
    }


}