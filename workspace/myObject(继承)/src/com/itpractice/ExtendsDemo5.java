package com.itpractice;
/*
 * ������д�����ⳡ����������ķ���������ȫ��������ʹ�ã����ʱ��������д����ķ���
 *              �������ڷ�����ʹ�ùؼ���super���ø���ķ���
 * 
 * ������д��ע�����������д����˽����ķ���
 *              Ȩ�ޱ�����ڵ��ڸ����Ȩ��
 * 
 * ע�⣺@
 */
public class ExtendsDemo5 {

	public static void main(String[] args) {
	   NewPhone np = new NewPhone();
	   np.call();
	}

}
class Phone{
	public void call(){
		System.out.println("��绰");
	}
}
class NewPhone extends Phone{
 @Override
	public void call(){
		System.out.println("¼��");
		
		super.call();
	}
}