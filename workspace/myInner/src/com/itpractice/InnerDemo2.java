package com.itpractice;
/*
 *  ��Ա�ڲ������η���
 *     ���ǿ���ʹ��Ȩ�����η����γ����ڲ��࣬�������ʹ��˽�������Σ��������������޷�����
 *     ���ǿ���ʹ��static���γ�Ա�ڲ��࣬�����Ͳ��ô����ⲿ���� 
 * 
 * 
 * 
 */
import com.itpractice.Outer.Inner;

public class InnerDemo2 {

	public static void main(String[] args) {
	Outer2.Inner2 i = new Outer2.Inner2();
	i.function();
	
	Outer2.Inner2.function();

	}

}


class Outer2{
    public void method(){
    	 Inner2 i = new Inner2();
    }	
    
    static class Inner2{
      
    	 public static void function(){
	         System.out.println("function");
	   
      }
    } 
}


