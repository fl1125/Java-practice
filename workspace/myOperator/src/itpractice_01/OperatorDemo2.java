package itpractice_01;
/*
 * 
 *  %:用于获取两个数据相除时的余数
 *  /：用于获取两个数据相除时的商
 *  +: 做加法运算(字符参加加法运算，其实是拿字符在计算机中储存的数据值来参与运算的)
 *            'A'65  'a'97 '0'48
 *             字符串参与加法运算，其实做的不是加法运算，而是字符串的拼接
 *  ++,--:自增自减（用于对变量的加1或减1）单独使用的时候，++或--放在变量的前面或者后面，结果一样
 *                              参与其他操作的时候，++在后面，先拿变量做操作，然后变量在++
 *                              ++在前面，先变量++，然后再变量做操作  
 *
 */
public class OperatorDemo2 {

	public static void main(String[] args) {
	 
	 int a =3;
	 int b =5;
	 System.out.println(b/a);
	 System.out.println(b%a);
	 System.out.println(a+b);
//	字符参与加法运算 
	 char c = 'A';
	 System.out.println(a + c);
//	字符串参与加法运算
	 System.out.println("hello"+a); 
	 System.out.println("hello"+a+b); 
	 System.out.println(a+b+"hello"); 
//	++的演示 
	 a++;
	 System.out.println("a:"+a); 
	}

}
