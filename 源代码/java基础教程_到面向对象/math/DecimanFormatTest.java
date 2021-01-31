package math;

import java.text.DecimalFormat;

/*ʮ�������ָ�ʽ����
 * 
 * DecimalFormat df=new DecimalFormat('###');
 * 
 * DecimalFormat df=new DecimalFormat();
 * df.applyPattern("###");
 * 0 ����ռλ�������û������ʾ0
 * # ����ռλ�������û������ʾ
 * .С����ָ���
 * ,����ָ���
 * 'ת���ַ�
 * %�������ֳ�100��ʾΪ�ٷ���
 *\u2030�����ֳ���1000��ʾΪǧ����
 * 
 * */

public class DecimanFormatTest {
	
	static void format(String pattern,double values) {
		DecimalFormat df=new DecimalFormat(pattern);
		System.out.println(values);
		System.out.println(pattern);
		System.out.println(df.format(values));
		System.out.println("------------------------------");
	}

	public static void main(String[] args) {
		format("000",123);
		format("###,###.###$",123456.234);
		format("0.0\u2030",0.0344);
		

	}

}
