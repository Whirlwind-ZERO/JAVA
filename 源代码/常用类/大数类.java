package ������;

import java.math.*;


/*
 * java�л������������ܴ洢����������������2��63�η�-1
 * ��Ӧ��ʮ��������9223372036854775807,Ҳ����˵ֻҪ��������л�
 * ������������ͻ��������������Ӷ���ɴ���
 * 
 * ��java.math.*�����ṩ�˴����࣬�������Ͽ��Դ洢����λ�Ĵ�����ֻҪ�ڴ��㹻�Ļ���
�������ַ�Ϊ�����͸�����.��BigInteger and BigDecimal
������Ķ�����ֱ�ӽ������㣬��Ҫ����������Ӧ�ķ���,���ҷ����Ĳ�������͵��õ�����ͬ,BigInteger���ܵ���BigDecimal, ������Ϊ�䷽������, �������͸��������ܻ������.
���������һЩ���õķ���������Ҫ���ᣬ��Ҫ�õ�ʱ���java API�����ˡ�
 * */
public class ������ {

	public static void main(String[] args) {
		BigInteger a;//����ʹ�ù����� BigInteger a=new BigInteger("123456789101112131415");
		BigDecimal b;
		a = BigInteger.valueOf(123456789101112L); //����int��Χ��Ҫ��L
		b = BigDecimal.valueOf(123456.12341235); // ������С��λ�����Զ����� 
        
		BigInteger c,d;
		d=BigInteger.valueOf(987654321);
		c=a.add(d);//�����ļӷ�
		System.out.println(c);
		
		
		c=a.subtract(d);//����
		System.out.println(c);
		
		c=a.multiply(d);
		System.out.println(c);
		
		c=a.divide(d);
		System.out.println(c);
		
		c=a.mod(d);
		System.out.println(c);
		
		c = a.gcd(d);//���Լ��
		System.out.println(d);
		
		c = a.max(d); //a,b�е����ֵ
		d = a.min(d); //a,b�е���Сֵ
		
		int e;
		e=a.compareTo(d);//����1��0 -1
		
		//����ת�� ��111110��Ϊ10���Ƹ�ֵ��a
		BigInteger w=new BigInteger("1111110",2);
		System.out.println(a.toString(16));//��aת��Ϊ16���Ƶ��ַ������
		
		
		b.toBigInteger(); // ��BigDecimalתΪBigInteger
	    //a.toBigDecimal(); // ��BigIntegerתΪBigDecimal
	  
	    //����ģʽ
		//divide(BigDecimal divisor, int scale, RoundingMode roundingMode) ����һ��
		//BigDecimal ����ֵΪ (this / divisor) ����С��λ��Ϊscale��
	
	    //	a = a.setScale(4,BigDecimal.ROUND_HALF_UP);//�������뱣����λС��
	}

}
