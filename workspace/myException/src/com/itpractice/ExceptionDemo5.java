package com.itpractice;

import java.io.FileWriter;
import java.io.IOException;

/*
 *  finally:���try...catchʹ�ã������ͷ���Դ����β����������try...catch������ִ�У�finally�Ĵ���һ����ִ��
 *  
 *  try {
 *  	�п��ܳ�������Ĵ���;
 *  
 *  } catch(�쳣����) {
 *  	�����쳣;
 *  } finally {
 *  	�ͷ���Դ;
 *  	��������;
 *  }
 *  
 */
public class ExceptionDemo5 {

	public static void main(String[] args) {

		FileWriter fw = null;
		try {
//			System.out.println(2 / 0);
			fw = new FileWriter("a.txt");
			fw.write("hello");
			fw.write("world");
			System.out.println(2 / 0);
			fw.write("java");
			
//			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//�ͷ���Դ
			try {
				if(fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }
	 }
}