package itpractice4;

//�������(�Դ���������е�ÿһ��Ԫ��)

public class ArrayTest {

	public static void main(String[] args) {
    int[] arr = {11,22,33,44,55};
    
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);
    System.out.println(arr[4]);

//    ͨ��forѭ����ȡ
    for(int x=0;x<5;x++){
    	    System.out.println(arr[x]);

     } 
//     ��ȡ����ĳ���
     System.out.println(arr.length);
     for(int x=0;x<arr.length;x++){
 	    System.out.println(arr[x]);

  } 

	}

}