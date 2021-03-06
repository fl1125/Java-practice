package itpractice_01;

/*
 * 运算符：就是用于对常量和变量进行操作的符号
 * 表达式：用运算符连接起来的的符合java语法的式子。不同的运算符连接的表达式是不同类型的表达式。
 *    ep：a,b
 *       a + b
 * 
 * 运算符分类：
 *    算术运算符：+，-，*，/，++，--
 *    赋值运算符
 *    逻辑运算符
 *    三元运算符
 * 
 * 
 * 
 */

public class OperatorDemo {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
//		System.out.println(a / b);(整数相除只能得到小数，想得到小数，就必须有浮点数参与)
		System.out.println(3.0 / 4 );
	}

}
