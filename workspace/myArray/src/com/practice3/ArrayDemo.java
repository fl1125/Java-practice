package com.practice3;

public class ArrayDemo {

	public static void main(String[] args) {
       int[] arr = {1,2,3};
       
//       System.out.println(arr[3]);
//       ArrayIndexOutOfBoundsException
//       数组索引越界异常
       
//    应用类型：类，接口，数组       常量：空常量，null，是可以赋值给引用类型的
       arr = null;
       System.out.println(arr[1]);
//       NullPointerException  
//       数组已经不再指向堆内存的数据了，去还使用数组名去访问元素
	}

}
