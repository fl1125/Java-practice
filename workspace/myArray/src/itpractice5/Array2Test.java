package itpractice5;

//    二维数组的遍历

public class Array2Test {

	public static void main(String[] args) {
          int[][] arr = {{1,2,3},{4,5,6,},{7,8,9}};
          
          
          for(int y=0;y<arr.length;y++){
        	  for(int x=0;x<arr[y].length;x++){
        		  System.out.print(arr[y][x]+"  ");
        	  }
        	  System.out.println();
          }
		
	}

}
