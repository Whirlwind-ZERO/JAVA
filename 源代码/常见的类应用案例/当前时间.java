package ��������Ӧ�ð���;
/*
 * ��֪:
 *   System.currentTimeMillis() ����1970-1-1�������ĺ�����,long��
 *   
 *   ���ϵͳ��ǰʱ��,��ʽΪ ʱ:��:��
 *   
 *   ���ܵ���Date��Calendar API
 * */

public class ��ǰʱ�� {

	public static void main(String[] args) {
		long totalms=System.currentTimeMillis();//0��
		long totals=totalms/1000;
		long currents=totals%60;
		
		long totalmin=(totals-currents)/60;
		long currentmin=totalmin%60;
		
		long totalh=(totalmin-currentmin)/60;
		long currenth=totalh%24;
		System.out.println(String.format("%dH:%dM:%dS", currenth+8,currentmin,currents));//��Ҫ��8 �����ڶ�����

	}

}
