 package com.topractice;

import java.util.Scanner;

/*
 *   �����ڱ�̾����У���6����ίΪ������ѡ�ִ�֣�����0-100�������֡�
 *        ѡ�ֵ����Ϊ��ȥ��һ����߷ֺ�һ����ͷֺ��4����ίƽ��ֵ��
 *        ��д���롣(������С������)
 * 
 * 
 * 
 * 
 */
public class Test5 {

	public static void main(String[] args) {
	
		int arr[] = new int[6];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����λ������������ɼ�(0-100��)");
		for(int x=0 ; x<arr.length; x++){
			int score = sc.nextInt();
			arr[x] = score;
			
			
		}
		
		int max = getmax(arr);
		int min = getmin(arr);
		int sum = getsum(arr);
		int average =0 ;
		average = (sum - max - min)/arr.length -2;
		System.out.println("��ѡ�ֵ�ƽ�����ǣ�"+average);
	}
       public static int getsum(int arr[]){
    	   int sum = 0 ;
    	   for(int x = 0; x<arr.length; x++){
    		   sum += arr[x];
    	   }
    	
    	   return sum;
       } 	
       
       
       public static int getmax(int arr[]){
           int max = arr[0];  
    	   for(int x=1; x<arr.length;x++)
              if(arr[x] > max){
            	  max = arr[x];
              }
    	   return max;
       }
    	   public static int getmin(int arr[]){
               int min = arr[0];  
        	   for(int x=1; x<arr.length;x++)
                  if(arr[x] < min){
                	  min = arr[x];
                  }
        	   return min;
       }
       
      
       

}