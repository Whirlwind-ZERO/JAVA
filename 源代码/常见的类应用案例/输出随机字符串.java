package ��������Ӧ�ð���;

import java.util.Scanner;
/*
 * ��֪�ַ���Χ��0000-FFFF
 * ����
 *   �û�����һ������
 *   �������ɸó��ȵ��ַ�����ÿ���ַ����������
 *   ������ַ���
 * */
public class �������ַ��� {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
	    char a;
	    String s="";
		for(int i=0;i<=n;i++) {
		s=s+(char)(Math.random()*0xFFFF+1);
		}
		System.out.println("����ַ�����:"+s);

	}

}
