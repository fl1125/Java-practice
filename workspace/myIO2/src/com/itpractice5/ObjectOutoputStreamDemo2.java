package com.itpractice5;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutoputStreamDemo2 {
    public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
         
////    	���������������Ķ���
		    	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b.txt"));
		        
		    	try{
		    		while(true){
		    			Object obj = ois.readObject();
			    		System.out.println(obj);
		    		}
		    	} catch (EOFException e) {
		    		System.out.println("û�и����������");
				}
		    	
    	
//		method2();
//    	method();
    	
    	
	}

	private static void method2() throws IOException, FileNotFoundException, ClassNotFoundException {
		//    	���������������Ķ���
		    	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b.txt"));
		    	
		//    	��ȡ����
		    	Object obj = ois.readObject();
		    	System.out.println(obj);
		    	Object obj2 = ois.readObject();
		    	System.out.println(obj2);
		    	Object obj3 = ois.readObject();
		    	System.out.println(obj3);
		//    	�ͷ���Դ
		    	ois.close();
	}

	private static void method() throws IOException, FileNotFoundException {
//		��������������Ķ���
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("b.txt"));
    	
    	ArrayList<Student>  list= new ArrayList<Student>();
//    	����ѧ������
    	list.add(new Student("SSS", 14));
    	list.add(new Student("BBB", 15));
//    	д��ѧ������
        oos.writeObject(list);
        oos.close();
	}
}