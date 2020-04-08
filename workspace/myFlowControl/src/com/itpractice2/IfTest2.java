package com.itpractice2;

import java.util.Scanner;

public class IfTest2 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入成绩");
	int a = sc.nextInt();
	if(a>100 || a<0){
		System.out.println("输入成绩有误");
	}
	else if(a>=90&&a<=100){
		System.out.println("该生成绩为优秀");
	}
	else if(a>80&&a<90){
		System.out.println("该生成绩为好");
	}else if(a>=70&&a<80){
		System.out.println("该生成绩为良");
	}else if(a>=60&&a<70){
		System.out.println("该生成绩为及格");
		
	}else if(a<60){
		System.out.println("该生成绩为不及格");
	}
}
}
