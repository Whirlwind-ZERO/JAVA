package ��������Ӧ�ð���;

import java.util.Random;
import java.util.Scanner;

/*
 * ����:��ʾ�û�������������,����һ����Χ�������������Χ�ڵ�һ������
 * */
public class Scannerʹ��2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("�����뿪ʼ��Χ:");
		int a=in.nextInt();
		System.out.print("�����������Χ:");
		int b=in.nextInt();
        System.out.println("��������:"+(a+(int)(Math.random()*(b-a+1))));
        
	    
	    
	}

}
