package ��������Ӧ�ð���;

import java.util.Scanner;

/*
 * ��ͨ���꣺���������4�ı����ģ��Ҳ���100�ı�����Ϊ��ͨ���꣨��2004�ꡢ2020��������꣩��
 * �������꣺����������������ģ�������400�ı��������������꣨��1900�겻���������꣬2000�����������꣩��
 * (year%4==0&&year%100!=0)||year%400==0
 * 
 * ���û�����ͬʱ���Զ����ݣ��û�����"-1"ʱ,��ֹ����
 * 
 * */
public class case9_��while�ظ��ж����� {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int year=1;
		while(year!=-1) {
			System.out.print("���������(����-1�˳�):");
			year=in.nextInt();
			if((year%4==0&&year%100!=0)||year%400==0) 
				System.out.println("������!");
			else if(year!=-1) {
				System.out.println("��������");
			}
		System.out.println("�������н���");
		
		}
	}
}


