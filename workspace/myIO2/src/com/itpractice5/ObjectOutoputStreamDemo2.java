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
         
////    	创建对象输入流的对象
		    	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b.txt"));
		        
		    	try{
		    		while(true){
		    			Object obj = ois.readObject();
			    		System.out.println(obj);
		    		}
		    	} catch (EOFException e) {
		    		System.out.println("没有更多的数据了");
				}
		    	
    	
//		method2();
//    	method();
    	
    	
	}

	private static void method2() throws IOException, FileNotFoundException, ClassNotFoundException {
		//    	创建对象输入流的对象
		    	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b.txt"));
		    	
		//    	读取对象
		    	Object obj = ois.readObject();
		    	System.out.println(obj);
		    	Object obj2 = ois.readObject();
		    	System.out.println(obj2);
		    	Object obj3 = ois.readObject();
		    	System.out.println(obj3);
		//    	释放资源
		    	ois.close();
	}

	private static void method() throws IOException, FileNotFoundException {
//		创建对象输出流的对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("b.txt"));
    	
    	ArrayList<Student>  list= new ArrayList<Student>();
//    	创建学生对象
    	list.add(new Student("SSS", 14));
    	list.add(new Student("BBB", 15));
//    	写出学生对象
        oos.writeObject(list);
        oos.close();
	}
}
