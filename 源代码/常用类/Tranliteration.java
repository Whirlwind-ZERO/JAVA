package ������;
/* һ��������
 * ����1����д���
 * */
public class Tranliteration {

	public static String amountInWords(double n){	
		/*
		 * ��д���
		 * ����5λ����2λС���Ľ��뽫��ת��Ϊ���Ĵ�д���
		 * 89735.12->�����Ǫ�����ʰ��ԲҼ�Ƿ���
		 * */
		int total=(int) (n*100),tmp,i=0;
		int start=1000000;
		String digt="��Ǫ��ʰԲ�Ƿ�";
		String s="��Ҽ��������½��ƾ�ʰ";
		String result="";
		while(start!=0){
			tmp=total/start;
			total=total%start;
			start/=10;
			result=result+s.charAt(tmp)+digt.charAt(i++);
		}
		return result;
	}
	
	


}
