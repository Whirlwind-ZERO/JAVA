package base;
/*������������
 * ��������:
 * byte--1�ֽ�
 * short--2�ֽ�
 * int--4�ֽ�
 * long--8�ֽ� ����ʱ������Ҫ��L long a=123L; long c=123L+34L;
 * Ĭ�ϵ�������int
 * 
 * ʮ����
 * int a=33;
 * �˽���
 * int b=033;
 * ʮ������
 * int c=0x33;
 * 
 * ��������������������
 * float--4�ֽ�  float a=1.1f;
 * double--8�ֽ�
 * Ĭ��������double
 * ����ֵ������׼
 * 
 * 4.35*100=434.99999
 * ��Ҫʹ��Math.round������������
 * 
 * double a=0.1;
   double b=2.0-1.9;
 * ʹ��ȡ����ֵ����Math.abs()����С��1e-6���Ƚ�
 * 
 * char����
 * char����unicode���� 0-65536
 * ������ͬ�ķ���char a='a'; char b='��'; char c='2';
 * char a=97;  char b=277721; char c=50;
 * ��θ�char������ֵ������
 * ת���ַ�
 * \'
 * \"
 * \\
 * \t
 * \r �س�
 * \n ����
 *\f ��ҳ
 * 
 * 
 * ��������
 * boolean a=true,b=false;
 * 
 * */


public class Basic_data_type {
	public static void main(String[] args) {
//		double a=4.35*100;
//		System.out.println(a);
//		System.out.println(Math.round(a));
		
		double a=0.1;
		double b=2.0-1.9;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		System.out.println(Math.abs(a-b)<1e-6);
		
//		System.out.println("[\\]");
//		System.out.println("[\']");
//		System.out.println("[\"]");
//		System.out.println("[\101]");
//		System.out.println("[\t]");
	}

}
