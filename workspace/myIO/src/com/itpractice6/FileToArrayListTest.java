package com.itpractice6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 *   从文本文件中读取数据到ArrayList集合中，并遍集合，
 *   每一行数据作为一个字符串元素
 * 
 * 
 * 
 */
public class FileToArrayListTest {

	public static void main(String[] args) throws IOException {
		
//		创建输入流缓冲对象
		BufferedReader br = new BufferedReader(new FileReader("bw2.txt"));
//      创建集合对象
		ArrayList<String> array = new ArrayList<String>();
//		读取数据，每次读取一行数据，把该行数据作为一个元素存储到集合中
		String line; 
		while((line=br.readLine()) != null){
			array.add(line);
		}
		
		
		
		
//		释放资源
		br.close();
//		遍历集合
		for(int x=0; x<array.size(); x++){
		   String s = array.get(x);
		   System.out.println(s);
			
		}	}

}
