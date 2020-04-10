package itpractice5;

/*
 *  二维数组：其实就是元素为一对数组的数组。
 *  定义格式：
 *      数据类型[][] 数组名;
 *      
 *      初始化：动态初始化 数据类型[][] 数组名 = new 数据类型[m][n];
 *            m指二维数组中一维数组的个数
 *            n指的是一维数组中的元素个数
 *      静态初始化：数据类型[][] 数组名 = new 数据类型[][]{{元素...},{元素...},{元素...},{元素...}};
 *               简化格式      数据类型[][] 数组名 = {{元素...},{元素...},{元素...},{元素...}};
 * 
 * 
 */
public class ArrayDemo2 {

	public static void main(String[] args) {
	int[][] arr = {{1,2,3,},{1,5,6},{5,5,5,}};
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println(arr[0][0]);
	}

}
