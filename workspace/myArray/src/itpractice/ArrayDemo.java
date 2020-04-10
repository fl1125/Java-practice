package itpractice;
/*
		  数组：存储同一种数据的类型的多个元素的容器
		  定义格式 ： 
		  数据类型[] 数组名; int[] arr;(推荐的方式) 
		  数据类型  数组名[]; int arr[];

          数组初始化：      所谓的初始化，就是为数组开辟内存空间，并为数组中的每个元素赋予初始值
             有两种方法可以实现数组的初始化：
             动态初始化 ： 只给出长度，由系统给出初始化值     数据类型[] 数据名  = new 数据类型[数组长度]
             静态初始化：   给出初始化值，由系统决定长度      


*/
public class ArrayDemo {

	public static void main(String[] args) {
//      new:为数组申请内存分配，开辟空间
//		3： 数据的长度，其实就是数组中的元素个数	
	
		int[] arr = new int[3];//[I@6d06d69c(数组的地址值)
		System.out.println("arr:"+arr);
//      数组中的每个元素都有编号的  编号从0开始，最大的编号是数组长度-1
//		这个编号的叫法：索引   访问格式：数组名[索引]
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

}
