package com.itpractice3;
/*方法重载：在同一个类中，出现了方法名相同的情况。
      方法重载的特点：方法名相同，参数的列表不同。与返回值无关
                参数列表不同：
                       参数的个数不同
		参数对应的数据类型不同	

*/
    public class MethodDemo {

	public static void main(String[] args) {
	  int a = 10;
	  int b = 20;

	 int result = sum(a,b);
	 System.out.println("result:"+result);
	 
	 int c = 30;
	 
	 int value = sum(a,b,c);
	 System.out.println("value:"+value);
/*	 int value = sum2(a,b,c);
	 System.out.println("value:"+value);
*/	}
//求三个数据的和
/*	public static int sum2(int a,int b,int c){
		return a+b+c;
	}
*/	
	public static int sum(int a,int b,int c){
		return a+b+c;
	}
	
//	求两个数据的和
   public static int sum(int a,int b){
//	   int c = a + b;
	   return a + b;
   }
}
