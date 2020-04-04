/*
  变量定义的注意事项：
    变量为赋值，不能直接使用
	变量只在他的所属范围内有效
	变量属于它所在的那对大括号
    一行上可以定义多个变量，但是不建议


*/

public class VariableDemo2{
	public static void main(String[] args){
		
		int a = 10;
		System.out.println(a);
		
		int b;
		b = 20;
		System.out.println(b);
		{
			int c = 30;
			System.out.println(c);
		}
		int aa = 10;
		int bb = 20;
		System.out.println(bb);
		System.out.println(aa);
	} 
}