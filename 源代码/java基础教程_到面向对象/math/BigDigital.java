package math;

import java.math.BigDecimal;
import java.math.BigInteger;

/*Biginteger
 * ���������⾫��
 * 
 * BigDecimal
 * ���⾫��С��
 * 
 * */
public class BigDigital {

	public static void main(String[] args) {
		BigInteger i1=new BigInteger("99");//ֻ�������ַ���
		BigInteger i2=BigInteger.valueOf(99999999);
		
		System.out.println("�ӷ�\t"+i2.add(new BigInteger("1")));
	//���⻹�� substract multiply divide remainder����
    //pow compareTo max min equals
		
		BigInteger a=new BigInteger("123456");
		BigInteger b=new BigInteger("5678");
		System.out.println(a+"��"+b+"�������"+a.gcd(b));
		
		
		BigDecimal d=new BigDecimal("3.14");
		BigDecimal e=new BigDecimal(3.14);
		BigDecimal c=BigDecimal.valueOf(3.14);//���ָ�ֵ��ʽ
		
	}

}
