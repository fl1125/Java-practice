package com.itpractice4;
/*
 * 
 * ѧ����Ĳ�����
 *     
 * ͨ������ֱ�ӷ��ʳ�Ա��������������ݵİ�ȫ����
 *   ʹ�� private�ؼ������������Ķ���ֱ�ӷ��ʳ�Ա����
 *   
 *   private ��һ�����η�
 *   �������γ�Ա������Ҳ�������γ�Ա����
 *   ��private���εĳ�Աֻ���ڱ����б�����
 *   
 *   ���private���εĳ�Ա������ʹ��getXxx()��setXxx()���ڻ�ȡ�����ó�Ա������ֵ
 */
public class StudentDemo {

	public static void main(String[] args) {
	 
	Student s = new Student();
	s.show();
	
//	s.age = 22;
	s.setAge(28);
	s.name = "jack";
	s.show();
		
	}

}
