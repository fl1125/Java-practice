package com.itpractice;

public class StudentDemo {
	public static void main(String[] args) {
		//����ѧ������
		Student[] students = new Student[3];
		
		//����ѧ������
		Student s1 = new Student("�ܲ�",40);
		Student s2 = new Student("����",35);
		Student s3 = new Student("��Ȩ",30);
		
		//��ѧ��������ΪԪ�ظ�ֵ��ѧ������
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		//����ѧ������
		for(int x=0; x<students.length; x++) {
			Student s = students[x];
			//System.out.println(s);
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}
