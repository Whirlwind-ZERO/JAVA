package ��������Ӧ�ð���;

import java.util.Scanner;

public class �жϻ��� {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("�������ַ�:");
		String s=in.nextLine();
		
		int low=0,high=s.length()-1;//ע��'\0'
		
		while(s.charAt(low)==s.charAt(high)&&high>=low) {
			high--;
			low++;
		}
		
		if(low>high) {
			System.out.println(s+"�ǻ���");
		}
		else {
			System.out.println(s+"���ǻ���");
		}
	}

}
