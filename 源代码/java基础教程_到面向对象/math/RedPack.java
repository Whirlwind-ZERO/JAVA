package math;

import java.util.Random;
import java.util.Scanner;

public class RedPack {
	public static void main(String[] args){
		System.out.println("-----΢�ź��-----");
		Scanner sc=new Scanner(System.in);
		System.out.println("������ܽ��:");
		double total=sc.nextDouble();
		double bagCount=sc.nextInt();
		
		Random c=new Random();
		
		double min=0.01;
		for(int i=1;i<=bagCount;i++) {
			/*
			 * */
			double max=total-(bagCount-i)*min;
			double bound=max-min;
			//double safe=c.nextInt((int)(bound*100))/100;
			double safe=c.nextInt((int)(bound*100))/100;
			double money=safe+min;
			total=total-money;
			System.out.println("��"+i+"�����"+String.format("%.2f", money)+"Ԫ");
			System.out.println("��"+bagCount+"�����"+String.format("%.2f", total));
			sc.close();
		}
	}

}
