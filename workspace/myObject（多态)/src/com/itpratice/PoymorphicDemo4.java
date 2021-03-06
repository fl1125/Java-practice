package com.itpratice;
/*
 *	
 * 	多态的优缺点
 * 		优点：可以提高可维护性（多态前提所保证的），提高代码的可扩展性
		缺点：无法直接访问子类特有的成员
 */
public class PoymorphicDemo4 {

	public static void main(String[] args) {
        MiFactory factory = new MiFactory();
        factory.createPhone(new MiNote());
        factory.createPhone(new RedMi());
        
	}

}
interface Phone{
   public void call();	
}

class MiFactory{
//	public void creatrPhone(MiNote mi){
//		mi.call();
//	}
//	public void creatrPhone(RedMi mi){
//		mi.call();
//}
	 public void createPhone(Phone p){
		 p.call();
	 }
}
class MiNote implements Phone{
	public void call(){
	    System.out.println("打电话");
	}
}
class RedMi implements Phone {
	public void call(){
		System.out.println("打电话2");
	}
}
