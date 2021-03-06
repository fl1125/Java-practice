package com.itpractice;
/* 	
 * 	篮球运动员和教练
	乒乓球运动员和教练
	现在篮球运动员和教练要出国访问,需要学习英语
	请根据你所学的知识,分析出来哪些是类,哪些是抽象类,哪些是接口
 */
public class InterfaceTest {

	public static void main(String[] args) {
//	创建篮球运动员对象
		BasketBallPlayer bp = new BasketBallPlayer();
		bp.name = "jordan";
		bp.age = 23;
		bp.gender = "man";
		bp.sleep();
		bp.study();
		bp.speak();
		System.out.println("------");
//  创建乒乓球教练对象
		PingpangballCoach pb = new PingpangballCoach();
		pb.name = "guoqiang";
		pb.age = 25;
		pb.gender = "man";
		pb.sleep();
		pb.eat();
	
		
		

	}

}
class Person{
//	定义成员变
	String name;
	int age;
	String gender;
//   无参构造
	public Person(){}
//   有参构造
	public Person(String name,int age, String gender){
		this.name = name;
		this.age  = age;
		this.gender = gender;
	}
	
	public void eat(){
		 System.out.println("eating");
	}
	public void sleep(){
		System.out.println("sleeping");
	}
}
//学习说英语
interface SpeakerEnglish{
	public abstract void speak();
}
//运动员
abstract class Player extends Person{
	public abstract void study();
}
//教练
abstract class Coach extends Person{
	public abstract void teach();
}
//篮球运动员
class BasketBallPlayer extends Player  implements SpeakerEnglish{

	@Override
	public void study() {
		System.out.println("学拍球");
		
	}

	@Override
	public void speak() {
	System.out.println("说英语");	
	}
	
}
//乒乓球运动员
 class PingpangPlayer extends Player{

	@Override
	public void study() {
		System.out.println("学抽球");
		
	}
	
} 
//篮球教练
 class BasketballCoach extends Coach implements SpeakerEnglish{

	@Override
	public void teach() {    
        	System.out.println("教拍球");
        }

	@Override
	public void speak() {
		System.out.println("说英语");
	}		
	
	 
 }
//乒乓球教练
 class PingpangballCoach extends Coach{

	@Override
	public void teach() {    
        	System.out.println("教抽球");
        }		
 }