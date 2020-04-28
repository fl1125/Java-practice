package com.itpractice;
/*
 * 集合的体系结构：
 *    由于不同的数据结构(数据的组织，存储方式，所以Java为我们提供了不同的集合)
 *    但是由于不同的集合他们的功能都是相似，不断的向上提取，将共性抽取出来，这就是集合体系机构形成的原因
 * 
 * 
 * 
 */
import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		
	ArrayList al = new ArrayList();
	al.add("hello");
	al.add("world");
	al.add("java");
	
	for (int i = 0; i < al.size(); i++) {
		System.out.println(al.get(i));
	}
	}

}
