package com.topractice;
/*
 * ����һ��int���͵�һά���飬���ݷ�Ϊ{171,72,19,16,118,51,210,7,18}
 *   �������������Ҫ���Ԫ�غͣ����Ԫ�صĸ�λ����ʮλ�����ܰ���7������ֻ��Ϊż��
 *   
 * 
 * 
 * 
 * 
 * 
 */
public class Test4 {

	public static void main(String[] args) {
	   int[] arr={171,72,19,16,118,51,210,7,18};	
	   int sum = 0;
	   for(int x=0; x<arr.length; x++){
			  int ge = arr[x]%10;
			  int qian = arr[x]/10%10;
			 
			  if((ge != 7) && (qian != 7) && (arr[x]%2 == 0)){
				 
				  sum += arr[x];
				  
			  }
		}
		System.out.println("sum:"+sum);   
	}
	

}