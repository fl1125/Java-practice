package com.itpractice5;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 对象操作流：
 * 
 */
public class ObjectOutoputStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		FileOutputStream fos = new FileOutputStream("a.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
////		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
//		method();
	/*	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
		Object obj = ois.readObject();
		System.out.println(obj);
		
		Object obj2 = ois.readObject();
		System.out.println(obj2);
		ois.close();*/
	
		try{
			while(true){
				Object obj = ois.readObject();
				System.out.println(obj);
			}
		}catch(EOFException e){
			System.out.println("读到了文件的末尾");
		}
		
	}

	private static void method() throws IOException, FileNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
		
		Student s = new Student("jack", 14);
		Student s2 = new Student("bb", 12);
		
	    oos.writeObject(s);
	    oos.writeObject(s2);
		
		oos.close();
	}

}
