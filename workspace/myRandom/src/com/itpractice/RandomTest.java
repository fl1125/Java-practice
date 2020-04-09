package com.itpractice;

import java.util.Random;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class RandomTest {

	public static void main(String[] args) {
		
		Random r =new Random();
		int number = r.nextInt(100) + 1;
		System.out.println("plase give a number!");
		while(true){
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			
			if(x > number){
                  System.out.println("big");
		}else if(x < number){
			System.out.println("small");
		}else{
			System.out.println("biggo");
			break;
		}
		}
		
	}

}
