package com.itpractice;
/*
 * �̳��г�Ա�������ص�
 *     ����ֻ�ܻ�ȡ�����˽�г�Ա
 *     �Ӹ����г�Ա���������ֲ�һ��ֱ�ӻ�ȡ����ĳ�Ա����
 *     �Ӹ����еĳ�Ա����������һ���Ļ�ȡ��������ĳ�Ա����	 
 *      
 *     �ͽ�ԭ�� ˭���Ҿ���˭
 *            
 *     super()�����Ի�ȡ����ĳ�Ա�����ͳ�Ա�������÷���this�����Ƶġ�
 *             ���û�оֲ�������������ĳ�Ա������ʹ������ĳ�Ա����
 *             ���û�оֲ�����������ĳ�Ա�������и��������ʹ�ø���ĳ�Ա����
 *             �����û�У��ͳ�����
 *             
 */            
public class ExtendsDemo3 {

	public static void main(String[] args) {
		Kid k = new Kid();
		k.show();
	}

}

class Dad{
	 String name = "jack";
}
class Kid extends Dad {
	 String name = "black";
	 
	 public void show(){
		String name = "dd";
		System.out.println(name);
	 	System.out.println(super.name);
	 	System.out.println(this.name);
	}
}