package ��������Ӧ�ð���;

import java.util.Scanner;

/* ����̨����
 * import java.util.Scanner;
 * Scanner in=new Scanner(System.in);
 * String s=in.nextLine();
 * int i=in.nextInt();
 * double d=in.nextDouble();
 * 
 * ��֪:Բ�����ʽΪ3.14159*r^2
 * ����:��ʾ�û�����һ��Ԫ�İ뾶(������),�����ԪԲ����������
 * 
 * */
public class Scannerʹ�� {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("������r�뾶:");
		double r=in.nextDouble();
		System.out.println("��Բ�������:"+Math.pow(r, 2)*3.14159);
		

	}

}
