package itpractice;

public class ArrayTest2 {

	public static void main(String[] args) {
       int[] arr = new int[3];
       int[] arr2 = new int[3];

       System.out.println(arr);
       System.out.println(arr[0]);
       System.out.println(arr[1]);
       System.out.println(arr[2]);

       System.out.println(arr2);
       System.out.println(arr2[0]);
       System.out.println(arr2[1]);
       System.out.println(arr2[2]);
       
       arr[0] = 15;
       arr[1] = 25;
       arr[2] = 35;
       
       arr2[0] = 5;
       arr2[1] = 2;
       arr2[2] = 3;

       System.out.println(arr);
       System.out.println(arr[0]);
       System.out.println(arr[1]);
       System.out.println(arr[2]);

       System.out.println(arr2);
       System.out.println(arr2[0]);
       System.out.println(arr2[1]);
       System.out.println(arr2[2]);
       
       
    		   
	}

}