package itpractice4;

//数组获取最值(获取数组中的最大值最小值	)

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] arr = {1,5,9,550,6,100,588};
 
		 int max = arr[0];
		 for(int x=1; x<arr.length;x++){
			 if(arr[x]>max){
				 max = arr[x];
			 }
		 }
		 System.out.println("max:"+max);
	}
	

}
