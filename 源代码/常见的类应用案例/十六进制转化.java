package ��������Ӧ�ð���;

import java.util.Scanner;

/*
 * ��ʾ�û�����0-15�е�һ�������ó�����ת��Ϊʮ�����Ʊ�ʾ���ĵ����ַ������
 * ����:�û�ֻ������0-15���� ������Integer.toHexһϵ�з���
 * */
public class ʮ������ת�� {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("������һ��0-15������:");
		int n=in.nextInt();
		char Hex=(char) (n>9?('A'+(n-10)):('0'+n));
		System.out.println(n+"��ʮ������:"+Hex);
	}

}
