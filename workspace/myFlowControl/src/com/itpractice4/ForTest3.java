package com.itpractice4;

//求出1-100之间的偶(奇)数和

public class ForTest3 {

	public static void main(String[] args) {
    int sum=0;
    for(int x=1; x<=100;x++){
    	
    	if(x%2==0){
    		sum += x;
    	}else{
//    		sum += x;
    		
    	}
    }
    System.out.println("sum:"+sum);
	}

}
