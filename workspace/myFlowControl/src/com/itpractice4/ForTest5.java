package com.itpractice4;

//  统计水仙花数共有多少个

public class ForTest5 {

	public static void main(String[] args) {
	  	int num = 0;
		
	  	for(int x=100; x<1000; x++){
      
        	int ge = x%10;
        	int shi = x/10%10;
        	int bai = x/10/10%10;
        	if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == x){
        	
        	   num++;
        		
        		
        	}	
        } 
        System.out.println("num:"+num);
		
	}

}
