package com.itpractice;

/*
 * 不同包之间的互相访问
 *      使用类的全名
 *      使用关键字import将类导入
 *      
 * 类的全名：包名.类名
 */
public class PackageDemo2 {
    public static void main(String[] args) {
//		相同包下的类可以直接访问，不需要做其他操作
    	PackageDemo pd = new PackageDemo();
    	
    	
	}
}
