package com.itpractice7;
/*
 * 	У��qq����
* 		Ҫ�������5-15λ
* 		0���ܿ�ͷ
* 		���붼������
	
	�������ʽ������һ�׹��򣬿�������ƥ���ַ���
	
	boolean matches(String regex) ���жϵ�ǰ�ַ����Ƿ�ƥ��ָ�����������ʽ�����ƥ���򷵻�true�����򷵻�false
* 
*  
 */
public class RegexDemo {

	public static void main(String[] args) {
		String qq = "12345";
	/*	boolean flag = checkQQ(qq);
		System.out.println(flag);
*/
		boolean flag = qq.matches("[1-9][0-9]{4,14}");
		System.out.println(flag);
		}
	
	public static boolean checkQQ(String qq){
		  
		int length = qq.length();
        if(length < 5 || length > 15){
        	return false;
        }
		
//        0���ܿ�ͷ
        if(qq.startsWith("0")){
        	return false;
        }
//        �����ַ���
        for (int i = 0; i < qq.length(); i++) {
        	char c = qq.charAt(i);
        	if(c <'0' || c>'9'){
        		return false;
        	}
			
		}
		return true;//����Ҫ��
		
	}

}