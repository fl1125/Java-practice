package com.itpractice;



/*
 * ����дһ�����������ܿ��Գɼ���������Գɼ��ķ�Χ��0-100֮�����������������������쳣
 * 
 * throws:�����쳣��һ�ַ�ʽ�����쳣�׳����ɵ�����������
 * throw:�����쳣�ķ�ʽ,���ҽ�������
 * 
 * ע�⣺����׳���throw�����Ǳ���ʱ���쳣�������ڷ����������׳���throws��
 * 
 * ����Զ���һ���쳣���أ�
 * 		�ǳ��򵥣�дһ����ȥ�̳�Exception����RuntimeException��Ȼ��ʵ�ֶ�����켴��
 * 
 *  */
public class ExceptionDemo7 {

     public static void main(String[] args) {
	     
    	 try {
        	 checkScore(1020);
		} catch (Exception e) {
//		   System.out.println(e.getMessage());
			e.printStackTrace(); 
		}
    
    	 
    	 /*	
		boolean flag = checkScore(100);
		System.out.println(flag);
	}
    public static boolean checkScore(int score){
    	if (score<0 || score>100){
    		return false;
		}
    	
    	return true;*/
     }
    	  public static void checkScore(int score) {
          	if(score < 0 || score > 100){
          		throw new MyException("���Գɼ�������Ҫ��");
//          		throw new Exception("���Գɼ�������Ҫ��");
           	}
          	 System.out.println("�ɼ�����Ҫ��");
          }
}