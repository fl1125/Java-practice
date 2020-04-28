package com.itpractice;

import java.io.File;
import java.io.IOException;

/*
 * 	创建功能
 * 		boolean createNewFile()  
 * 		boolean mkdir()  
 * 		boolean mkdirs()  
 * 	删除功能
 * 		boolean delete() 
 * 
 *  绝对路径：固定不可改变的路径，以盘符开头
 *  相对路径：相对某个参照物，不能以盘符开头
 *  		在eclipse中相对路径相对应当前项目的根目录
 *  
 *  
 *  注意：删除一个文件夹，这个文件夹下面不能有其他的文件和文件夹

 */
public class FileDemo2 {

	public static void main(String[] args) throws IOException {
	
//		File f = new File("d:\\java-pratice\\a.txt");//绝对路径
		File f2 = new File("a.txt");//相对路径
		
//		System.out.println(f2.createNewFile());
//		
        File f3 = new File("b");
//        System.out.println(f3.mkdir());
        
        File f4 = new File("c\\d\\e");
        System.out.println(f4.mkdirs());
        
        System.out.println();
        
        System.out.println(f2.delete());
        
        System.out.println(f3.delete());
        
        System.out.println(f4.delete());
	}
	
}
