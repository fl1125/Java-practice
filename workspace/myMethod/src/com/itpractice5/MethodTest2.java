package com.itpractice5;
/*
    	把获取数组最值改进为方法，并调用方法



*/
public class MethodTest2 {

	public static void main(String[] args) {
       int[] arr={11,22,33,44,55};


		/* int max = arr[0];
		 for(int x=1; x<arr.length; x++){
			 if(arr[x]>max){
				 max = arr[x];
			 }
		 }
		 System.out.println("max:"+max);*/
         int max = getmax(arr);
		 System.out.println("max:"+max);

	}
	
      public static int getmax(int arr[]){
    	  int max = arr[0];
    	  for(int x=1; x<arr.length; x++){
    		  if(arr[x]>max){
                    max = arr[x];
    	  }
    		  
      }	
          return max;
}
 }