package com.itpractice;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/*
 * Ϊʲô����ּ����ࣺ
 * 		����ѧϰ����������������ԣ���������������Զ��������������ͨ�����������ֵġ�
 * 		Ϊ�˷���Զ��������в��������Ǿͱ��������������д洢����Ҫ��Զ��������д洢��
 * 		�Ͳ�����һ�������ı�������Ӧ����һ���������͵ı�����
 * 		��ĿǰΪֹ������ѧϰ������Щ�������͵������أ�StringBuilder,���顣
 * 		StringBuilder�Ľ��ֻ����һ���ַ������ͣ���һ���������ǵ�����
 * 		���ԣ�����Ŀǰֻ��ѡ�������ˣ�Ҳ��������ǰ��ѧϰ���Ķ������顣
 * 		���ǣ�����ĳ����ǹ̶��ģ���Ӧ���˱仯��������ô�����Ǹ����ѡ����?
 * 		���ʱ��java���ṩ�˼����๩����ʹ�á�
 * 
 * ��������ص㣺
 * 		���ȿɱ䡣
 * 
 * ArrayList<E>:
 * 		��С�ɱ������ʵ��
 * 
 * 		<E>:��һ��������������ͣ����͡�
 * 		��ô����?
 * 			�ڳ���E�ĵط�����ʹ���������������滻����
 * 			������ArrayList<String>,ArrayList<Student>
 * 
 * ���췽����
 * 		ArrayList()
 * 
 * ����Ԫ�أ�
 * 		public boolean add(E e):����Ԫ��
 * 		public void add(int index,E element):��ָ��������������һ��Ԫ��
 */
public class ArrayListDemo {

	public static void main(String[] args) {
           
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("hello");
		array.add("world");
		
		array.add(1 ,"HHH");
		System.out.println(array);
		
		
	}

}