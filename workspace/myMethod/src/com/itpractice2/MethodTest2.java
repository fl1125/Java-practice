package com.itpractice2;

//дһ��������������ˮ�ɻ�����ӡ����

public class MethodTest2 {

	public static void main(String[] args) {
	   shuixianhua();

	}
    public static void shuixianhua(){
    	for(int x=100; x<1000; x++){
    		int a = x%10;
    		int b = x/10%10;   	
    		int c = x/10/10%10;
    		if((a*a*a+b*b*b+c*c*c) == x){
    			System.out.println(x);
    		}
    	}
    } 
}
