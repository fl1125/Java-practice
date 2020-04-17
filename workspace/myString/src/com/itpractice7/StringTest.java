package com.itpractice7;
/*
 * 把数组中的数据按照指定个格式拼接成一个字符串
 * 举例：int[] arr = {1,2,3};	
 * 输出结果：[1, 2, 3]
 * 
 * 分析：
 * 		A:定义一个int类型的数组
 * 		B:写方法实现把数组中的元素按照指定的格式拼接成一个字符串
 * 		C:调用方法
 * 		D:输出结果
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
