package itpractice_01;
/*
 * 
 *  %:���ڻ�ȡ�����������ʱ������
 *  /�����ڻ�ȡ�����������ʱ����
 *  +: ���ӷ�����(�ַ��μӼӷ����㣬��ʵ�����ַ��ڼ�����д��������ֵ�����������)
 *            'A'65  'a'97 '0'48
 *             �ַ�������ӷ����㣬��ʵ���Ĳ��Ǽӷ����㣬�����ַ�����ƴ��
 *  ++,--:�����Լ������ڶԱ����ļ�1���1������ʹ�õ�ʱ��++��--���ڱ�����ǰ����ߺ��棬���һ��
 *                              ��������������ʱ��++�ں��棬���ñ�����������Ȼ�������++
 *                              ++��ǰ�棬�ȱ���++��Ȼ���ٱ���������  
 *
 */
public class OperatorDemo2 {

	public static void main(String[] args) {
	 
	 int a =3;
	 int b =5;
	 System.out.println(b/a);
	 System.out.println(b%a);
	 System.out.println(a+b);
//	�ַ�����ӷ����� 
	 char c = 'A';
	 System.out.println(a + c);
//	�ַ�������ӷ�����
	 System.out.println("hello"+a); 
	 System.out.println("hello"+a+b); 
	 System.out.println(a+b+"hello"); 
//	++����ʾ 
	 a++;
	 System.out.println("a:"+a); 
	}

}