package com.itpractice5;

public class BlockDemo {

	public static void main(String[] args) {

		//�ֲ�����飺�����ڷ����У����Ʊ����������ܣ�������	
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
		System.out.println("�޲οչ���");
			
		
	}
	public Teacher(String name,int age){
	 System.out.println("�вι���");
		this.name = name;
		this.age = age;
	}
//	�������飺��ȡ���췽���еĹ��ԣ�ÿ�δ������󶼻�ִ�У����ڹ��췽��֮ǰִ��
	{
//		for(int x=0; x<10;x++){
//			System.out.println("s1");
//		} 
		System.out.println("001");
	}
//	��̬����飺������ļ��ض����أ�ֻ����һ�Σ�����������Ҫ����һЩ��ʼ���������������
	static {
		System.out.println("001");
	}
}