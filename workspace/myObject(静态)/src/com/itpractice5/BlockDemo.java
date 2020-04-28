package com.itpractice5;

public class BlockDemo {

	public static void main(String[] args) {

		//局部代码块：存在于方法中，控制变量的生命周（作用域）	
		/*{
			
			int num = 10;
		}	*/
//		System.out.println(num);
          Teacher t = new Teacher();
          Teacher t2 = new Teacher("jack",22);
	}

}
class Teacher{
	String name;
	int age;
	
	public Teacher(){
		System.out.println("无参空构造");
			
		
	}
	public Teacher(String name,int age){
	 System.out.println("有参构造");
		this.name = name;
		this.age = age;
	}
//	构造代码块：提取构造方法中的共性，每次创建对象都会执行，并在构造方法之前执行
	{
//		for(int x=0; x<10;x++){
//			System.out.println("s1");
//		} 
		System.out.println("001");
	}
//	静态代码块：随着类的加载而加载，只加载一次，加载类是需要做的一些初始化，比如加载驱动
	static {
		System.out.println("001");
	}
}