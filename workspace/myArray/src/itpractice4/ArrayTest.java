package itpractice4;

//数组遍历(以此输出数组中的每一个元素)

public class ArrayTest {

	public static void main(String[] args) {
    int[] arr = {11,22,33,44,55};
    
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);
    System.out.println(arr[4]);

//    通过for循环获取
    for(int x=0;x<5;x++){
    	    System.out.println(arr[x]);

     } 
//     获取数组的长度
     System.out.println(arr.length);
     for(int x=0;x<arr.length;x++){
 	    System.out.println(arr[x]);

  } 

	}

}
